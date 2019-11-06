package com.lpcasa.jenkins;



public class App 
{

public int[] intArr = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 ,
    216, 323, 414, 57, 621, 720, 86, 91, 171, 132, 123, 94, 35, 196

};

public int[] sort() {
    int k;
    for (int i = 0; i < intArr.length - 1; i++) {
        if (intArr[i] < intArr[i + 1]) {
            continue;
        }
        k = intArr[i];
        intArr[i] = intArr[i + 1];
    //    System.out.println("K=: " +  intArr[i]);
    
    
        intArr[i + 1] = k;
        sort();
    }
    return intArr;
}

public static void main(String[] args) {
    App bs = new App();
    int[] arr = bs.sort();
    for (int i = 0; i < arr.length; i++) {
        System.out.println(i + 1 + ": " + arr[i]);
    }
}

}