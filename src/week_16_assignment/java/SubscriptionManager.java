package week_16_assignment.java;

public class SubscriptionManager {

    public enum SubscriptionTier { FREE, STANDARD, PREMIUM }
    public enum NotificationPreference { EMAIL, SMS, NONE }
    public enum AutoRenewal { ENABLED, DISABLED }

    public String configureSubscription(SubscriptionTier tier,
         NotificationPreference notification, AutoRenewal autoRenewal) {

        return "Subscription Configured: Tier=" + tier + ", Notification="
                + notification + ", AutoRenewal=" + autoRenewal;
    }
}
