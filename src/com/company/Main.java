package com.company;

public class Main {

    public static void main(String[] args) {
      double [] nums={11.1,-8.5,6.9,94.3,-7.3,16.5,9.5,-2.3,6.3,9.7,-4.7,34.76,2.4,8.9,16.8};
        System.out.println(nums.length);
        double number = 0;
        int amount =0;
        boolean checkNegativeNumber=false;

        for (double num:nums) {
            if (num < 0) {
                checkNegativeNumber = true;
            } else if (checkNegativeNumber) {
                number = num + number;
                amount+=1;

            }
        }
        System.out.println(number);
        System.out.println(number/amount);


        }
    }


