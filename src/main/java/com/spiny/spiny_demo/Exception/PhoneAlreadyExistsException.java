package com.spiny.spiny_demo.Exception;

public class PhoneAlreadyExistsException extends RuntimeException
{
    public PhoneAlreadyExistsException(String message)
    {
        super(message);
    }
}
