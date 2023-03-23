package Ejercicio2.dominio;

import java.util.Arrays;

/*Copyright [año] [Luis Miguel Urbez Villar]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
either express or implied. See the License for the specific
language governing permissions and limitations under the
License.*/
public class Tablero {
    private static int DIMENSION = 30;
    private int[][] estadoActual;

    private int[][] estadoSiguiente = new int [DIMENSION][DIMENSION];

    public void leerEstadoActual(){
        for (int i = 0; i< DIMENSION; i++){
            for(int j = 0; j< DIMENSION; j++){
                System.out.println(estadoActual);
            }
        }
    }

    public double generarEstadoActual(){
        int areaCuadrado = 4;
        int puntosTotales = 10000;
        double pi;
        double cuenta = 0;

        for (int i = 0; i< DIMENSION; i++){
            for(int j = 0; j< DIMENSION; j++){
                double x = Math.random();
                double y = Math.random();

                if (x*x + y*y <= 1){
                    cuenta++;
                }
            }
        }
        pi =(cuenta/puntosTotales)* areaCuadrado;
        return pi;
    }

    public void transitarAlEstadoSiguiente(){
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                int vecinosVivos = contarVecinosVivos(i, j);
                if (vecinosVivos == 3) {
                    estadoSiguiente[i][j] = 1;
                } else if (vecinosVivos == 2) {
                    estadoSiguiente[i][j] = estadoActual[i][j];
                } else {
                    estadoSiguiente[i][j] = 0;
                }
            }
        }
    }
    public int contarVecinosVivos(int i, int j){
        int vecinosVivos = 0;
        for (i = 0; i < DIMENSION; i++) {
            for (j = 0; j < DIMENSION; j++) {
                if (j < DIMENSION - 1 && estadoActual[i][j + 1] == 1) {
                    vecinosVivos++;
                }
                if (i < DIMENSION - 1 && j > 0 && estadoActual[i + 1][j - 1] == 1) {
                    vecinosVivos++;
                }
                if (i < DIMENSION - 1 && estadoActual[i + 1][j] == 1) {
                    vecinosVivos++;
                }
                if (i < DIMENSION - 1 && j < DIMENSION - 1 && estadoActual[i + 1][j + 1] == 1) {
                    vecinosVivos++;
                }
                if (i > 0 && j > 0 && estadoActual[i - 1][j - 1] == 1) {
                    vecinosVivos++;
                }
                if (i > 0 && estadoActual[i - 1][j] == 1) {
                    vecinosVivos++;
                }
                if (i > 0 && j < DIMENSION - 1 && estadoActual[i - 1][j + 1] == 1) {
                    vecinosVivos++;
                }
                if (j > 0 && estadoActual[i][j - 1] == 1) {
                    vecinosVivos++;
                }

            }
        }
        return vecinosVivos;
    }
    @Override
    public String toString() {
       String resultadoFinal = "";
       for(int i = 0; i<DIMENSION; i++){
           for(int j = 0; j< DIMENSION; j++){
               resultadoFinal += + estadoActual[i][j] + " ";
           }
       }
       return resultadoFinal;
    }
}
