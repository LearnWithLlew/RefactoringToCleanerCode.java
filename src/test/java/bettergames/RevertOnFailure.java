package bettergames;


        import java.io.BufferedReader;
        import java.io.File;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.io.PrintStream;
        import java.nio.charset.StandardCharsets;
        import java.util.stream.Collectors;
        import org.junit.jupiter.api.extension.AfterAllCallback;
        import org.junit.jupiter.api.extension.ExtensionContext;
        import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;


public class RevertOnFailure implements TestExecutionExceptionHandler, AfterAllCallback {
    private static final boolean PRINT_ONLY = false;
    private boolean failures = false;

    public RevertOnFailure() {
    }

    public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
        this.failures = true;
        throw throwable;
    }

    public void afterAll(ExtensionContext context) {
        File gitDir = getRootFolder();
        if (gitDir == null) {
            PrintStream var10000 = System.err;
            File var10001 = new File(".");
            var10000.println("No .git repo found at " + var10001.getAbsolutePath());
        } else {
            if (this.failures) {
                revertGit(gitDir);
            } else {
                commit(gitDir);
            }

        }
    }

    private static File getRootFolder() {
        try {
            File file = (new File(".")).getCanonicalFile();

            do {
                File gitFolder = new File(file, ".git");
                if (gitFolder.exists()) {
                    return file;
                }

                file = file.getParentFile();
            } while(file != null);

            return null;
        } catch (IOException var2) {
            return null;
        }
    }

    private static void revertGit(File gitDir) {
        runOnConsole(gitDir, "git", "clean", "-fd");
        runOnConsole(gitDir, "git", "reset", "--hard", "HEAD");
        System.out.println("Test Failed, reverting...");
    }

    private static void commit(File gitDir) {
       // nothing
    }



    private static String readStream(InputStream inputStream) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

            String var2;
            try {
                var2 = (String)reader.lines().collect(Collectors.joining("\n"));
            } catch (Throwable var5) {
                try {
                    reader.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }

                throw var5;
            }

            reader.close();
            return var2;
        } catch (IOException var6) {
            throw new RuntimeException(var6);
        }
    }

    private static void runOnConsole(File workingDir, String... cmdArgs) throws Error {
        try {
            Process p = Runtime.getRuntime().exec(cmdArgs, (String[])null, workingDir);
            p.waitFor();
            System.out.println(readStream(p.getInputStream()));
            System.out.println(readStream(p.getErrorStream()));
        } catch (InterruptedException | IOException var3) {
            throw new RuntimeException(var3);
        }
    }
}
