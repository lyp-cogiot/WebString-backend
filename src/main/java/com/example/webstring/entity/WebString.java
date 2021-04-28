package com.example.webstring.entity;

public class WebString {
    private String webString;

    public WebString() {
    }

    public WebString(String webString) {
        this.webString = webString;
    }

    public String getWebString() {
        return webString;
    }

    public void setWebString(String webString) {
        this.webString = webString;
    }

    @Override
    public String toString() {
        return "WebString{" +
                "webString='" + webString + '\'' +
                '}';
    }
}
