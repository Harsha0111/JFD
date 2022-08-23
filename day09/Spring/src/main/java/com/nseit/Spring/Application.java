package com.nseit.Spring;

public class Application {

    public static void main(String[] args) {
        BinarySearchImp binarySearch = new BinarySearchImp();
        int result = binarySearch.binarySearch( new int[]{5,85,7}, 8);
        System.out.println(result);
    }

}
