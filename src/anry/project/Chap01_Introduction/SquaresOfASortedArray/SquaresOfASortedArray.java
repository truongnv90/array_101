package anry.project.Chap01_Introduction.SquaresOfASortedArray;

import java.util.Arrays;

public class SquaresOfASortedArray {
  public static int[] arrayExp01 = new int[]{-4,-1,9,3,10};
  public static int[] arrayExp02 = new int[]{-7,-3,2,3,11};

  public static int[] squaresValueArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int value = array[i];
      int squareValue = value * value;
      array[i] = squareValue;
    }
    Arrays.sort(array);
    return array;
  }


  public static void main(String[] args) {
    int[] squaresArray01 = squaresValueArray(arrayExp01);
    int[] squaresArray02 = squaresValueArray(arrayExp02);

    System.out.println(Arrays.toString(squaresArray01));
    System.out.println(Arrays.toString(squaresArray02));
  }

}
