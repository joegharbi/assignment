

import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.testng.AssertJUnit.assertTrue;

public class LetterCombinationTest {
    @Test
    public void testLetterCombinationsValid() throws Exception {
        List<String> result = LetterCombination.letterCombinations("23");
        Assert.assertEquals(result.toString(),"[ad, ae, af, bd, be, bf, cd, ce, cf]");
    }

    @Test
    public void testLetterCombinationsOtherException() {

        Exception exception = assertThrows(NullPointerException.class, () -> {
            LetterCombination.letterCombinations("12");
        });

        Assert.assertEquals(exception.getMessage(),"Cannot invoke \"String.length()\" because \"option\" is null");
    }

    @Test
    public void testLetterCombinationsLongerThanFourException() {

        Exception exception = assertThrows(Exception.class, () -> {
            LetterCombination.letterCombinations("43533");
        });

        Assert.assertEquals(exception.getMessage(),"digits must be less than 4");
    }
}
