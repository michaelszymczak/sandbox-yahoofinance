package com.michaelszymczak.foo

import spock.lang.Specification

import java.time.LocalDate
import java.time.Month

class QuoteShould extends Specification {
  def "take data from provided line"() {
    given:
    Quote quote = new Quote('2017-02-15,819.359985,823.00,818.469971,818.97998,1304000,818.97998')

    expect:
    quote.date == LocalDate.of(2017, Month.FEBRUARY, 15)
    quote.open == new BigDecimal("819.359985")
    quote.high == new BigDecimal("823.00")
    quote.low == new BigDecimal("818.469971")
    quote.close == new BigDecimal("818.97998")
    quote.volume == new BigDecimal("1304000")
    quote.adjClose == new BigDecimal("818.97998")
  }
}
