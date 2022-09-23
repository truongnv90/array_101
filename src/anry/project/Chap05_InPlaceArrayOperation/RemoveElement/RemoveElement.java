package anry.project.Chap05_InPlaceArrayOperation.RemoveElement;

public class RemoveElement {
  public static int solution(int[] nums, int val) {
    int i = 0;
    int j = 0;
    while (j < nums.length) {
      if (nums[j] != val) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        i++;
      }
      j++;
    }
    return i;
  }
}
