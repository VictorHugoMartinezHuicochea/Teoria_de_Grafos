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


public class Ubicaciones {
    public void Ubics(){
        System.out.println("Bienvenido al Google Maps de One Piece :D");
        System.out.println("Ubicaciones:");
        System.out.println("1| Dawn Island");
        System.out.println("2| Conomi Island");
        System.out.println("3| Thriller Island");
        System.out.println("4| Germa 66");
        System.out.println("5| Reverse Mountain");
        System.out.println("6| Sakura Kingdom");
        System.out.println("7| Lulusia Kingdom");
        System.out.println("8| Boin Archipielago");
        System.out.println("9| Skypea");
        System.out.println("10| Gyojin Island");
        System.out.println("11| Wano Kuni");
        System.out.println("12| Pirate Island");
        System.out.println("13| Elbaf Kingdom");
    }
    
    public void imprimir(int a){
        switch(a){
            case 0:
                System.out.print("Dawn Island");
                break;
            case 1:
                System.out.print("Conomi Island");
                break;
            case 2:
                System.out.print("Thriller Island");
                break;
            case 3:
                System.out.print("Germa 66");
                break;
            case 4:
                System.out.print("Reverse Mountain");
                break;
            case 5:
                System.out.print("Sakura Kingdom");
                break;
            case 6:
                System.out.print("Lulusia Kingdom");
                break;
            case 7:
                System.out.print("Boin Archipielago");
                break;
            case 8:
                System.out.print("Skypea");
                break;
            case 9:
                System.out.print("Gyojin Island");
                break;
            case 10:
                System.out.print("Wano Kuni");
                break;
            case 11:
                System.out.print("Pirate Island");
                break;
            case 12:
                System.out.print("Elbaf Kingdom");
                break;
            default:
                System.out.print("ERROR.....");
        }
    }
}
