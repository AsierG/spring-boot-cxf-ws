package com.asierg.cxfwsserver.ws;

import com.asierg.services.helloworld.HelloWorldPortType;
import com.asierg.types.helloworld.Greeting;
import com.asierg.types.helloworld.ObjectFactory;
import com.asierg.types.helloworld.Person;

public class HelloWorldImpl implements HelloWorldPortType {

    @Override
    public Greeting sayHello(Person personRequest) {
        String greeting = "Kaixo " + personRequest.getFirstName() + " "
                + personRequest.getLastName() + "!";

        ObjectFactory factory = new ObjectFactory();
        Greeting response = factory.createGreeting();
        response.setGreeting(greeting);

        return response;
    }
}
