package Ejercicio1.mates;
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
