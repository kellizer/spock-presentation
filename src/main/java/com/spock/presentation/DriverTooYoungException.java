package com.spock.presentation;

/**
 * Created with IntelliJ IDEA.
 * User: iank
 * Date: 25/06/13
 * Time: 11:48
 * Exception thrown when the drivers age is less that the required age.
 */
public class DriverTooYoungException extends RuntimeException {
    public DriverTooYoungException(int drivingAge, int driverAge) {
        super(String.format("Driving Age is %d however the driver is %d", drivingAge, driverAge));
    }
}
