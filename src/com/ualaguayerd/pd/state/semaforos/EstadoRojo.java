package com.ualaguayerd.pd.state.semaforos;

public class EstadoRojo  implements EstadoSemaforo{

    private Semaforo objSemaforo;

    public EstadoRojo( Semaforo objSemaforo ) {
        this.objSemaforo = objSemaforo;
    }

    @Override
    public void mostrar() {
        System.out.println("ROJO:   Alerta roja");
    }


    @Override
    public void cambioEstado() {
        this.objSemaforo.setEstado(new EstadoVerde(this.objSemaforo));
    }


}
