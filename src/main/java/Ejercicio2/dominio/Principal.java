package Ejercicio2.dominio;

import java.util.concurrent.TimeUnit;

public class Principal {
    public static void main(String[] args) {
        try{
            Tablero tablero = new Tablero();
            System.out.println("Simulacion con tablero leido");

            tablero.leerEstadoActual();
            System.out.println(tablero);
            for(int i = 0; i <= 5; i++) {
                TimeUnit.SECONDS.sleep(1);
                tablero.transitarAlEstadoSiguiente();
                System.out.println(tablero);
            }

            System.out.println("Generacion con tablero por montecarlo");
            tablero.generarEstadoActual();
            System.out.println(tablero);
            for(int i = 0; i <= 15; i++) {
                TimeUnit.SECONDS.sleep(1);
                tablero.transitarAlEstadoSiguiente();
                System.out.println(tablero);
            }
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
