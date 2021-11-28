package com.pwc.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CountryName {

    private String common;
    private String official;

    @JsonIgnore
    private Object nati;

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    @JsonProperty("native")
    public Object getNati() {
        return nati;
    }

    public void setNati(Object nati) {
        this.nati = nati;
    }
}
