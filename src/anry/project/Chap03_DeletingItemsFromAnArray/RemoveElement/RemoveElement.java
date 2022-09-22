package anry.project.Chap03_DeletingItemsFromAnArray.RemoveElement;

import static anry.project.common.printArr;

public class RemoveElement {
  public static void shiftArrayByIndex(int[] arr, int indexNumber) {
    for (int i = indexNumber +1; i < arr.length; i++) {
      arr[i -1] = arr[i];
    }
    arr[arr.length-1] = 0;
  }

  public static int solution(int[] nums, int val) {
    int left = 0;
    int right = nums.length-1;

    while(left <= right){
      if(nums[left]==val){
        if (nums[right] != val) {
          nums[left] = nums[right];
          nums[right] = val;
          left++;
        }
        right--;

      }
      else{
        left++;
      }
    }
    return left;
  }


  public static void main(String[] args) {
    int[] arr = new int[]{0,1,2,2,3,0,4,2};
    printArr(arr);
    int a = solution(arr, 2);
    System.out.println("k: " + a);
    printArr(arr);
  }
}
