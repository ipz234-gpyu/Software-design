package com.education.ztu.Factory.Subscription;

import java.util.Arrays;
import java.util.List;

public class PremiumSubscription implements Subscription {
    @Override
    public double getMonthlyFee() {
        return 20.0;
    }

    @Override
    public int getMinimumPeriod() {
        return 12;
    }

    @Override
    public List<String> getChannels() {
        return Arrays.asList("All Sports", "Movies HD", "Netflix Premium");
    }

    @Override
    public List<String> getFeatures() {
        return Arrays.asList("4K Streaming", "Multi-Device Access", "Priority Support");
    }
}
