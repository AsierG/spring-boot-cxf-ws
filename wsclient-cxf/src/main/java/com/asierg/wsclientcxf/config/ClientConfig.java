package com.asierg.wsclientcxf.config;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.asierg.services.helloworld.HelloWorldPortType;

@Configuration
public class ClientConfig {

    @Value("${ws.address}")
    private String address;

    @Bean(name = "helloWorldProxy")
    public HelloWorldPortType helloWorldProxy() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean =
                new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(HelloWorldPortType.class);
        jaxWsProxyFactoryBean.setAddress(address);

        return (HelloWorldPortType) jaxWsProxyFactoryBean.create();
    }
}
