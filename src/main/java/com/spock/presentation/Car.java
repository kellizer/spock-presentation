package com.spock.presentation;

/**
 * Created with IntelliJ IDEA.
 * Represents a Car domain.
 */
public class Car {

    private static final int LEGAL_AGE = 16;

    /**
     * Sets the primary Driver for the car.
     *
     * @param driver - the driver
     */
    public void setDriver(Person driver) {
        if (driver.getAge() < LEGAL_AGE)
            throw new DriverTooYoungException(LEGAL_AGE, driver.getAge());
        if (!driver.isDrivingLicenceValid())
            throw new DriverLicenceInvalidException();
    }
}
