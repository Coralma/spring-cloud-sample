package com.coral.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ccc on 2017/10/31.
 */
@Component
public class ModelProperties {

    @Value("${com.coral.name}")
    private String name;
    @Value("${com.coral.title}")
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
