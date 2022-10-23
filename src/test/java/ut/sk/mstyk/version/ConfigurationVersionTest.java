package ut.sk.mstyk.version;

import org.junit.Test;
import sk.mstyk.version.ConfigurationVersion;
import sk.mstyk.version.ConfigurationVersionValidationException;
import static org.junit.Assert.assertEquals;

public class ConfigurationVersionTest {

    @Test
    public void testValidVersion() {
        String validVersion = "1.0";
        ConfigurationVersion configurationVersion = ConfigurationVersion.fromVersion(validVersion);

        assertEquals(configurationVersion.getVersion(), validVersion);
    }

    @Test(expected = ConfigurationVersionValidationException.class)
    public void testMajorInvalidVersion() {
        String invalidMajorVersion = "2.0";
        ConfigurationVersion configurationVersion = ConfigurationVersion.fromVersion(invalidMajorVersion);
    }

    @Test(expected = ConfigurationVersionValidationException.class)
    public void testMinorInvalidVersion() {
        String invalidMinorVersion = "1.1";
        ConfigurationVersion configurationVersion = ConfigurationVersion.fromVersion(invalidMinorVersion);
    }
}
