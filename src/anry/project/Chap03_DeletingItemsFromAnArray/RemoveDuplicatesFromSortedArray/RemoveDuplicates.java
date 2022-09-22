package anry.project.Chap03_DeletingItemsFromAnArray.RemoveDuplicatesFromSortedArray;

import static anry.project.common.printArr;

public class RemoveDuplicates {
  public static int solution(int[] nums) {
    int realPointer = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != nums[realPointer]) {
        realPointer++;
        nums[realPointer] = nums[i];
      }
    }
    return realPointer + 1;
  }


  public static void main(String[] args) {
    int[] arr = new int[]{1,2};
    printArr(arr);
    int k = solution(arr);
    System.out.println("k: " + k);
    printArr(arr);
  }
}
