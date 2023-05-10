package org.example.service;

public class StringHandlerService {

    private final String text = "This was Diane’s first time in the city, and she enjoyed her opportunities to walk around and explore.";

    public StringHandlerService() {
    }

    public String search(String str) {
        String result = "";
        if (text.contains(str)) {
            result += text.substring(0, text.indexOf(str));
            result += str.toUpperCase();
            result += text.substring(result.length());
        }
        return result;
    }

    public String text() {
        return text;
    }
}
