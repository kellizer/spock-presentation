package com.spock.presentation;

/**
 * Created with IntelliJ IDEA.
 * User: iank
 * Date: 25/06/13
 * Time: 11:46
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private boolean isDrivingLicenceValid;
    private int age;

    public int getAge() {
        return age;
    }

    public boolean isDrivingLicenceValid() {
        return isDrivingLicenceValid;
    }


    /**
     * Invoked when a driving licence has been validated manually.
     * @param drivingLicenceValid - if driving licence has been validated and if valid (or not).
     */
    public void setDrivingLicenceValidated(boolean drivingLicenceValid) {
        isDrivingLicenceValid = drivingLicenceValid;
    }

    /**
     * Sets the current age of the person.
     *
     * @param age - the current age.
     */
    public void setAge(int age) {
        this.age = age;
    }
}
