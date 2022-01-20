package edu.pdx.cs410J.Eric_Nhan_Team;

import org.junit.jupiter.api.Test;

/**
 * Acceptance Criteria (Listed)
 * - All years divisible by 400 are leap years (ex year 2000)
 * - All years divisible by 100 but not by 400 are NOT leap years
 *   (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year)
 * - All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
 * - All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
 */
public class LeapYearTest {

  @Test
  void canInstantiateKataClass() {
    new LeapYear();
  }

}