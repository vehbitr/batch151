package day20arraylistsdatetime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

    /*
    Example 1: Bir Integer List teki birbirine en yakin iki elemani bulunuz
    [12, 23, 10, 19] ==> 12 and 10
     */

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(10);
        nums.add(19);
        System.out.println(nums);

        //Collections.sort(nums); method u nums listindeki elemanlari "naturel order"(siralama) yapar
        Collections.sort(nums);
        System.out.println(nums);


        int minDiff = nums.get(1) - nums.get(0);

        for (int i=1; i<nums.size(); i++){

            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i-1));

        }
        System.out.println(minDiff);

        for (int i=1; i<nums.size(); i++){
            if (nums.get(i) - nums.get(i-1) == minDiff){
                System.out.println(nums.get(i-1) + " and " + nums.get(i));
            }
        }
    }
}