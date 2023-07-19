package org.hillel.hwspringsecurity.exeption;

public class NoSuchProductException extends RuntimeException {

  public NoSuchProductException(String message) {
    super(message);
  }
}
