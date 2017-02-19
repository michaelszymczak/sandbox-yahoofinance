package com.michaelszymczak.foo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Quote {

  public final String line;
  public final LocalDate date;
  public final BigDecimal open;
  public final BigDecimal high;
  public final BigDecimal low;
  public final BigDecimal close;
  public final BigDecimal volume;
  public final BigDecimal adjClose;

  public Quote(String line) {
    this.line = line;
    String[] fields = line.split(",", -1);
    date = LocalDate.parse(fields[0]);
    open = new BigDecimal(fields[1]);
    high = new BigDecimal(fields[2]);
    low = new BigDecimal(fields[3]);
    close = new BigDecimal(fields[4]);
    volume = new BigDecimal(fields[5]);
    adjClose = new BigDecimal(fields[6]);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Quote quote = (Quote) o;

    if (line != null ? !line.equals(quote.line) : quote.line != null) return false;
    if (date != null ? !date.equals(quote.date) : quote.date != null) return false;
    if (open != null ? !open.equals(quote.open) : quote.open != null) return false;
    if (high != null ? !high.equals(quote.high) : quote.high != null) return false;
    if (low != null ? !low.equals(quote.low) : quote.low != null) return false;
    if (close != null ? !close.equals(quote.close) : quote.close != null) return false;
    if (volume != null ? !volume.equals(quote.volume) : quote.volume != null) return false;
    return adjClose != null ? adjClose.equals(quote.adjClose) : quote.adjClose == null;

  }

  @Override
  public int hashCode() {
    int result = line != null ? line.hashCode() : 0;
    result = 31 * result + (date != null ? date.hashCode() : 0);
    result = 31 * result + (open != null ? open.hashCode() : 0);
    result = 31 * result + (high != null ? high.hashCode() : 0);
    result = 31 * result + (low != null ? low.hashCode() : 0);
    result = 31 * result + (close != null ? close.hashCode() : 0);
    result = 31 * result + (volume != null ? volume.hashCode() : 0);
    result = 31 * result + (adjClose != null ? adjClose.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Quote{" +
            "line='" + line + '\'' +
            ", date=" + date +
            ", open=" + open +
            ", high=" + high +
            ", low=" + low +
            ", close=" + close +
            ", volume=" + volume +
            ", adjClose=" + adjClose +
            '}';
  }
}
