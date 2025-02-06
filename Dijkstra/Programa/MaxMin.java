/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmo.dijkstra;

/**
 * Equipo Conformado Por:
 * Cruz Lopez Edgar Jesus
 * Martinez Huicochea Victor Hugo
 * Trejo Cortes Brandon Alexis
 */


public class MaxMin {
    Ubicaciones IMP=new Ubicaciones();
    //cambia los valores 0 innecesarios como 999
    public int[][] conv(int v,int[][] g){
        int i,j;
        for(i=0;i<v;i++){
            for(j=0;j<v;j++){
                if(g[i][j]==0){
                    g[i][j]=999;
                }
            }
        }
        return g;
    }
    
    //inicializamos todas los tiempos con numero enorme (exepto el destino)
    public int[] inic(int v,int[] dist,int dest){
        int i;
        for(i=0;i<v;i++){
            dist[i]=999;
        }
        dist[dest]=0;
        return dist;
    }
    
    
    //inicializa la caseta o transforma todo a false
    public boolean[] transf(int v,boolean[] caseta){
        int i;
        for(i=0;i<v;i++){
            caseta[i]=false;
        }
        return caseta;
    }
    
    
    
    public int chiquito(boolean caseta[],int dist[],int v){
        int i,index,valmin;
        //iniciamos el valor minimo del tiempo, este iniciara como todo lo demas en 999
        valmin=999;
        //inicializamos el index
        index=0;

        for(i=0;i<v;i++){
            /**Si la caseta no ha sido pasada y el tiempo es menor al minimo
             * entonces valmin pasa a ser el nuevo tiempo mas pequeno e index ubicará
             * su posicion en el array
             */
            if(caseta[i]==false && dist[i]<valmin){
                valmin=dist[i];
                index=i;
            }
        }
        //una vez pasadas por todos los tiempos, regresamos el index donde se encuentra valmin
        return index;
    }
    
    
    //Muestra el camino desde cada ubicacion
    public void mostrador(int[] dist, int[] camino, int v){
        int temp,i;
        for(i =0 ;i < v ;i++){
            System.out.print("SI INICIAS EN:    ");
            IMP.imprimir(i);
            System.out.println(" ");
            temp = camino[i] ;
            IMP.imprimir(i);
            System.out.print("->");
            while(temp!=0)
            {
                IMP.imprimir(temp);
                System.out.println("->");
                temp = camino[temp] ; 
            }
            System.out.println("Tiempo: "+dist[i] + " Dias");
            
            System.out.println("");
        }
    }
    
}
