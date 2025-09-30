[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=20807479)
# Chapter 1 Lab: ASCII Art and Syntax Errors

Welcome to your first programming lab for CSCD 210!  In this assignment you will
write, compile, run, and refactor a simple Java program that prints a picture
made of text ("ASCII art").  You'll also practice spotting and fixing different
kinds of errors.  This lab covers **Chapter 1** of *Building Java Programs* and
is designed to be self-paced: the essential steps are right here on the page,
while additional hints and explanations live inside collapsible details if you
choose to explore them.

## Overview

By the end of this lab you should be able to:

- Write a complete Java program (class plus `main` method) and run it from the
  terminal with `javac` and `java`.
- Use `System.out.println` (or `System.out.print`) to produce console output.
- Understand why you must **compile** your `.java` file before running it, and
  interpret simple compiler error messages.
- Break a large program into smaller **static methods** to eliminate repetition
  and improve readability.
- Recognise the difference between syntax, runtime, and logic errors and fix
  them.

This repository contains everything you need to complete the lab.  The file you
will edit is **`AsciiArt.java`** in the repository root.  Example solutions and
practice files live under **`examples/`** and **`extras/`**.  There is also a
placeholder `docs/` folder for a GitHub Pages site with extended instructions.
See the directory description at the end of this README for details.

> **Note:** The majority of the instructions are in the numbered steps below.
> Throughout this README you will find `<details>` blocks with hints and
> background.  These are optional; open them only when you want a deeper
> explanation or if you get stuck.

## Part 1 - Write and Run a Simple Program

1. **Create your Java file:** Use your editor to open the provided
   `AsciiArt.java`.  It already contains a public class named `AsciiArt`
   and an empty `main` method.  The class name must **exactly** match the
   filename; Java will complain otherwise.

2. **Print your ASCII art:** Inside `main`, write a series of
   `System.out.println` statements to print your artwork.  Each call prints a
   single line.  Make sure each statement ends with a semicolon.

   - You can include a backslash in the output by writing `"\\"` in the code,
     because a single backslash begins an escape sequence.
   - To print a double quote, escape it as `\"`.
   - Use `System.out.print` instead of `println` if you need to keep output on
     the same line.

3. **Compile the program:** Open a terminal in VS Code and run  
   ```bash
   javac AsciiArt.java
   ```
   This translates your source file into bytecode.  If the compiler
   reports errors, read the messages carefully and fix them before continuing.

4. **Run the program:** Once compilation succeeds, run your program with  
   ```bash
   java AsciiArt
   ```
   You should see your ASCII art printed to the terminal.  Remember that the
   JVM cannot run `.java` files directly - you must compile first.

<details>
<summary><strong>Why compile first?</strong></summary>
<p>
The <code>javac</code> command checks your program for <em>syntax errors</em>
(missing semicolons, unmatched braces, misspelled keywords, etc.) and produces
a <code>.class</code> file containing <em>bytecode</em>.  The <code>java</code>
command runs that bytecode on the Java Virtual Machine.  If you try to run the
source file without compiling, the JVM will complain that it cannot find the
class.  This two-step process makes Java programs
portable and helps catch mistakes early.
</p>
</details>

<details>
<summary><strong>Need inspiration?</strong></summary>
<p>
If you're not sure what to draw, take a look in the <code>examples/</code>
folder.  The file <code>DrawFigures1.java</code> prints a diamond, an X, and a
rocket all in one method.  Feel free to run it with
<code>javac DrawFigures1.java && java DrawFigures1</code> for ideas.  Just don't
copy it into your own file - use it as inspiration to create something unique.
</p>
</details>

## Part 2 - Decompose with Static Methods

1. **Identify repetition:** Once your picture prints correctly, read through
   your code.  Are there groups of lines that repeat or represent a single
   conceptual piece (like the top and bottom of a shape)?  Those are
   opportunities to factor out a method.

2. **Define a helper method:** Above or below `main`, add a new static method.
   For example, if your picture uses the same three lines of a cone multiple
   times, you might write:
   ```java
   public static void drawCone() {
       System.out.println("   /\\");
       System.out.println("  /  \\");
       System.out.println(" /    \\");
   }
   ```
   Defining a method does not run it; you must call it from `main`.

3. **Call the method:** Replace the repeated lines in `main` with a call to your
   helper method, e.g. `drawCone();`.  Your program's output should not change.

