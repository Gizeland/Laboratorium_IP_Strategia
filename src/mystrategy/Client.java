/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;

import data.DataGenerator;
import sort.factory.ISortStrategyFactory;
import sort.factory.SortStrategyFactory;
import sort.methods.ISortStrategy;
import sort.utils.SortStrategyType;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Algorytmy sortowania */
        // http://www.algorytm.org/algorytmy-sortowania/
        
        double[] dataNonSort = DataGenerator.generate(100000);
        
       /* Wzorzec Stratega */
       
       //Odpowiedzi na pytania:
       //1. Wzorzec Strategia proponuje ekstrakcję poszczególnych 
       //algorytmów wykonujących dane zadanie na różne sposoby i umieszczenie
       //ich w odrębnych klasach, zwanych strategiami. Każde rozszerzenie algorytmu można
       //można realizować poprzez dodanie startegii.
       //2. Tak w trakcie trwania programu możliwa jest zmiana algorytmu.
       //3.Kontekst wzorca strategii wywoluje metode sortowania poprzez stworzoną abstrakcje (ISortStrategy)
       //4. Stosuje się w przypadku potrzeby roznej implementacji rozwiazania problemu np 
       //rozszerzanie aplikacji wyznaczającej trasę do przejechania samochodem, 
       //o wyznaczanie trasy wędrówki pieszej czy komunikacją miejską.
        ISortStrategyFactory factory = new SortStrategyFactory();
        ISortStrategy strategy = factory.createStrategy(SortStrategyType.Quicksort);
        
        System.out.println("Time: ");
    }
}
