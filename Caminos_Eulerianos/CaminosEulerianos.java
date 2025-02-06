/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caminoseulerianos;

import java.util.Scanner;

/**
 * Materia: Teoria de Grafos
 * 
 * Equipo Conformado Por:
 * Martinez Cruz Fernando
 * Martinez Huicochea Victor Hugo
 * Trejo Cortes Brandon Alexis
 */
public class CaminosEulerianos {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // Declaramos e instanciamos variables
        Scanner Ins=new Scanner(System.in);
        DebilEuler DE=new DebilEuler();
        Euler E = new Euler();
        
        
        int v,i,j,suma,impar;
        boolean euler=true;
        boolean debileuler=true;
        
        
        //Pedimos la cantidad de vertices
        System.out.println("Bienvenido al programa que te dice si un camino es Euleriano");
        System.out.println("Por favor digite el numero de vertices");
        v=Ins.nextInt();
        
        //Instanciamos donde se guardara el grafo
        int[][] grafo=new int[v][v];
        
        //Pedimos el grafo
        System.out.println("Por favor digite su matriz de adyacencia");
        for(i=0;i<v;i++){
            System.out.println("Fila "+(i+1)+": ");
            for(j=0;j<v;j++){
                System.out.print((j+1)+": ");
                grafo[i][j]=Ins.nextInt();
            }
        }
        
        //Inicializamos variables
        suma=0;
        impar=0;
        
        //Recorremos el grafo
        for(i=0;i<v;i++){
            for(j=0;j<v;j++){
                //Sumamos los grados del vertice
                suma+=grafo[i][j];
            }
            //Si la suma es impar
            if(suma%2!=0){
                //Aumentamos cuantos vertices impares tiene
                impar++;
            }
            //Reseteamos la suma
            suma=0;
        }
        
        //Si no tiene vertices impares, es euleriano
        if(impar==0){
            System.out.println("El grafo es Euleriano");
            E.Camino(grafo, v);
        }
        else{
            //Si tiene solamente dos vertices impares es debilmente euleriano
            if(impar==2){
                System.out.println("El grafo es Debilmente Euleriano");
                DE.camino(grafo, v);
            }
            else{
                //Si no entonces no es ni debilmente euleriano ni euleriano
                System.out.println("El grafo no es Euleriano ni Debilmente Euleriano");
            }
        }
        
    }s
}
