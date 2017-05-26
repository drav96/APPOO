package com.sample.correlation.models;

import com.google.common.base.Converter;


public class ModelToViewConverter extends Converter<double[], AirView> {
    @Override

    protected AirView doForward(double[] array) {
        AirView airView = new AirView();
        airView.setFlags(array[0]);
        airView.setCatalog(array[1]);
        airView.setElevation(array[4]);
        airView.setFrequency(array[3]);
        airView.setLength(array[2]);
        ;
        return airView;
    }

    @Override
    protected double[] doBackward(AirView airView) {
        return null;
    }


}
