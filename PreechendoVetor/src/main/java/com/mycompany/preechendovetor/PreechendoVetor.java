/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.preechendovetor;

import java.util.Arrays;

/**
 *
 * @author PC Pedro
 */
public class PreechendoVetor {

    public static void main(String[] args) {
        int vet[] = new int [20];
        Arrays.fill(vet,0);
        
        for(int valor:vet){
            System.out.print(valor + " ");
        }
    }
}
