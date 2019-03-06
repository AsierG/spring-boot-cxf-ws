package com.asierg.wsclientcxf.ws;

import com.asierg.services.helloworld.HelloWorldPortType;
import com.asierg.types.helloworld.Greeting;
import com.asierg.types.helloworld.ObjectFactory;
import com.asierg.types.helloworld.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldClient {

    private final HelloWorldPortType helloWorldProxy;

    @Autowired
    public HelloWorldClient(HelloWorldPortType helloWorldProxy) {
        this.helloWorldProxy = helloWorldProxy;
    }

    public String sayHello(String firstName, String lastName) {

        ObjectFactory factory = new ObjectFactory();
        Person person = factory.createPerson();
        person.setFirstName(firstName);
        person.setLastName(lastName);

        Greeting response = helloWorldProxy.sayHello(person);

        return response.getGreeting();
    }

}
