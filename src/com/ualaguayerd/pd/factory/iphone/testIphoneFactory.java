package com.ualaguayerd.pd.factory.iphone;

import java.util.function.Function;

public class testIphoneFactory
{
    public static void main(String[] args) {

        System.out.println("Ordenando Iphone: " + orderIPhone("x"));

    }

        public static Iphone orderIPhone(String modelo){

            Function<String,Iphone> device = IphoneFactory::construirIphone;

            return device.apply(modelo);
    }
}
