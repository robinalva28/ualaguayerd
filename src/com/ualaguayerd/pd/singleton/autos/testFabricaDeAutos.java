package com.ualaguayerd.pd.singleton.autos;

import java.util.function.Supplier;

public class testFabricaDeAutos {
    public static void main(String[] args) {
        //FabricaDeAutos auto = new FabricaDeAutos(); //descomentar para probar metodo constructor privado
        //expresion lambda para crear autos fiat
        Supplier<String> crearFiat = () -> FabricaDeAutos.getInstance().crearAutoFiat();
        //Method reference trae la instancia Singleton a través de una interfaz funcional Supplier
        Supplier<FabricaDeAutos> instanciaFabrica = FabricaDeAutos::getInstance;

        System.out.println(crearFiat.get());
        System.out.println(instanciaFabrica.get().crearAutoVolks());
        System.out.println(instanciaFabrica.get().crearAutoFord());
        System.out.println(FabricaDeAutos.getInstance().generarInforme());
    }
}
