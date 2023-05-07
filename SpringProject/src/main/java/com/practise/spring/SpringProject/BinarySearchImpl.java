package com.practise.spring.SpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//yesma sabai interface lekhney bubble ra quick ko thau ma to make loosely coupled
@Component //tells is a beans
public class BinarySearchImpl {
    @Autowired //binary.. depends on sortalgo
    private SortAlgo sortAlgo;

    //Constructor is not used in autowired
//    public BinarySearchImpl(SortAlgo sortAlgo) {
//        super();
//        this.sortAlgo = sortAlgo;
//    }

    public int binarySearch(int[] numbers, int numberToSearchFor){

        //Implementing Sorting
        //Algo
        int [] sortedNumbers = sortAlgo.sort(numbers);
        System.out.println(sortAlgo);
        //Search array

        return 3;
    }

}
