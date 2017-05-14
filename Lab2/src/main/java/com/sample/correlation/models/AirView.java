package com.sample.correlation.models;

import javafx.beans.property.SimpleDoubleProperty;

public class AirView {

    private SimpleDoubleProperty Flags = new SimpleDoubleProperty();
    private SimpleDoubleProperty Catalog = new SimpleDoubleProperty();
    private SimpleDoubleProperty Length = new SimpleDoubleProperty();
    private SimpleDoubleProperty Elevation = new SimpleDoubleProperty();
    private SimpleDoubleProperty Frequency = new SimpleDoubleProperty();

    public double getFlags() {
        return Flags.get();
    }

    public SimpleDoubleProperty flagsProprety() {
        return Flags;
    }

    public void setFlags(double flags) {
        this.Flags.set(flags);
    }

    public double getCatalog() {
        return Catalog.get();
    }

    public SimpleDoubleProperty catalogProprety() {
        return Catalog;
    }

    public void setCatalog(double catalog) {
        this.Catalog.set(catalog);
    }

    public double getLength() {
        return Length.get();
    }

    public SimpleDoubleProperty lengthProprety() {
        return Length;
    }

    public void setLength(double length) {
        this.Length.set(length);
    }

    public double getElevation() {
        return Length.get();
    }

    public SimpleDoubleProperty elevationProprety() {
        return Elevation;
    }

    public void setElevation(double elevation) {
        this.Elevation.set(elevation);
    }

    public double getFrequency() {
        return Frequency.get();
    }

    public SimpleDoubleProperty frequencyProperty() {
        return Frequency;
    }

    public void setFrequency(double frequency) {
        this.Frequency.set(frequency);
    }

}
