package com.example.demo.config;

import com.example.demo.model.Context;
import com.example.demo.model.LineOfBusiness;
import com.example.demo.model.Project;
import com.example.demo.model.Region;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@ToString
@Component
@ConfigurationProperties
public class Parameter {

    private Context context;
    private Region region;
    private LineOfBusiness lob;
    private List<Project> projects;

}
