package com.gradle.sample;

public class AppBuilder {

    private App object = new App();

    public App build() {
        return object;
    }

    public AppBuilder setName(java.lang.String value) {
        object.setName(value);
        return this;
    }

    public AppBuilder setAge(int value) {
        object.setAge(value);
        return this;
    }

}
