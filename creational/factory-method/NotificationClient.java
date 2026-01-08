public class NotificationClient {

    public static void main(String[] args) {

        NotificationFactory emailFactory = new EmailNotificationFactory();
        emailFactory.notifyUser("Your order has been shipped.");

        NotificationFactory smsFactory = new SmsNotificationFactory();
        smsFactory.notifyUser("Your OTP is 1234.");

        NotificationFactory pushFactory = new PushNotificationFactory();
        pushFactory.notifyUser("You have a new message.");
    }
}
