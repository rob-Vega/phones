package com.robvega.phones;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
        super(versionNumber, batteryPercentage, carrier, ringtone);
    }

    @Override
    public String ring() {
        return String.format("Iphone says %s", this.getRingTone());
    }

    @Override
    public String unlock() {
        return "Unlock via finger print";
    }

    @Override
    public void displayInfo() {
        System.out.printf("IPhone %s from %s\n",
                this.getVersionNumber(),
                this.getCarrier());
    }
}
