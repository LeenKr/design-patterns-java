public class NotificationClient {

    public static void main(String[] args) {

        Notification notification =
                new EncryptionDecorator(
                        new LoggingDecorator(
                                new EmailNotification()
                        )
                );

        notification.send("Your account balance is low.");
    }
}
