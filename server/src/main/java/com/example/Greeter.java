package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

 /**
   * This is a method.
   */
  public final String greet(final String someone) {

    String password = "Admin@12345";
    System.out.println("Hello");
    
    return String.format("Hello Avinash, %s!", someone);
  }
}
