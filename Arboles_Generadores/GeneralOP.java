package Gra;

public class GeneralOP {
    public void imprimir(int arb[][],int v){
        int i,j;
        System.out.println("Matriz de Adyacencia: ");
        for(i=0;i<v;i++){
            for(j=0;j<v;j++){
                System.out.print(arb[i][j]+"  ");
            }
            System.out.println(" ");
        }
    }


    public int[][] simet(int arb[][],int v){
        int i,j;
        for(i=0;i<v;i++){
            for(j=(v-1);j>i;j--){
                arb[j][i]=arb[i][j];
            }
        }
        return arb;
    }
}
