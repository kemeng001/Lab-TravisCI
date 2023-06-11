import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("ALLCAPS");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest2() {
        myString.setString("lowercase");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest3() {
        myString.setString("About something");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest4() {
        myString.setString("About Something");
        assertTrue(myString.detectCapitalUse());
    }
    
    @Test
    public void detectCapitalUseTest5() {
        myString.setString("about something");
        assertFalse(myString.detectCapitalUse());
    }
    
    @Test
    public void detectCapitalUseTest6() {
        myString.setString(null);
        assertFalse(myString.detectCapitalUse());
    }
    
    @Test
    public void detectCapitalUseTest7() {
        myString.setString("MixedCase");
        assertTrue(myString.detectCapitalUse());
    }
    
    @Test
    public void detectCapitalUseTest8() {
        myString.setString("a");
        assertFalse(myString.detectCapitalUse());
    }
    
    @Test
    public void detectCapitalUseTest9() {
        myString.setString("A");
        assertTrue(myString.detectCapitalUse());
    }
    
}
