package com.education.ztu.Factory.Subscription;

import java.util.Arrays;
import java.util.List;

public class EducationalSubscription implements Subscription {
    @Override
    public double getMonthlyFee() {
        return 8.0;
    }

    @Override
    public int getMinimumPeriod() {
        return 3;
    }

    @Override
    public List<String> getChannels() {
        return Arrays.asList("Discovery", "National Geographic", "History Channel");
    }

    @Override
    public List<String> getFeatures() {
        return Arrays.asList("High Definition", "Parental Control");
    }
}