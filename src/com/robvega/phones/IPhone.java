package com.robvega.phones;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringtone) {
        super(versionNumber, batteryPercentage, carrier, ringtone);
    }

    @Override
    public String ring() {
        return String.format("Iphone says %s", this.getRingTone());
    }

    @Override
    public String unlock() {
        return "Unlock via facial recognition";
    }

    @Override
    public void displayInfo() {
        System.out.printf("IPhone %s from %s\n",
                this.getVersionNumber(),
                this.getCarrier());
    }
}

