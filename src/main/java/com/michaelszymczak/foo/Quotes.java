package com.michaelszymczak.foo;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Quotes {

  private final LinesStream linesStream;

  public Quotes(String ticker, LocalDate referenceDate) {
    UrlOfDataFromLast12MonthsAsOf url = new UrlOfDataFromLast12MonthsAsOf(referenceDate, ticker);
    this.linesStream = new LinesStream(url);
  }

  public Stream<Quote> quotes()
  {
    return linesStream.lines().skip(1).map(Quote::new);
  }

}
