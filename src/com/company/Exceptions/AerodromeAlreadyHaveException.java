package com.company.Exceptions;

public class AerodromeAlreadyHaveException extends Exception {
    public AerodromeAlreadyHaveException() {
        super("There is already such an airplane at the aerodrome!");
    }
}
