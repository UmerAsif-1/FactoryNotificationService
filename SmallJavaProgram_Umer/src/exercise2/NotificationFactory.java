package exercise2;

public class NotificationFactory {
	public UmerNotification createNotification(String type) {
        if (type == null || type.isEmpty())
            return null;
        switch (type) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }

}
