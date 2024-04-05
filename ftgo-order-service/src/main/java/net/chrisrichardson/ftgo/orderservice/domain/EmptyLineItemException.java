package net.chrisrichardson.ftgo.orderservice.domain;

public class EmptyLineItemException extends RuntimeException {
  public EmptyLineItemException() {
    super("Line Item must not be empty.");
  }
}
