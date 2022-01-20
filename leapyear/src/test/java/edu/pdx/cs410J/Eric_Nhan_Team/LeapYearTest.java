package edu.pdx.cs410J.Eric_Nhan_Team;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Acceptance Criteria (Listed)
 * - All years divisible by 400 are leap years (ex year 2000)
 * - All years divisible by 100 but not by 400 are NOT leap years
 *   (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year)
 * - All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 2016),
 * - All years not divisible by 4 are NOT leap years (e.g. 2017, 2018, 2019).
 */
public class LeapYearTest {

  private LeapYear getLeapYear(){
    return new LeapYear();
  }

  @Test
  void canInstantiateKataClass() {
    new LeapYear();
  }

  @Test
  void numberDivisibleBy400IsALeapYear(){
    final int YEAR = 2000;
    LeapYear leapYear = getLeapYear();
    assertThat("isLeapYear()", leapYear.isLeapYear(YEAR), equalTo(true));
  }

  @Test
  void yearDivisibleBy100AndNotBy400IsNotALeapYear(){
    final int YEAR = 2100;
    LeapYear leapYear = getLeapYear();
    assertThat("isLeapYear()", leapYear.isLeapYear(YEAR), equalTo(false));
  }

  @Test
  void yearDivisibleBy4ButNotBy100AreLeapYears(){
    final int YEAR = 2400;
    LeapYear leapYear = getLeapYear();
    assertThat("isLeapYear()", leapYear.isLeapYear(YEAR), equalTo(true));
  }

  @Test
  void yearNotDivisibleBy4IsNotALeapYear(){
    final int YEAR = 2401;
    LeapYear leapYear = getLeapYear();
    assertThat("isLeapYear()", leapYear.isLeapYear(YEAR), equalTo(false));
  }


}
