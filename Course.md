# Run tests manually

* Validate the environment
    * [ ] Run all tests (`Shift-F10`)

# Read this:

## Scenario

We are looking at a large method that we don't understand, and we want to clean up. We are going to "follow our nose", leaning into the places we don't like and pulling out chunks and improving them.

## Starting Rules for today's refactorings

- Automated refactorings "only"
- Commit after each refactoring
- Every refactoring commit prefixed with `r - `
- Rotate typist on commit

## Improvement Loop

1. Identify a smell
2. Improve it
3. Evaluate
4. Commit (or revert)

# Do this

- [ ] ## Activity 1: Extract Paragraphs to methods

    1. Identify a paragraph (a `case`)
    2. Extract a method to an Obvious Nonsense name
    3. Evaluate it at the caller (ignore the body)
    4. Fix or revert and try again
    5. Commit
    6. Repeat until method is small

- [ ] ## Activity 2: Move methods onto new classes

    1. Pick a method
    2. Move into a better class
    3. Evaluate at caller
    4. Commit (or revert)
    5. Repeat until everything is in it's place

- [ ] ## Activity 3: Clean up the main method

    1. Convert `switch` to `if`/`else`, commit
    2. Remove redundant `else` in method, commit
    3. Extract condition to a method with a Nonsense name, commit
    4. Move the method to the corresponding class, commit
    5. Repeat util strong duplication

- [ ] ## Activity 4: Remove duplication

    1. Make similar things identical
    2. Surround each `if` with a block
    3. Apply Refactoring Combo: Provable Undo to make non-static
    4. Make each class non-static
    5. Extract local variables
    6. Extract interface x 1
    7. Apply interface x 3
    8. Use base type x 4
    9. Apply Refactoring Combo: Many-of-one (two, three, four)
    11. Extract list of scorers
    12. Extract apply scorers

# Resources

## Smell: bad names

1. Missing/Misleading -> (Obvious) Nonsense

2. Nonsense -> Honest (but incomplete)

3. Honest -> Honest-and-complete

4. Honest-and-Complete -> Does the right thing

5. Does the right thing -> Intent

6. Intent -> Domain Abstraction

## Refactoring Combo: Provable Undo

**Insight:** A proven-correct refactoring means that the resulting code is the same as the beginning code. Therefore undoing a proven-correct refactoring is also a proven-correct refactoring.

1. Verify that Git shows no changes
2. Execute manual, unproven refactoring
3. Execute automated refactoring to undo #1
4. Save All
5. Verify that Git shows no changes
6. Undo (CTRL-Z) once
7. Commit

## Refactoring Recipe: many-of-one

> This is not a proven-correct refactoring.

Given:

```c#
SOMETYPE somevar = ...;
// do something with somevar
```

Becomes:

```c#
for (SOMETYPE somevar : new SOMETYPE[]{ ... })
{
    // do something with somevar
}
```

1. Add curly braces (`{}`) around the body
2. Prefix with `for (`
3. Replace `=` with `: new SOMETYPE[]{`
4. Replace `;` with `})`


## Homework

* Redo today’s coding exercises on your own computer

    * Start from the code on the [`main` branch](https://github.com/LearnWithLlew/RefactoringToCleanerCode.net)
    * If you want to see the code we wrote together, check the [other branches](https://github.com/LearnWithLlew/RefactoringToCleanerCode.net/branches)
    * Pay attention to:
        * how often you're able to execute a single refactoring - more is better
        * how many times you are able to pull out a paragraph into a new method
* Print out this sheet and keep it on your desk. Over the next week as you're doing your normal work:
    * note when you were able to improve the code with a single, committed refactoring
    * note when you extract a paragraph
    * Make a TODO list of code you wish was better but couldn't improve at this time

