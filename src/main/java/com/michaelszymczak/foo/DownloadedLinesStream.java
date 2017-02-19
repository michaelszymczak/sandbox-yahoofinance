package com.michaelszymczak.foo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DownloadedLinesStream {
  private final UrlOfDataFromLast12MonthsAsOf url;

  public DownloadedLinesStream(UrlOfDataFromLast12MonthsAsOf url) {
    this.url = url;
  }

  List<String> lines() throws IOException {
    try (InputStream is = new URL(url.url()).openConnection().getInputStream();
         BufferedReader reader = new BufferedReader(new InputStreamReader(is));
         Stream<String> stream = reader.lines()) {
      return stream.collect(Collectors.toList());
    }
  }
}
