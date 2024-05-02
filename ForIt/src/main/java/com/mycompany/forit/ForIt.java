/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.forit;

import java.util.Arrays;

/**
 *
 * @author PC Pedro
 */
public class ForIt {

    public static void main(String[] args) {
        int num[] = {3,5,1,8,4};
        Arrays.sort(num);
        for(int valor:num){
            System.out.print(valor + " ");
        }
        System.out.print("\n");
        double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v);
        for(double valor:v){
            System.out.print(valor + " ");
        }
    }
}
