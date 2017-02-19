package com.michaelszymczak.foo

import spock.lang.Specification

import java.time.LocalDate
import java.time.Month

class UrlOfDataFromLast12MonthsAsOfShould extends Specification {
  def "should generate url"() {
    given:
    def url = new UrlOfDataFromLast12MonthsAsOf(LocalDate.of(2017, Month.FEBRUARY, 19), "GOOG")

    expect:
    url.url() == "http://real-chart.finance.yahoo.com/table.csv?s=GOOG&a=2&b=19&c=2016&d=2&e=19&f=2017&g=d&ignore=.csv"

  }
}
