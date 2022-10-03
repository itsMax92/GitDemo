package com.example.demo;

import com.example.demo.config.Parameter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Slf4j
@Service
@EnableConfigurationProperties(value = Parameter.class)
public class FileReaderService {

    @Autowired
    private Parameter parameter;

    @PostConstruct
    public void init() {
        log.info("Inside nit");
        System.out.println("Context: " + parameter.getContext());
    }
}
