package anry.project.Chap06_Conclusion.HeightChecker;

import java.util.Arrays;

import static anry.project.common.printArr;

public class HeightChecker {
  /**
   * NOT in-place requirement !!!!
   */
  public static int solution(int[] heights) {
    // edge case
    if (heights.length < 2) {
      return 0;
    }

    // copy arr
    int[] copyArr = new int[heights.length];
    System.arraycopy(heights, 0, copyArr, 0, heights.length);
    Arrays.sort(copyArr);

    int returnInt = 0;
    for (int i = 0; i< heights.length; i++) {
      if (heights[i] != copyArr[i]) {
        returnInt++;
      }
    }
    return returnInt;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{1,2,1,2,1,1,1,2,1};
    printArr(arr);
    System.out.println("==================");
    int result = solution(arr);
    System.out.println("Output: " + result);
    printArr(arr);


    System.out.println("\n==================");
    arr = new int[]{1,1,4,2,1,3};
    printArr(arr);
    System.out.println("==================");
    result = solution(arr);
    System.out.println("Output: " + result);
    printArr(arr);
  }
}
