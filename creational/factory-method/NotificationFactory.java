public abstract class NotificationFactory {

    // Factory Method
    public abstract Notification createNotification();

    // Business logic using the product
    public void notifyUser(String message) {
        Notification notification = createNotification();
        notification.send(message);
    }
}
