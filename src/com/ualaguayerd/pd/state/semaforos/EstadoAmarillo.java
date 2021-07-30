package com.ualaguayerd.pd.state.semaforos;

public class EstadoAmarillo  implements EstadoSemaforo{

    private Semaforo objSemaforo;

     public EstadoAmarillo( Semaforo objSemaforo ) {
        this.objSemaforo = objSemaforo;
    }

    @Override
    public void mostrar() {
        System.out.println("AMARILLO:  Alerta amarillo");
    }

    @Override
    public void cambioEstado() {
        this.objSemaforo.setEstado(new EstadoRojo(this.objSemaforo));
    }

    }
