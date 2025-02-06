/*
 * Coloracion de Grafos 
 *
 */
package coloracion;
import java.util.Scanner;
import java.util.LinkedList;

    /**
     * Materia: Teoria de Grafos
     * 
     * Equipo Conformado Por:
     * Martinez Cruz Fernando
     * Martinez Huicochea Victor Hugo
     * Trejo Cortes Brandon Alexis
     */


public class Coloracion {
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaramos e instanciamos variables
        Scanner Ins=new Scanner(System.in);
        LinkedList<Integer> adyacente = new LinkedList<Integer>();
        int v,i,j;
        
        
        //Pedimos la cantidad de vertices
        System.out.println("Bienvenido al programa que colorea vertices");
        System.out.println("Por favor digite el numero de vertices");
        v=Ins.nextInt();
        
        //Instanciamos donde se guardara el grafo
        int[][] grafo=new int[v][v];
        int[] color=new int[v];
        
        
        
        //Pedimos el grafo
        System.out.println("Por favor digite su matriz de adyacencia");
        for(i=0;i<v;i++){
            System.out.println("Fila "+(i+1)+": ");
            for(j=0;j<v;j++){
                System.out.print((j+1)+": ");
                grafo[i][j]=Ins.nextInt();
            }
        }
        
        //Inicializamos donde se guardaran los colores, dandoles un numero "imposible" o que no esperamos abarcar
        for(i=0;i<v;i++){
            color[i]=9999;
        }    
        
        //Recorremos al vertice
        for(i=0;i<v;i++){
            //Toma el color base o original (1)
            color[i]=1;
            
            
            //Checamos los vertices adyacentes
            for(j=0;j<v;j++){
                //Si es adyacente y ya le asignamos una coloracion
                if(grafo[i][j]!=0 && color[j]!=9999){
                    //Lo anadimos a la lista de colores prohibidos
                    adyacente.add(color[j]);
                }
            }
            //Mientras el color este en la lista de colores prohibidos
            while(adyacente.contains(color[i])){
                //Cambiamos de color
                color[i]+=1;
            }
            
            //Reseteamos la lista de prohibidos para el siguiente vertice
            adyacente.clear();
            
            
        }
        
        //Imprimimos la tabla
        System.out.println("TABLA DE COLORES:");
        for(i=0;i<v;i++){
            System.out.println("Vertice:   " +(i+1)+" | Color:   "+color[i]);
        }
        
        
        
    }
    
    
}