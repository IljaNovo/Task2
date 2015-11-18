import org.junit.Test;
import static org.junit.Assert.*;

public class MyStringTest {

    @Test
    public void testedForCorrectCalculationMethodOfLengthOfString() throws Exception {
        assertEquals(MyString.countNumberOfSpecifiedCharacterInString("Lalala,", 'l'), 2);
    }

    @Test
    public void testedForCorrectCalculationMethodOfSearchSameElems() throws Exception {
        assertEquals(MyString.searchSameElems("halkalk", "lk"), true);
    }

    @Test
    public void takeTheInputNullMethodOfCountNumberOfSpecifiedCharacterInString() throws Exception {
        assertEquals(MyString.countNumberOfSpecifiedCharacterInString(null, 'l'), -1);
    }

    @Test
    public void takeTheInputNullMethodOfSearchSameElems() throws Exception {
        assertEquals(MyString.searchSameElems(null, null), false);
    }
}