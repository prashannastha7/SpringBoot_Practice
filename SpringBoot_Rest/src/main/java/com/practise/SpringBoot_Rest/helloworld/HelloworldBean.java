package com.practise.SpringBoot_Rest.helloworld;

public class HelloworldBean {
    private String message;
    public HelloworldBean(String message) {
        this.message = message; //= message vanako pass garako value. this.message wala message chai instance variable(priv st mes)
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloworldBean{" +
                "message='" + message +
                '}';
    }
}
