package com.education.ztu.Factory.Subscription;

import java.util.Arrays;
import java.util.List;

public class DomesticSubscription implements Subscription {
    @Override
    public double getMonthlyFee() {
        return 10.0;
    }

    @Override
    public int getMinimumPeriod() {
        return 6;
    }

    @Override
    public List<String> getChannels() {
        return Arrays.asList("Local News", "Entertainment", "Kids");
    }

    @Override
    public List<String> getFeatures() {
        return Arrays.asList("Standard Definition", "Basic Support");
    }
}

