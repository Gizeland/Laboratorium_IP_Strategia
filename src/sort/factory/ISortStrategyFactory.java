package sort.factory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import sort.methods.ISortStrategy;
import sort.utils.SortStrategyType;
/**
 *
 * @author asus
 */
public interface ISortStrategyFactory {
    ISortStrategy createStrategy(SortStrategyType strategyType);
}
