/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.buscanovetor;

import java.util.Arrays;

/**
 *
 * @author PC Pedro
 */
public class BuscaNoVetor {

    public static void main(String[] args) {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        int p = Arrays.binarySearch(vet,1);
        for(int valor:vet){
            System.out.print(valor + " ");
        }
        System.out.println(" ");
        System.out.println("Encontrei o valor na posição " + p);
    }
}
