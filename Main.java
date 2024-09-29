//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Kelly Jameson
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    //Create an array with values {5, 9, 3, 12, 7, 3, 11, 5}
    int labArray[] = {5, 9, 3, 12, 7, 3, 11, 5};

    //Output the array in order using a while loop.
    System.out.println("Print array in order.");
    int i = 0;
    while(i < labArray.length){
      System.out.println(labArray[i]);
      i++; 
    }

    //Output the array in reverse using a for loop.
    System.out.println("Print array in reverse order.");
    for(int ii=labArray.length - 1; ii >= 0; ii--){
      System.out.println(labArray[ii]);
    }

    //Output the first and last values of the array.
    System.out.println("First array value.");
    System.out.println(labArray[0]);
    System.out.println("Last array value.");
    System.out.println(labArray[labArray.length - 1]);
    
    //Call the methods created in Lab1.
    System.out.println("Maximum value between 1 and 3.");
    System.out.println(lab.max(1,3));
    System.out.println("Minimum value between 1 and 3.");
    System.out.println(lab.min(1,3));

    System.out.println("Sum of array values.");
    System.out.println(lab.sum(labArray));

    System.out.println("Average of array values.");
    System.out.println(lab.average(labArray));

    System.out.println("Maximum value of array values.");
    System.out.println(lab.max(labArray));

    System.out.println("Miminum value of array values.");
    System.out.println(lab.min(labArray));

  }
}     

// Add all of the methods here
class Lab1 {
  public int increment(int num) {
    return ++num;
  }

  //max(int a, int b): Use an if-statement to return the maximum value.
  public int max(int a, int b){
    if(a > b){
      return a;
    }
    else{
      return b;
    }
  }

  //min(int a, int b): Use an if-statement to return the minimum value.
  public int min(int a, int b){
    if(a < b){
      return a;
    }
    else{
      return b;
    }
  }

  //sum(int[] nums): Return the sum of all values in the array.
  public int sum(int[] nums){
    int total = 0;
    for(int i=0; i < nums.length; i++){
      total += nums[i];
    }
    return total;
  }

  //average(int[] nums): Use a foreach loop to return the average.
  public double average(int[] nums){
    double total = 0;
    for (int num: nums){
      total += num;
    }
    return total / nums.length;
  }

  //max(int[] nums): Use a for loop to return the maximum value.
  public int max(int[] nums){
    int maxnum = nums[0];
    for(int i=0; i < nums.length - 1; i++){
      if(nums[i] > maxnum){
        maxnum = nums[i];
      }
    }
    return maxnum;
  }

  //min(int[] nums): Use a for loop to return the minimum value.
  public int min(int[] nums){
    int minnum = nums[0];
    for(int i=0; i < nums.length - 1; i++){
      if(nums[i] < minnum){
        minnum = nums[i];
      }
    }
    return minnum;
  }
  
}