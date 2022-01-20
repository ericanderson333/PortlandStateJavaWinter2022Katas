package edu.pdx.cs410J.Eric_Nhan_Team;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYear {

  public LeapYear(){}

  public boolean isLeapYear(int year){
    if (year % 400 == 0)
      return true;
    if (year % 100 == 0) {
      return false;
    }
    if(year % 4 == 0){
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }
}