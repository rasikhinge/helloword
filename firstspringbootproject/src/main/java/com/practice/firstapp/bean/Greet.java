package com.practice.firstapp.bean;

import org.springframework.stereotype.Component;

@Component
public class Greet {

    private String suffix;
    private String prefix;

    public Greet() {
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void geeting(String suffix,String prefix)
    {
        System.out.println(prefix+" "+suffix);
    }
}
