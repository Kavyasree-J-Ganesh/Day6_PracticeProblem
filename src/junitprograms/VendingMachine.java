package junitprograms;

import java.util.Scanner;

public class VendingMachine {
    static void vending(int[] arr, int rupee){
        System.out.println(" Hi, Welcome to Vending Machine");
        System.out.println(" Enter the amount that you have to change ");

        Scanner scan = new Scanner(System.in);
        int rs = scan.nextInt();
        String money = vending(rs);
        System.out.println((" change " + money));

        for(int i=arr.length-1; i>0; i--) {
            if(rs >= arr[i] && rs >= 0){
                change+= String.valueOf(arr[i] + ",");
                rs -+ arr[i];
                i++;
            }
        }
        return change;
    }
    public static void main(String[] args) {
        int[] arr1 ={1,2,5,10,20,50,100,200,500,1000};
        vending(arr1);
    }
}
