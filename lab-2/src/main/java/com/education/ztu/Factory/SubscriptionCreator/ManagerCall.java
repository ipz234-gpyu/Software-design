package com.education.ztu.Factory.SubscriptionCreator;

import com.education.ztu.Factory.Subscription.DomesticSubscription;
import com.education.ztu.Factory.Subscription.Subscription;

public class ManagerCall implements SubscriptionCreator {
    @Override
    public Subscription createSubscription() {
        return new DomesticSubscription();
    }
}