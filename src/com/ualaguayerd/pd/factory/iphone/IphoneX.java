package com.ualaguayerd.pd.factory.iphone;

public class IphoneX extends Iphone{

    IphoneX(){
        this.getInfo();
    }
    @Override
    public String getInfo() {
        return "IphoneX creado";
    }

    @Override
    public String toString() {
        return "IphoneX{}";
    }
}
