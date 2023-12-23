package week_16_assignment.test;

import org.junit.jupiter.api.Test;
import week_16_assignment.java.SubscriptionManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSubscriptionManager {

  SubscriptionManager manager = new SubscriptionManager();

  @Test
    public void testFreeTierEmailNotificationEnabledAutoRenewal(){
      String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
              SubscriptionManager.NotificationPreference.EMAIL,
              SubscriptionManager.AutoRenewal.ENABLED);

      assertEquals("Subscription Configured: Tier=FREE, Notification=EMAIL, " +
              "AutoRenewal=ENABLED", result);
  }

  @Test
  public void testFreeTierSmsNotificationEnabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
            SubscriptionManager.NotificationPreference.SMS,
            SubscriptionManager.AutoRenewal.ENABLED);

    assertEquals("Subscription Configured: Tier=FREE, Notification=SMS, " +
            "AutoRenewal=ENABLED", result);
  }

  @Test
  public void testFreeTierNoneNotificationEnabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
            SubscriptionManager.NotificationPreference.NONE,
            SubscriptionManager.AutoRenewal.ENABLED);

    assertEquals("Subscription Configured: Tier=FREE, Notification=NONE, " +
            "AutoRenewal=ENABLED", result);
  }

  @Test
  public void testFreeTierEmailNotificationDisabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
            SubscriptionManager.NotificationPreference.EMAIL,
            SubscriptionManager.AutoRenewal.DISABLED);

    assertEquals("Subscription Configured: Tier=FREE, Notification=EMAIL, " +
            "AutoRenewal=DISABLED", result);
  }

  @Test
  public void testFreeTierSmsNotificationDisabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
            SubscriptionManager.NotificationPreference.SMS,
            SubscriptionManager.AutoRenewal.DISABLED);

    assertEquals("Subscription Configured: Tier=FREE, Notification=SMS, " +
            "AutoRenewal=DISABLED", result);
  }

  @Test
  public void testFreeTierNoneNotificationDisabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.FREE,
            SubscriptionManager.NotificationPreference.NONE,
            SubscriptionManager.AutoRenewal.DISABLED);

    assertEquals("Subscription Configured: Tier=FREE, Notification=NONE, " +
            "AutoRenewal=DISABLED", result);
  }

  @Test
  public void testStandardTierEmailNotificationEnabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
            SubscriptionManager.NotificationPreference.EMAIL,
            SubscriptionManager.AutoRenewal.ENABLED);

    assertEquals("Subscription Configured: Tier=STANDARD, Notification=EMAIL, " +
            "AutoRenewal=ENABLED", result);
  }

  @Test
  public void testStandardTierSmsNotificationEnabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
            SubscriptionManager.NotificationPreference.SMS,
            SubscriptionManager.AutoRenewal.ENABLED);

    assertEquals("Subscription Configured: Tier=STANDARD, Notification=SMS, " +
            "AutoRenewal=ENABLED", result);
  }

  @Test
  public void testStandardTierNoneNotificationEnabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
            SubscriptionManager.NotificationPreference.NONE,
            SubscriptionManager.AutoRenewal.ENABLED);

    assertEquals("Subscription Configured: Tier=STANDARD, Notification=NONE, " +
            "AutoRenewal=ENABLED", result);
  }

  @Test
  public void testStandardTierEmailNotificationDisabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
            SubscriptionManager.NotificationPreference.EMAIL,
            SubscriptionManager.AutoRenewal.DISABLED);

    assertEquals("Subscription Configured: Tier=STANDARD, Notification=EMAIL, " +
            "AutoRenewal=DISABLED", result);
  }

  @Test
  public void testStandardTierSmsNotificationDisabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
            SubscriptionManager.NotificationPreference.SMS,
            SubscriptionManager.AutoRenewal.DISABLED);

    assertEquals("Subscription Configured: Tier=STANDARD, Notification=SMS, " +
            "AutoRenewal=DISABLED", result);
  }

  @Test
  public void testStandardTierNoneNotificationDisabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.STANDARD,
            SubscriptionManager.NotificationPreference.NONE,
            SubscriptionManager.AutoRenewal.DISABLED);

    assertEquals("Subscription Configured: Tier=STANDARD, Notification=NONE, " +
            "AutoRenewal=DISABLED", result);
  }

  @Test
  public void testPremiumTierEmailNotificationEnabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
            SubscriptionManager.NotificationPreference.EMAIL,
            SubscriptionManager.AutoRenewal.ENABLED);

    assertEquals("Subscription Configured: Tier=PREMIUM, Notification=EMAIL, " +
            "AutoRenewal=ENABLED", result);
  }

  @Test
  public void testPremiumTierSmsNotificationEnabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
            SubscriptionManager.NotificationPreference.SMS,
            SubscriptionManager.AutoRenewal.ENABLED);

    assertEquals("Subscription Configured: Tier=PREMIUM, Notification=SMS, " +
            "AutoRenewal=ENABLED", result);
  }

  @Test
  public void testPremiumTierNoneNotificationDisabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
            SubscriptionManager.NotificationPreference.NONE,
            SubscriptionManager.AutoRenewal.ENABLED);

    assertEquals("Subscription Configured: Tier=PREMIUM, Notification=NONE, " +
            "AutoRenewal=ENABLED", result);
  }

  @Test
  public void testPremiumTierEmailNotificationDisabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
            SubscriptionManager.NotificationPreference.EMAIL,
            SubscriptionManager.AutoRenewal.DISABLED);

    assertEquals("Subscription Configured: Tier=PREMIUM, Notification=EMAIL, " +
            "AutoRenewal=DISABLED", result);
  }

  @Test
  public void testPremiumTierSmsNotificationDisabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
            SubscriptionManager.NotificationPreference.SMS,
            SubscriptionManager.AutoRenewal.DISABLED);

    assertEquals("Subscription Configured: Tier=PREMIUM, Notification=SMS, " +
            "AutoRenewal=DISABLED", result);
  }

  @Test
  public void testPremiumTierNoneNotificationEnabledAutoRenewal(){
    String result = manager.configureSubscription(SubscriptionManager.SubscriptionTier.PREMIUM,
            SubscriptionManager.NotificationPreference.NONE,
            SubscriptionManager.AutoRenewal.ENABLED);

    assertEquals("Subscription Configured: Tier=PREMIUM, Notification=NONE, " +
            "AutoRenewal=ENABLED", result);
  }
}
