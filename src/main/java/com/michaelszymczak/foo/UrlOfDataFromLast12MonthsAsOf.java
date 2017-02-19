package com.michaelszymczak.foo;

import java.time.LocalDate;

public class UrlOfDataFromLast12MonthsAsOf {

  private final LocalDate referenceDate;
  private final String ticker;

  public UrlOfDataFromLast12MonthsAsOf(LocalDate referenceDate, String ticker) {
    this.referenceDate = referenceDate;
    this.ticker = ticker;
  }

  public String url() {
    LocalDate today = referenceDate;
    LocalDate lastYear = referenceDate.minusYears(1);

    return String.format(
            "http://real-chart.finance.yahoo.com/table.csv?s=%s&a=%s&b=%s&c=%s&d=%s&e=%s&f=%s&g=d&ignore=.csv",
            ticker, lastYear.getMonthValue(), lastYear.getDayOfMonth(), lastYear.getYear(), today.getMonthValue(), today.getDayOfMonth(), today.getYear());
  }
}
