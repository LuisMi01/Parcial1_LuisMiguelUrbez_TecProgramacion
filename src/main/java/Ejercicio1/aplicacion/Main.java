package Ejercicio1.aplicacion;

import Ejercicio1.mates.Matematicas;

public class Main {
    public static void main(String[] args) {
        Matematicas op = new Matematicas();
        System.out.println("El numero PI es: "+op.generarNumeroPi(100000));
    }
}
