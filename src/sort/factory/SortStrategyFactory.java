/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.factory;

import sort.methods.Bubblesort;
import sort.methods.Insertionsort;
import sort.methods.Quicksort;
import sort.methods.Selectionsort;
import sort.utils.SortStrategyType;
import sort.methods.ISortStrategy;

/**
 *
 * @author asus
 */
public class SortStrategyFactory implements ISortStrategyFactory{
    @Override
    public ISortStrategy createStrategy(SortStrategyType strategyType) {
        ISortStrategy sortStrategy;
        switch (strategyType){
            case Bubblesort -> {
                sortStrategy = new Bubblesort();
            }
            case Insertionsort -> {
                sortStrategy = new Insertionsort();
            }
            case Selectionsort -> {
                sortStrategy = new Selectionsort();
            }
            case Quicksort -> {
                sortStrategy = new Quicksort();
            }
            default -> {
                sortStrategy = null;
            }
        }
        return sortStrategy;
    }
