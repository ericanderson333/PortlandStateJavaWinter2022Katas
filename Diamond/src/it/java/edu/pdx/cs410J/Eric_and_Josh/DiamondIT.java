package edu.pdx.cs410J.Eric_and_Josh;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

class DiamondIT extends InvokeMainTestCase {
  final String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};


  @Test
  void invokingMainWithNoArgumentsHasExitCodeOf1() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class);
    assertThat(result.getExitCode(), equalTo(1));
  }

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void letterAPrintsOutWithNoSpaces(){
    final String LETTER = "A";
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, LETTER);
    assertThat(result.getTextWrittenToStandardOut(), containsString(LETTER));
  }

  @Test
  void letterZPrintsOutAllLettersInAlphabet(){
    final String LETTER = "Z";
    InvokeMainTestCase.MainMethodResult result = invokeMain(Diamond.class, LETTER);
    for(String letter : alphabet){
      assertThat(result.getTextWrittenToStandardOut(), containsString(letter.toUpperCase()+"\n"));
    }
  }


}
