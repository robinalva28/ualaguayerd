package com.ualaguayerd.pd.state.semaforos;

public class EstadoVerde implements EstadoSemaforo{

    private Semaforo objSemaforo;

    public EstadoVerde( Semaforo objSemaforo ) {
        this.objSemaforo = objSemaforo;
    }


    @Override
    public void mostrar() {
        System.out.println("VERDE:   No estamos en alerta");
    }

    @Override
    public void cambioEstado() {
        this.objSemaforo.setEstado(new EstadoAmarillo(this.objSemaforo));
    }
}
