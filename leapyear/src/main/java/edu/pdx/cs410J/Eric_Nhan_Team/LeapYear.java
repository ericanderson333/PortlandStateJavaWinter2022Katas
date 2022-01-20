package edu.pdx.cs410J.Eric_Nhan_Team;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class LeapYear {
  private int year;

  public LeapYear(){}

  public LeapYear(int year){
    this.year = year;
  }

  public boolean isLeapYear(){
    return year % 400 == 0;
  }

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }
}