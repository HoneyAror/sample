package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //bean
public class BinarySearchimpl{
    @Autowired  //dependency for binarysearchimp
   private SortingAlgorithm sortingAlgorithm; //instance of algorithm
    //CONSTRUCTOR INJECTION
    public BinarySearchimpl(SortingAlgorithm sortingAlgorithm) { //constructor is used for autowiring
        super();
        this.sortingAlgorithm=sortingAlgorithm;
    }
    //sort an array, search element and return its index
    public int binarysearch(int[] number,int numbertosearch){
         int[] sortednum=sortingAlgorithm.sort(number);
         System.out.println(sortingAlgorithm);
        return 3;
    }
}


