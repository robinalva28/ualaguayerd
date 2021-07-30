package com.ualaguayerd.pd.state.semaforos;

public class Semaforo {

    private EstadoSemaforo objEstadoSemaforo;


    public Semaforo() {
        this.objEstadoSemaforo = new EstadoVerde(this);
    }


    public void setEstado( EstadoSemaforo objEstadoSemaforo ) {
        this.objEstadoSemaforo = objEstadoSemaforo;
    }


    public void cambioEstado() {
        this.objEstadoSemaforo.cambioEstado();
    }


    public void mostrarAviso() {
        this.objEstadoSemaforo.mostrar();
    }
}
