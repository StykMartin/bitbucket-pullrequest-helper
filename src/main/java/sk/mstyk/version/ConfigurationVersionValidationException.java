package sk.mstyk.version;

public class ConfigurationVersionValidationException extends RuntimeException{
    public ConfigurationVersionValidationException(String message) {
        super(message);
    }
}
