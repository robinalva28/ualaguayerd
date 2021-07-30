package com.ualaguayerd.pd.composite.departamentos;

public class DepartVentas implements Departamento {
    private int id;
    private String name;

    public DepartVentas(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getName(){
        System.out.println(getClass().getSimpleName());
    }

}
