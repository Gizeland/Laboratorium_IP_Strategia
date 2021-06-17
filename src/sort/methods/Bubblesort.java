/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

/**
 *
 * @author LeopardProMK
 */
public class Bubblesort {
    private static void b_sort(int tab[]){
    int temp;
    int zmiana = 1;
    while(zmiana > 0)
    {
        zmiana = 0;
            for(int i=0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }
            }
    }
    for(int i=0; i<tab.length; i++){
    System.out.print(tab[i]+" ");}
    }
}
