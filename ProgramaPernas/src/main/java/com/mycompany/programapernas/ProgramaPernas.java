/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programapernas;

import java.util.Scanner;

/**
 *
 * @author PC Pedro
 */
public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas Pernas? ");
        int pernas = sc.nextInt();
        String tipo;
        System.out.print("Isso é um(a): ");
        
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6,8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
}
