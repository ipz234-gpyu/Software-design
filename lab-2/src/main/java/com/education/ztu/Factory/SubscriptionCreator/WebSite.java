package com.education.ztu.Factory.SubscriptionCreator;

import com.education.ztu.Factory.Subscription.PremiumSubscription;
import com.education.ztu.Factory.Subscription.Subscription;

public class WebSite implements SubscriptionCreator {
    @Override
    public Subscription createSubscription() {
        return new PremiumSubscription();
    }
}