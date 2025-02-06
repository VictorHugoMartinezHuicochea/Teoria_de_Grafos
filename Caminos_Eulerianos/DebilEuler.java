/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caminoseulerianos;
import java.util.LinkedList;

/**
 * Materia: Teoria de Grafos
 * 
 * Equipo Conformado Por:
 * Martinez Cruz Fernando
 * Martinez Huicochea Victor Hugo
 * Trejo Cortes Brandon Alexis
 */
public class DebilEuler {
    public void camino(int g[][],int v){
        //Declaramos Variables
        int i,j,k,largo,grado,suma;
        //Declaramos una Estructura tipo Cola para Almacenar el camino
        LinkedList<Integer> camino = new LinkedList<Integer>();
        
        //Inicializamos variables
        i=0;
        suma=0;
        largo=0;
        grado=0;
        //identificamos vertice impar para iniciar
        for (j=0;j<v;j++){
            //Vamos sumando los grados de los vertices
            for(k=0;k<v;k++){
                    suma+=g[k][j];
            }
            //Si el grado es impar
            if(suma%2!=0){
            //lo almacenamos
            i=j;
            //acabamos el bucle
            break;
            }
            //si no reiniciamos
            suma=0;
        }

        //reiniciamos suma
        suma=0;
        //Esta variable nos permite saber si el grafo ya no tiene puentes
        boolean pasa=false;
        //Mientras el grafo tenga puentes
        while(pasa==false){
            //Cambiamos la variable de salida
            pasa=true;
            
            //Añadimos donde iniciamos, e iremos guardando cadapaso que demos
            camino.add(i+1);
            
            /*Recorreremos el grafo, buscando cual de los siguientes vertices conectados
             *tiene el mayo grado, quien lo tenga sera el que deberemos cruzar*/
            for(j=0;j<v;j++){
                //Cuando encontremos una arista que conecte
                if(g[i][j]!=0){
                    //Sumaremos sus grados
                    for(k=0;k<v;k++){
                            suma+=g[k][j];
                    }
                    //Si la suma es mayor a la anterior
                    if(suma>largo){
                        //Largo pasa a ser el grado mayor
                        largo=suma;
                        //Almacenamos el vertice por donde iremos
                        grado=j;
                    }
                    //Reseteamos Contador
                    suma=0;
                }
            }
            //Reseteamos Contador
            largo=0;
            /* Una vez obtenido el grado mayor, cruzaremos el puente y lo "quemaremos", es decir
             * disminuiremos su grado en 1, diciendo que ya pasamos por la arista*/
            g[i][grado]-=1;
            g[grado][i]-=1;
            //Al cruzar, marcaremos a I como el vertice actual donde estamos
            i=grado;
            //checamos que el grafo todavia tenga aristas por recorrer, en caso de que si, pasa vuelve a ser false
            for(j=0;j<v;j++){
                for(k=0;k<v;k++){
                    if(g[j][k]!=0){
                        pasa=false;
                    }
                }
            }
        }
        //Agregamos el ultimo punto recorrido
        camino.add(i+1);
        
        
        //Imprimimos el camino
        System.out.println("El camino para el grafo es: ");
        System.out.println(camino);
    }
        
}
