public class EncryptionDecorator extends NotificationDecorator {

    public EncryptionDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        String encryptedMessage = encrypt(message);
        super.send(encryptedMessage);
    }

    private String encrypt(String message) {
        return "ENCRYPTED(" + message + ")";
    }
}
