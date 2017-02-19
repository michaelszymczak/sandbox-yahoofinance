package com.michaelszymczak.foo;

import java.io.IOException;
import java.time.LocalDate;

public class App {
    public String getGreeting() {
        return "Hello Foo.";
    }

    public static void main(String[] args) throws IOException {
      new Quotes("GOOG", LocalDate.now()).quotes().forEach(System.out::println);
    }
}
