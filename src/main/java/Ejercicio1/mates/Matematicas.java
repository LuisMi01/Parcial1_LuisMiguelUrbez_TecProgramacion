package Ejercicio1.mates;

public class Matematicas {
    public double generarNumeroPi(long pasos){
        int puntosTotales = 0;
        int puntosCirculo = 0;
        double x;
        double y;
        double areaCuadrado;
        for (int i = 0; i < pasos; i++){
            x = Math.random();
            y = Math.random();
            if (Math.pow(x, 2) + Math.pow(y, 2) <= 1){
                puntosCirculo++;
            }
            puntosTotales++;
        }
        areaCuadrado = (double) 4 * puntosCirculo / puntosTotales;
        return areaCuadrado;
    }
}
