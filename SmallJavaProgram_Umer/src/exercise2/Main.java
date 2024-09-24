package exercise2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationFactory factory = new NotificationFactory();

        // Create SMS Notification
        UmerNotification smsNotification = factory.createNotification("SMS");
        smsNotification.notifyUser();

        // Create Email Notification
        UmerNotification emailNotification = factory.createNotification("EMAIL");
        emailNotification.notifyUser();

        // Create Push Notification
        UmerNotification pushNotification = factory.createNotification("PUSH");
        pushNotification.notifyUser();
    }

}
