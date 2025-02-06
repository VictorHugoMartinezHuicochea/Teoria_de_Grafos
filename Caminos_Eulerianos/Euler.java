/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caminoseulerianos;
import java.util.Stack;
import java.util.Vector;

/**
 * Materia: Teoria de Grafos
 * 
 * Equipo Conformado Por:
 * Martinez Cruz Fernando
 * Martinez Huicochea Victor Hugo
 * Trejo Cortes Brandon Alexis
 */
public class Euler {
    public void Camino (int[][] grafo, int vertices) {
        int posicion = 1;

        Stack <Integer> pila = new Stack<>();
        Vector <Integer> camino = new Vector<>();

        while (!pila.isEmpty() || contador(grafo[posicion], 0) != 0) {
            if (contador(grafo[posicion - 1], 0) == 0) {
                camino.add(posicion);

                posicion = pila.pop();
            } else {
                for (int i = 0; i < vertices; i++) {
                    if (grafo[posicion - 1][i] == 1) {
                        pila.add(posicion);

                        grafo[posicion - 1][i] = 0;
                        grafo[i][posicion - 1] = 0;

                        posicion = i + 1;

                        break;
                    }
                }
            }
        }

        System.out.println("El camino para el grafo es: ");
        System.out.print("[");
        for (int ruta : camino) {
            System.out.print(ruta + ", ");
        }

        System.out.println(posicion + "]");
    }

    public static int contador(int[] arreglo, int suma) {
        for (int i : arreglo) {
            suma += i;
        }

        return suma;
    }
}
