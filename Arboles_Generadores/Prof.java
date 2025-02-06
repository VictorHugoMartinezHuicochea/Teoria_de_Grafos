package Gra;
import java.util.ArrayList;
public class Prof {
    int vv=0;
    public void copiarv(int v){
        vv=v;
        System.out.println(vv+"\n");
    }
    public int [][] g= new int[vv][vv] ;
    public void copiar_arr(int [][] gg){
        g=gg;
        for(int i=0; i<vv;i++){
            for(int j=0 ; j<vv;j++){
                System.out.print(" | ");System.out.print (g[i][j]); System.out.print(" | ");
            }
            System.out.println();
        }
    }
    boolean [] visitado_profundidad = new boolean[20];
    public ArrayList<Integer> recorridoprofundidad(int nodoI) {
        //System.out.println("Creando el arraylist recorridos  vv="+vv);
        // creamos la lista donde guardaremos los recorridos
        ArrayList<Integer> recorridos = new ArrayList<>();
        System.out.println("Arraylist creado con exito");
        visitado_profundidad[nodoI]=true; // el nodo inicial ya está visitado
        // cola de visitas de nodes adyacentes
        ArrayList<Integer> cola = new ArrayList<>();
        recorridos.add(nodoI); // marcamos el nodo y lo agregamos a recorrido
        cola.add(nodoI);//Se agrega el nodo a la cola de visitados
        while(!cola.isEmpty()){ // Hasta que visite todos los nodos
            int j = cola.remove(0); // se saca el primer nodo de la cola
            // se busca en la matriz que representa el grafo los nodos adyacentes
            for (int i=0;i<g.length;i++){
                // Si es un nodo adyacente y no esta visitado entonces:
                if (g[i][j]==1 && !visitado_profundidad[i]){
                    cola.add(i); // Se agrega a la cola de visita
                    // se recorren los hijos del nodo actual de visita y se agrega el recorrido a la lista
                    recorridos.addAll(recorridoprofundidad(i));
                    visitado_profundidad[i]=true; // se marca como visitado
                }
            }

        }

        return recorridos; // se devuelve el recorrido en profundidad del grafo
    }
}
