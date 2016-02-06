package com.google.training.helloworld;

import java.util.Date;

public class HelloClass {
    public String message = "Hello World";
    
    public HelloClass () {
    }
    public HelloClass( boolean time){
    	Date date = new Date();
    	this.message = date.toString();
    }
    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }

    public HelloClass(String name, String period) {
    	 this.message = "Good " + period +" , "+ name +" !";
	}

	public String getMessage() {
        return message;
    }
}
