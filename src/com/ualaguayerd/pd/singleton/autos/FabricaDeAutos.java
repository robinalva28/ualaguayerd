package com.ualaguayerd.pd.singleton.autos;

public class FabricaDeAutos {
        //atributo estatico del tipo de la clase que contiene la unica instancia
        private static FabricaDeAutos fabricaAutos = new FabricaDeAutos();
        private int totalAutosFiat;
        private int totalAutosFord;
        private int totalAutosVolks;

    private FabricaDeAutos() { //metodo privado
    }

    public String crearAutoVolks() {
            return new String("Auto Volks #" + totalAutosVolks++ + " creado.");
        }

        public String crearAutoFord() {
            return new String("Auto Ford #" + totalAutosFord++ + " creado.");
        }

        public String crearAutoFiat() {
            return new String("Auto Fiat #" + totalAutosFiat++ + " creado.");
        }

        public String generarInforme() {
            return new String("Total de Autos Fiat vendidos: " + totalAutosFiat
                    + "\nTotal de Autos Ford vendidos: " + totalAutosFord
                    + "\nTotal de Autos Volks vendidos: " + totalAutosVolks);
        }
        //metodo que retorna la unica instancia de la clase Singleton
        public static FabricaDeAutos getInstance(){return fabricaAutos;}

    }



