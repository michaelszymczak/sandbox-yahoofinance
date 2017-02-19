package com.michaelszymczak.foo;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;

public class LinesStream {

  private final DownloadedLinesStream delegate;
  private final ThreadLocal<List<String>> lines;

  public LinesStream(UrlOfDataFromLast12MonthsAsOf url) {
    this.delegate = new DownloadedLinesStream(url);
    this.lines = new ThreadLocal<>();
  }

  private List<String> listOfLines() {

    try {
      if (lines.get() == null) { lines.set(delegate.lines()); }
      return lines.get();
    }
    catch (Exception e)
    {
      e.printStackTrace();
      return emptyList();
    }

  }

  Stream<String> lines() {
    return listOfLines().stream();
  }
}
