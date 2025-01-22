package com.mru.faqs;

import java.util.Arrays;

public class Assignment1Reverse {
	public static void main(String[] args) {
		int[] nums = {101, 201, 301, 401, 501};
        for (int i=0;i<nums.length;i++) {
            nums[i]=reverseNumber(nums[i]);
        }

        System.out.println("Reversed Array: " + Arrays.toString(nums));
    }
    public static int reverseNumber(int num) {
        int rev=0;
        while(num != 0){
            int digit=num % 10;
            rev = rev*10+digit;
            num /= 10;
        }
        return rev;
    }
}
	