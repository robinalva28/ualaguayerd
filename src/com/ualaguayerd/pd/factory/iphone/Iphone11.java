package com.ualaguayerd.pd.factory.iphone;

public class Iphone11 extends Iphone{
    Iphone11(){
        this.getInfo();
    }
    @Override
    public String getInfo() {
        return "Iphone11 creado";
    }

    @Override
    public String toString() {
        return "Iphone11{}";
    }
}
