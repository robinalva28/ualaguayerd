package com.ualaguayerd.pd.composite.departamentos;

public class App {
    public static void main(String[] args) throws Exception {
        Departamento ventas = new DepartVentas(1, "Departamento de Ventas");
        Departamento financiero = new DepartFinanceiro(2, "Departamento Financiero");
        DepartComposite composite = new DepartComposite(3, "Composite");
          composite.addDepart(ventas);
          composite.addDepart(financiero);
          composite.getName();
    }
}
