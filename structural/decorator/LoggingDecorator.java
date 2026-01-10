public class LoggingDecorator extends NotificationDecorator {

    public LoggingDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public void send(String message) {
        System.out.println("[LOG] Notification is being sent");
        super.send(message);
    }
}
