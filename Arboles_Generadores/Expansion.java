package Gra;

import java.util.Scanner;

public class Expansion {
    public void Expansion(){
        //instanciamos objetos nuevos
        Scanner vert=new Scanner(System.in);
        GeneralOP op=new GeneralOP();

        //inicializamos variables
        int v,i,j;


        //vertices
        System.out.println("Por favor digite el numero de vertices");
        v=vert.nextInt();


        //creamos la matriz que contendra al grafo y al arbol generado
        int[][] grafo=new int[v][v];
        int[][] arbol=new int[v][v];
        //creamos una condicianal de vertices que ya pasamos
        boolean[] semaforo=new boolean[v];

        //pedimos el grafo
        System.out.println("Por favor digite su matriz de adyacencia");
        for(i=0;i<v;i++){
            System.out.println("Fila "+(i+1)+": ");
            for(j=0;j<v;j++){
                System.out.print((j+1)+": ");
                grafo[i][j]=vert.nextInt();
                //generamos arbol con todos sus valores 0
                arbol[i][j]=0;
            }
        }

        //inicializamos semaforo con todos false menos el primero, para evitar errores
        for(i=0;i<v;i++){
            semaforo[i]=false;
        }
        semaforo[0]=true;


        //empezamos a generar arbol
        for(i=0;i<v;i++){
            for(j=0;j<v;j++){
                //si semaforo no ha sido visitado y es conexo y no es loop
                if(semaforo[j]==false && grafo[i][j]!=0 && i!=j){
                    //lo marcamos como visitado
                    semaforo[j]=true;
                    //lo unimos al arbol
                    arbol[i][j]=1;
                }
            }

        }

        for(i=0;i<v;i++){
            for(j=0;j<v;j++){
                System.out.print(arbol[i][j]+ "  ");
            }
            System.out.println(" ");
        }







        //para que todo este bien
        for(i=0;i<v;i++){
            if(semaforo[i]==false){
                System.out.println("ERROR NO Puede Geenerarse Arbol del grafo dado, digite los subgrafos que puedan generar arboles generados por separado");
                return;
            }
        }



        //relacion simetrica
        op.simet(arbol, v);

        //imprimimos arbol
        System.out.println("El arbol Generador es: ");
        op.imprimir(arbol, v);



    }
}
