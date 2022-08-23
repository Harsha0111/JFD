package com.nseit.Spring;

public class BinarySearchImp {

    SortAlg sortAlg;
    public int binarySearch(int[] numbers, int numbersToSearched){
         sortAlg = new BubbleSort();
         int[] sortedNumbers = sortAlg.sort(numbers);
        System.out.println(sortAlg);
        return 6;
    }

}
