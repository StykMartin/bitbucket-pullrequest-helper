package sk.mstyk.version;

import java.util.Arrays;
import java.util.Objects;

public enum ConfigurationVersion {
    VERSION_1_0("1.0");

    private final String version;

    ConfigurationVersion(String version) {
        this.version = version;
    }

    public static ConfigurationVersion fromVersion(String version) {
        return Arrays.stream(ConfigurationVersion
                .values())
                .filter(configurationVersion -> Objects.equals(configurationVersion.getVersion(), version))
                .findFirst()
                .orElseThrow(() -> new ConfigurationVersionValidationException("Invalid Marigold configuration version: " + version));
    }

    public String getVersion() {
        return version;
    }
}
