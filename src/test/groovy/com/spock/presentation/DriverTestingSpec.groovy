package com.spock.presentation

import spock.lang.Specification

/**
 * Created with IntelliJ IDEA.
 * User: iank
 * Date: 26/06/13
 * Time: 09:38
 * To change this template use File | Settings | File Templates.
 */
class DriverTestingSpec extends Specification {

    def "Confirm Underage Driver cannot drive car"() {
        setup:"Setup the Driver & The car"
        def driver = new Person()
        def car = new Car()
        when: "that the driver is underage"
        car.driver=driver
        then: "an exception thrown"
        thrown(DriverTooYoungException)

    }

}