4. **Repeat as needed:** Continue grouping related lines into descriptive
   methods until `main` reads like an outline of your picture.  For example,
   you might end up with methods such as `drawDiamond()`, `drawX()`,
   `drawRocket()`, and `drawCone()`.  Look at the
   example files `DrawFigures2.java` and `DrawFigures3.java` for guidance.

5. **Test:** Recompile and run after each change to ensure your output matches
   the original.

<details>
<summary><strong>Why decompose?</strong></summary>
<p>
Breaking a big method into smaller helpers has many benefits: it makes the code
easier to read and maintain, eliminates duplicated text, and enables reuse.
Suppose you print a cone shape four times; with a helper method you define the
cone once and call it four times.  If you decide to
change the cone, you edit one method instead of four spots.  A decomposed
program also shows at a glance what it does - e.g., <code>drawDiamond();</code>,
<code>drawX();</code>, <code>drawRocket();</code> - without distracting details.
</p>
</details>

## Part 3 - Debugging and Error Types

Programming inevitably involves mistakes.  Chapter 1 distinguishes three kinds
of errors:

- **Syntax errors**: Violations of Java's grammar (e.g., missing semicolons or
  braces, wrong capitalization).  The compiler detects these and will not
  produce a `.class` file until you fix them.
- **Runtime errors**: Problems that occur while the program is running (e.g.,
  dividing by zero).  These cause the program to crash even though it compiled
  fine.
- **Logic errors**: The trickiest kind - the program runs but produces
  incorrect output because the logic is wrong.

This repository includes a few extra files to help you practice spotting each
type of error:

1. **`extras/Tricky.java`** - A short program intentionally containing 11 syntax
   mistakes.  Try to compile it with `javac` and read the error messages.
   Fix the errors one by one until it compiles and runs.  Hints are in the lab
   handout.

2. **`extras/RuntimeErrorExample.java`** - A program that compiles but crashes
   at runtime because it divides by zero.  Run it with `javac` and `java` to
   see an `ArithmeticException` and a stack trace.

3. **`extras/LogicErrorExample.java`** - A program that prints `1 + 1 = 11` by
   mistake.  Understand why the output is wrong and fix the logic (hint: add
   parentheses around the arithmetic).

4. **`extras/Ugly.java`** - A working program crammed onto one line.  It shows
   that Java ignores whitespace, but humans appreciate well-formatted code.
   Reformat it with proper indentation as practice.

<details>
<summary><strong>Debugging tips</strong></summary>
<p>
When you encounter an error, start by reading the first compiler or runtime
message - subsequent errors are often cascades caused by that first issue.  Fix
problems from the top of the file downward.  For logic errors, use print
statements to trace variable values or walk through the code mentally to see
where the behavior diverges from your intent.
</p>
</details>

## Directory Overview

The repository is organised as follows:

- **`AsciiArt.java`** - The file you edit for Parts 1-2.  Contains a skeleton
  class with an empty `main` method.
- **`examples/`** - Read-only examples.  You are encouraged to explore these but
  **do not** modify them.
  - `DrawFigures1.java` - A monolithic program that prints multiple shapes.
  - `DrawFigures2.java` - A partially refactored version that introduces helper
    methods.
  - `DrawFigures3.java` - A fully decomposed version using methods such as
    `drawCone()`, `drawBox()`, `drawDiamond()`, `drawX()` and `drawRocket()`.
  - `MethodTrace.java` - A small program demonstrating how method calls work
    and the order in which messages are printed.
- **`extras/`** - Additional practice files.
  - `Tricky.java` - Fix all 11 syntax errors.
  - `RuntimeErrorExample.java` - Observe a runtime crash due to division by zero.
  - `LogicErrorExample.java` - Example of a logic error.
  - `Ugly.java` - A syntactically correct but poorly formatted program.
- **`docs/`** - Placeholder for extended instructions.  Once published, the
  GitHub Pages site for this lab will live here.  For now, see the README and
  the PDF handout.

  - **`ascii_art/`** - A collection of text files containing creative ASCII
    art designs.  Many of these files repeat the same pattern several times
    so you can practice extracting a helper method.  They also include
    characters that require escaping (quotes, backslashes, tabs) to help you
    practice writing string literals.  Feel free to open these files for
    inspiration when creating your own art.

  - **`errors/`** - Sample Java programs that each contain a single syntax
    mistake.  Compile these files to see what the compiler's error
    messages look like, then fix the mistakes.  They are referenced in
    the "Common syntax errors" section of the lab web page.

## Next Steps

1. Complete Parts 1-3 using the instructions above.
2. Explore the `examples/` and `extras/` to deepen your understanding.
3. Commit and push your changes to GitHub.