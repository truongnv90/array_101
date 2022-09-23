package anry.project.Chap05_InPlaceArrayOperation.ReplaceElementsWithGreatesElementonRightSide;

import static anry.project.common.printArr;

/**
 * => O(N^2)
 */
public class ReplaceElementsWithGreatestElementOnRightSide {
  public static void solution(int[] arr) {
    // line search
    for (int i = 0; i < arr.length; i++) {

      // find max value in left of index
      if (i == arr.length -1) {   // edge case
        arr[i] = -1;
      } else {    // other
        int max = arr[i+1];
        for (int j = i + 1; j <arr.length; j++) {
          if (arr[j] > max) max = arr[j];
        }
        arr[i] = max;
      }
    }
  }

  /**
   * 01 - initial max = -1
   * 02 - reverse interation
   * 03 - new max = max(oldMax, arr[i])
   * => O(N)
   */
  public int[] solution2(int[] arr) {
    // edge case
    if(arr.length <= 1) return arr;

    int length = arr.length;
    int max = arr[length-1];

    // tìm max ngược dòng
    for (int i= length -2; i>=0; i--){
      int current = arr[i];
      arr[i] = max;
      max = Math.max(current, max);
    }

    arr[length-1] = -1;
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{57010,40840,69871,14425,70605};
    solution(arr);
    printArr(arr);

  }
}
