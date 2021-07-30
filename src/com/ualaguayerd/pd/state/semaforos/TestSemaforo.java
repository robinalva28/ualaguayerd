package com.ualaguayerd.pd.state.semaforos;

public class TestSemaforo {
        public static void main(String[] args)
        {
            Semaforo x = new Semaforo();

            // Muestra el aviso por defecto (verde, no hay alerta)

            x.mostrarAviso();
            x.cambioEstado();

            x.mostrarAviso();
            x.cambioEstado();

            x.mostrarAviso();
            x.cambioEstado();

            x.mostrarAviso();
            x.cambioEstado();

            x.mostrarAviso();
            x.cambioEstado();

            x.mostrarAviso();
            x.cambioEstado();

        }
    }
