package com.pwc.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Country {

    private CountryName name;
    private String cca3;
    private String region;
    private String subregion;
    private List<String> borders;
    private String cca2;
    private String ccn3;
    private String cioc;
    private String independent;
    private String status;
    private boolean unMember;
    private boolean landlocked;
    private int area;
    private String flag;

    @JsonProperty("latlng")
    @JsonIgnore
    private Object latlng;

    @JsonProperty("tld")
    @JsonIgnore
    private Object tld;

    @JsonProperty("currencies")
    @JsonIgnore
    private Object currencies;

    @JsonProperty("idd")
    @JsonIgnore
    private Object idd;

    @JsonProperty("capital")
    @JsonIgnore
    private Object capital;

    @JsonProperty("altSpellings")
    @JsonIgnore
    private Object altSpellings;

    @JsonProperty("languages")
    @JsonIgnore
    private Object languages;

    @JsonProperty("translations")
    @JsonIgnore
    private Object translations;

    @JsonProperty("demonyms")
    @JsonIgnore
    private Object demonyms;

    public CountryName getName() {
        return name;
    }

    public void setName(CountryName name) {
        this.name = name;
    }

    public String getCca3() {
        return cca3;
    }

    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public String getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public String getCcn3() {
        return ccn3;
    }

    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public String getIndependent() {
        return independent;
    }

    public void setIndependent(String independent) {
        this.independent = independent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isUnMember() {
        return unMember;
    }

    public void setUnMember(boolean unMember) {
        this.unMember = unMember;
    }

    public boolean isLandlocked() {
        return landlocked;
    }

    public void setLandlocked(boolean landlocked) {
        this.landlocked = landlocked;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
