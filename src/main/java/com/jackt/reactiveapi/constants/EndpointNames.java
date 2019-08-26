package com.jackt.reactiveapi.constants;

public enum EndpointNames {

    USERS("/users");

    private String value;

    EndpointNames(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String valueNoSlash() {
        return this.value.replaceAll("/", "");
    }
}
