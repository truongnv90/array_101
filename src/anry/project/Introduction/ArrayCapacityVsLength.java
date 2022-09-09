package anry.project.Introduction;

public class ArrayCapacityVsLength {

  public static void main(String[] args) {
    WhatAnArray.DVD[] array = new WhatAnArray.DVD[6];

    // Array Capacity
    // The capacity cannot be changed later
    int capacity = array.length;
    System.out.println("The Array has a capacity of " + capacity);

    // Array Length
    int[] arrayInt = new int[6];
    int length = 0;
    for (int i = 0 ; i < 3; i++) {
      arrayInt[i] = i * i;
      length++;
    }

    System.out.println("The int array has a capacity of " + arrayInt.length);
    System.out.println("The int array has a length of " + length);
  }
}
