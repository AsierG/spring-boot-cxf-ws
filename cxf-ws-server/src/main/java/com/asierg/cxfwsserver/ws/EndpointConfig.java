package com.asierg.cxfwsserver.ws;

import org.apache.cxf.Bus;
import javax.xml.ws.Endpoint;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class EndpointConfig {

    private final Bus bus;

    @Autowired
    public EndpointConfig(Bus bus) {
        this.bus = bus;
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint =
                new EndpointImpl(bus, new HelloWorldImpl());
        endpoint.publish("/helloworld");

        return endpoint;
    }
}
