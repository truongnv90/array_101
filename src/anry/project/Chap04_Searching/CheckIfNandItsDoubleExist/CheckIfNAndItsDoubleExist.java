package anry.project.Chap04_Searching.CheckIfNandItsDoubleExist;

public class CheckIfNAndItsDoubleExist {
  public static boolean solution(int[] arr) {
    for (int i = 0 ; i < arr.length; i++) {
      for (int j = 0; j< arr.length; j++) {
        if ((i != j) && (arr[i] == 2 * arr[j])) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = new int[]{-2,0,10,-19,4,6,-8};

  }
}
