/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo.dijkstra;

import java.util.Scanner;

/**
 * Equipo Conformado Por:
 * Cruz Lopez Edgar Jesus
 * Martinez Huicochea Victor Hugo
 * Trejo Cortes Brandon Alexis
 */



public class AlgoritmoDijkstra {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Instanciamos los objetos para su posterior uso
        Ubicaciones IMP=new Ubicaciones();
        MaxMin INF=new MaxMin();
        Scanner D=new Scanner(System.in);
        
        
        
        
        // Declarasmos variables
        int i,j,dest,min,buscador,aux;
        int vertices=13;
        
        /**Instanciamos las variables, entre ellas 
         * un algoritmo que almacene los tiempos y otro se usara como memoria
         * para el camino recorrido, así mismo creamos una "caseta" o mejor dicho
         * semaforo para saber por donde hemos pasado
         */
        int dist[]=new int[vertices];
        int camin[]=new int[vertices];
        boolean caseta[]=new boolean[vertices];
        
        /**cargamos el grafo ya con los pesos, los cuales
         * representan el número de días que se tardaría en recorrer 
         * el mapa. Tomando como base la velocidad de una carabela
         * espanola de 15 km/h, y usando la regla de tres en el mapa podemos 
         * conocer cuanto tiempo (En dias) se tardaria en llegar de un lugar a otro
         */
        int Grafo[][]={
               {0,5,0,0,15,0,0,0,0,0,0,0,0},
               {5,0,0,0,11,0,0,0,0,0,0,0,0},
               {0,0,0,0,7,0,0,0,0,0,0,0,0},
               {0,0,0,0,9,0,0,0,0,0,0,0,0},
               {15,11,7,9,0,5,7,0,0,0,0,0,0},
               {0,0,0,0,5,0,3,4,3,0,0,0,0},
               {0,0,0,0,7,3,0,1,2,0,0,0,0},
               {0,0,0,0,0,4,1,0,2,5,0,0,0},
               {0,0,0,0,0,3,2,2,0,6,0,0,0},
               {0,0,0,0,0,0,0,5,6,0,7,8,11},
               {0,0,0,0,0,0,0,0,0,7,0,0,5},
               {0,0,0,0,0,0,0,0,0,8,0,0,4},
               {0,0,0,0,0,0,0,0,0,11,5,4,0}
                };

        
        
        
        
        //Pedimos el destino
        IMP.Ubics();
        System.out.println("Digite el destino:");
        dest=D.nextInt();
        dest=dest-1;
        System.out.println("Eligio: ");
        IMP.imprimir(dest);
        System.out.println("");
        System.out.println("");
        
        
        
        /**dist almacenara los tiempos entre los vertices,
         * iniciara en un número muy alto exepto por uno y se irá
         * recorriendo en busqueda de su valor más pequeno**/
        INF.inic(vertices, dist, dest);
        INF.conv(vertices, Grafo);
        //marcamos la caseta de quien pase (Todos False)
        INF.transf(vertices, caseta);
        
        
        //iniciamos 
        for(i=0;i<vertices;i++){
            //buscamos el tiempo minimo almacenado en dist.
            min=INF.chiquito(caseta, dist, vertices);
            /**El vertice por donde ya se paso el tiempo minimo pasa a
             * pasarse como "marcado" o que ya se paso por ahi
             */
            caseta[min]=true;
            /**recorremos el array en busqueda de datos en el grafo, 
             * esto buscando cualquier número que no sea 999 (El maximo)
             */
            for(buscador=0;buscador<vertices;buscador++){
                //usamos un auxiliar que va calculando un nuevo tiempo
                aux=dist[min]+Grafo[min][buscador];
                // si el dato no es 999 y el tiempo actual es mayor al tiempo nuevo
                if(Grafo[min][buscador]!=999 && dist[buscador]>aux){
                    //El nuevo tiempo se almacena
                    dist[buscador]=aux;
                    //almacenamos el camino
                    camin[buscador]=min;
                }
            }
        }
        
        //mostramos el grafo
        INF.mostrador(dist, camin, vertices);
    } 
    
}
