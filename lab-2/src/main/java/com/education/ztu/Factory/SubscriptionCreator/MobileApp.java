package com.education.ztu.Factory.SubscriptionCreator;

import com.education.ztu.Factory.Subscription.EducationalSubscription;
import com.education.ztu.Factory.Subscription.Subscription;

public class MobileApp implements SubscriptionCreator {
    @Override
    public Subscription createSubscription() {
        return new EducationalSubscription();
    }
}