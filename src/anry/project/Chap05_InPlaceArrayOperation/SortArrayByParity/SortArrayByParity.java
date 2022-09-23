package anry.project.Chap05_InPlaceArrayOperation.SortArrayByParity;

import static anry.project.common.printArr;

public class SortArrayByParity {
  public static void solution(int[] nums) {
    int i = 0;
    int j = 0;
    while (j < nums.length) {
      if (nums[j] % 2 == 0 ) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        i++;
      }
      j++;
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[]{0};
    solution(arr);
    printArr(arr);
  }
}
