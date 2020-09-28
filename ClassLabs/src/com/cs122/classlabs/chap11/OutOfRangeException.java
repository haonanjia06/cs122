package com.cs122.classlabs.chap11;


//********************************************************************
//  OutOfRangeException.java       Author: Lewis/Loftus
//
//  Represents an exceptional condition in which a value is out of
//  some particular range.
//********************************************************************

public class OutOfRangeException extends Exception
{
    //-----------------------------------------------------------------
    //  Sets up the exception object with a particular message.
    //-----------------------------------------------------------------
    OutOfRangeException(String message)
    {
        super(message);
    }
}
