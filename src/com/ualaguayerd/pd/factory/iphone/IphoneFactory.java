package com.ualaguayerd.pd.factory.iphone;

public class IphoneFactory {
    public static Iphone construirIphone(String modelo){
        switch (modelo.toUpperCase()){
            case "X":
                return new IphoneX();
            case "11":
                return new Iphone11();
            default:
                return null;
        }
    }
}
