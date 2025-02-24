
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.pluralsight.NameFormatter;

public class NameFormatterTest {

    @Test
    void testName() {
        // Test case 1: Full name with title and suffix
        String fullName1 = "Dr. Mel B Johnson, PhD";
        assertEquals("Dr. Mel B Johnson, PhD", NameFormatter.format(fullName1));

        // Test case 2: Name with no title but with suffix
        String fullName2 = "Mel B Johnson, PhD";
        assertEquals("Mel B Johnson, PhD", NameFormatter.format(fullName2));

        // Test case 3: Simple name with no title or suffix
        String fullName3 = "Mel Johnson";
        assertEquals("Mel Johnson", NameFormatter.format(fullName3));
    }
}
