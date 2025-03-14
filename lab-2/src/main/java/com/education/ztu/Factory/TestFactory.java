package com.education.ztu.Factory;

import com.education.ztu.Factory.Subscription.Subscription;
import com.education.ztu.Factory.SubscriptionCreator.ManagerCall;
import com.education.ztu.Factory.SubscriptionCreator.MobileApp;
import com.education.ztu.Factory.SubscriptionCreator.SubscriptionCreator;
import com.education.ztu.Factory.SubscriptionCreator.WebSite;

public class TestFactory {
    public static void main(String[] args) {
        SubscriptionCreator webSite = new WebSite();
        SubscriptionCreator mobileApp = new MobileApp();
        SubscriptionCreator managerCall = new ManagerCall();

        Subscription premium = webSite.createSubscription();
        Subscription educational = mobileApp.createSubscription();
        Subscription domestic = managerCall.createSubscription();

        System.out.println("Website Subscription: " + premium.getChannels());
        System.out.println("Mobile App Subscription: " + educational.getChannels());
        System.out.println("Manager Call Subscription: " + domestic.getChannels());
    }
}
