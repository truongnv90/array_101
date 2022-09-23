package anry.project.Chap05_InPlaceArrayOperation.MoveZeroes;

import static anry.project.common.printArr;

public class MoveZeroes {
  /**
   * O(2N) nhưng hơi loằng ngoằng
   */
  public static void solution(int[] arr) {
    // edge case
    if (arr.length < 2) {
      return;
    }

    int zeroCount = 0;
    for (int i = arr.length -1; i >=0; i--) {
      if (arr[i] == 0) {
        zeroCount++;
        for (int j = i; j< arr.length -zeroCount; j++) {
          arr[j] = arr[j+1];
        }
        arr[arr.length-zeroCount] = 0;
      }
    }
  }

  public static void solution2(int[] nums) {
    int i = 0;
    int j = 0;
    while (j < nums.length) {
      if (nums[j] != 0) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        i++;
      }
      j++;
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[]{0,1,0,3,12};
    solution2(arr);
    printArr(arr);

    int[] arr2 = new int[]{1};
    solution2(arr2);
    printArr(arr2);
  }
}
