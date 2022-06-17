package com.gradle.sample;

public class App {

  private int age;

  private String name;

  @BuilderProperty
  public void setAge(int age) {
    this.age = age;
  }

  @BuilderProperty
  public void setName(String name) {
    this.name = name;
  }
}
