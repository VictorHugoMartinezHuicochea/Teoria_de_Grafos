package Gra;

import java.util.ArrayList;
import java.util.Scanner;

public class Arboles_Gen {
    public static void main(String[] args) {

        Scanner Busq=new Scanner(System.in);
        Expansion Exp=new Expansion();
        int sel;


        System.out.println("Bienvenido al programa generador de arboles");
        System.out.println("Por favor defina el metodo que quiere utilizar:");
        System.out.println("1| Busqueda por Amplitud");
        System.out.println("2| Busqueda por Profundidad");
        sel=Busq.nextInt();

        switch(sel){
            case 1:
                System.out.println("Usted eligio Busqueda por Amplitud");
                Exp.Expansion();
                break;
            case 2:
                int v=0;
                System.out.println("Usted eligio Busqueda por Profundidad");
                Scanner vert=new Scanner(System.in);
                System.out.println("Por favor digite el numero de vertices");
                v=vert.nextInt();
                int[][] gg=new int[v][v];
                System.out.println(v);
                Prof g=new Prof();
                System.out.println("Digite su matriz de adyacencia");
                for(int i=0;i<v;i++){
                    System.out.println("Fila "+(i+1)+": ");
                    for(int j=0;j<v;j++){
                        System.out.print((j+1)+": ");
                        gg[i][j]=vert.nextInt();
                    }
                }
                g.copiarv(v);
                g.copiar_arr(gg);
                ArrayList<Integer> enprofundidad=g.recorridoprofundidad(0);
                System.out.println("");
                System.out.println("recorrido de un grafo en profundidad representado en matriz: ");
                for(int i=0; i<enprofundidad.size();i++){
                    System.out.println(""+enprofundidad.get(i)+"");
                }

                break;
            default:
                System.out.println("ERROR digite algo valido");
        }



    }

}
