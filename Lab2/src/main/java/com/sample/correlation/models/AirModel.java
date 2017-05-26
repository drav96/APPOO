package com.sample.correlation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AirModel {

    @JsonProperty("Flags")
    private int Flags;
    @JsonProperty("Catalog")
    private int Catalog;
    @JsonProperty("Length")
    private int Length;
    @JsonProperty("Elevation")
    private int Elevation;
    @JsonProperty("Frequency")
    private double Frequency;


    public int getFlags() {
        return Flags;
    }

    public void setFlags(int Flags) {
        this.Flags = Flags;
    }

    public int getCatalog() {
        return Catalog;
    }

    public void setCatalog(int Catalog) {
        this.Catalog = Catalog;
    }

    public int getLength() {

        return Length;
    }

    public void setLength(int Length) {
        this.Length = Length;
    }

    public int getElevation() {

        return Elevation;
    }

    public void setElevation(int Elevation) {
        this.Elevation = Elevation;
    }

    public double getFrequency() {
        return Frequency;
    }

    public void setFrequency(double Frequency) {
        this.Frequency = Frequency;
    }

}
