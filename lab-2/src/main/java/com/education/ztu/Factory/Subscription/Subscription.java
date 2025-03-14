package com.education.ztu.Factory.Subscription;

import java.util.List;

public interface Subscription {
    public double getMonthlyFee();
    public int getMinimumPeriod();
    public List<String> getChannels();
    public List<String> getFeatures();
}
