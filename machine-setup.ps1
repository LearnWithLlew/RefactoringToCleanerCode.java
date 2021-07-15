# To run this script directly, open PowerShell and run this command:
#     PS> Invoke-WebRequest -UseBasicParsing https://raw.githubusercontent.com/LearnWithLlew/RefactoringToCleanerCode.java/master/machine-setup.ps1 | Invoke-Expression

#Requires -RunAsAdministrator

iwr -useb https://raw.githubusercontent.com/JayBazuzi/machine-setup/main/windows.ps1 | iex
iwr -useb https://raw.githubusercontent.com/JayBazuzi/machine-setup/main/java-intellij.ps1 | iex

cinst typora


mkdir C:\Source\
pushd C:\Source\

Set-Alias github $env:LOCALAPPDATA\GitHubDesktop\bin\github.bat
& "C:\Program Files\Git\cmd\git.exe" clone https://github.com/LearnWithLlew/RefactoringToCleanerCode.slides.git
pushd RefactoringToCleanerCode.Slides\
github .
Expand-Archive fonts\playfair-display.zip fonts\install-me
Expand-Archive fonts\pt-serif.zip fonts\install-me
Invoke-Item fonts\install-me
popd


& "C:\Program Files\Git\cmd\git.exe" clone https://github.com/LearnWithLlew/RefactoringToCleanerCode.java.git
pushd RefactoringToCleanerCode.java
github .

# force prompt for credentials
& 'C:\Program Files\Git\cmd\git.exe' push
popd

popd
