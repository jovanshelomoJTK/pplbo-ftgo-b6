package net.chrisrichardson.ftgo.orderservice.domain;

public class InvalidMenuItemQuantityException extends RuntimeException {
  public InvalidMenuItemQuantityException(String menuItemId, int menuItemQuantity) {
    super("Invalid menu item with id " + menuItemId + ": quantity " + String.valueOf(menuItemQuantity) + " is invalid. Quantity must be greater than 0.");
  }
}
