package com.mrjaffesclass.apcs.mvc.template;

/**
 * This is the message payload class.  Instantiate this class when sending
 * field / value message data for the up/down buttons
 * 
 * @author Roger Jaffe
 * @version 1.0
 */
public class MessagePayload {
  
  private final int delivery;
  
  /**
   * Class constructor
   * @param _field Text field 1 or 2
   * @param _direction Direction (Constants.UP or Constants.DOWN)
   */
  public MessagePayload(int _delivery) {
    delivery = _delivery;
  }
  
  /**
   * Getter method for the package delivery
   * @return delivery value
   */
  public int getDelivery() {
    return delivery;
  }
}
