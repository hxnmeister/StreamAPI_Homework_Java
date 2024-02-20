package com.ua.project.task3.exceptions;

public class IncorrectRangeException extends RuntimeException {
    public IncorrectRangeException(String message) {
        super(message);
    }
    public IncorrectRangeException(int rangeBegin, int rangeEnd) {
        this("Incorrect range from \"" + rangeBegin + "\" to \"" + rangeEnd + "\"!");
    }
}
