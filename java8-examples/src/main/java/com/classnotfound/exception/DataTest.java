package com.classnotfound.exception;
public class DataTest {

  public static void main(String[] args) {
    try {
      Class.forName("com.journaldev.MyInvisibleClass");

      ClassLoader.getSystemClassLoader().loadClass("com.journaldev.MyInvisibleClass");

      //ClassLoader.getSystemClassLoader().loadClass("com.journaldev.MyInvisibleClass");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

}