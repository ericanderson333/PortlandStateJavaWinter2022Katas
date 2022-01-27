package edu.pdx.cs410J.Eric_and_Josh;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Diamond {
                                                                                    

  public static void main(String[] args) {

    if(args.length < 1) {

      System.err.println("Missing command line arguments");
      System.exit(1);

    }

    if(args[0].length() != 1) {

      System.err.println("Argument must be a single letter");
      System.exit(1);

    }

    char letter = args[0].charAt(0);

    try {
      printFromLetter(letter);
    } catch(IllegalArgumentException e) {

      System.err.println(e.getMessage());
      System.exit(1);

    }

    System.exit(0);

  }

  public static void printFromLetter(char letter) {

    if(letter < 'A' || letter > 'Z')
      throw new IllegalArgumentException("Letter must be between A and Z.");

    int spacesBefore = letter - 'A';
    int spacesBetween = -1;

    // Print ascending letter rows
    char i;
    for(i = 'A'; i <= letter; ++i) {

      // Print spaces before letter
      String before = " ".repeat(spacesBefore);
      System.out.print(before);

      // Print letter
      System.out.print(i);

      // If letter is not first or last row, print spaces between and letter again
      if(spacesBetween >= 0) {

        String between = " ".repeat(spacesBetween);
        System.out.print(between);
        System.out.print(i);

      }

      // New line
      System.out.println();

      // Add
      spacesBetween += 2;
      --spacesBefore;

    }

    spacesBetween -= 4;
    spacesBefore += 2;
    i -= 2;

    for(; i >= 'A'; --i) {

      String before = " ".repeat(spacesBefore);
      System.out.print(before);

      System.out.print(i);

      if(spacesBetween >= 0) {

        String between = " ".repeat(spacesBetween);
        System.out.print(between);
        System.out.print(i);

      }

      System.out.println();

      spacesBetween -= 2;
      ++spacesBefore;

    }

  }

}