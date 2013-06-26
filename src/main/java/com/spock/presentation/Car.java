package com.spock.presentation;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Represents a Car domain.
 */
public class Car {

    private static final int LEGAL_AGE = 16;
    private BigDecimal milesPerGallonRatio = new BigDecimal(0);
    private BigDecimal fuelTankSize = new BigDecimal(0);
    private BigDecimal currentFuel = new BigDecimal(0);


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

    public void addFuel(final BigDecimal additionalPetrol) {
        BigDecimal newFuelCount = currentFuel.add(additionalPetrol);
        if (newFuelCount.compareTo(fuelTankSize) > 0)
            throw new TooMuchFuelException();
        currentFuel = newFuelCount;
    }


    /**
     * Sets the ratio for this car.
     *
     * @param milesPerGallonRatio - the ratio for mile to a gallon of fuel.
     */
    public void setMilesPerGallonRatio(BigDecimal milesPerGallonRatio) {
        this.milesPerGallonRatio = milesPerGallonRatio;
    }
}
