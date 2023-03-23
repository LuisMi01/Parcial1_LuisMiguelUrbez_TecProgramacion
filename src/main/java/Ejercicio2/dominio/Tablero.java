package Ejercicio2.dominio;

public class Tablero {
    private static int DIMENSION = 30;
    private int[][] estadoActual;

    private int[][] estadoSiguiente = new int [DIMENSION][DIMENSION];

    public void leerEstadoActual(){
        for (int i = 0; i< DIMENSION; i++){
            for(int j = 0; j< DIMENSION; j++){
                estadoActual[i][j] = (int) (Math.random() * 2);
            }
        }
    }


}
