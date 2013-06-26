package com.spock.presentation;

import groovy.sql.Sql
import spock.lang.Shared
import spock.lang.Unroll


/**
 * Created with IntelliJ IDEA.
 * User: iank
 * Date: 26/06/13
 * Time: 11:54
 * To change this template use File | Settings | File Templates.
 */
public class DriverFromDBSpec {


    @Shared sql = Sql.newInstance("jdbc:h2:mem:", "org.h2.Driver")

    def setupSpec() {
        sql.execute("create table valid_drivers (id int primary key, age integer, valid_licence boolean)")
        sql.execute("insert into valid_drivers values (1, 20, true)")
    }

    @Unroll
    def "showing off vars list in calc"() {
        given:
        def driver = new Person()
        def car = new Car()

        expect:

        where:
        [age, validLicence] << sql.rows("""select age, valid_licence, amt from valid_drivers""")
    }
}
