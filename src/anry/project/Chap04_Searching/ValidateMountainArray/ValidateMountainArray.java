package anry.project.Chap04_Searching.ValidateMountainArray;

public class ValidateMountainArray {
  public static boolean solution(int[] arr) {
    // check edge case
    if (arr.length < 3) {
      return false;
    } else if (arr[0] > arr[1]) {
      return false;
    }

    String trendOfHillSide = "UP";
    for (int i = 0; i < arr.length -1; i++) {
      if (arr[i] > arr[i + 1]) {
        trendOfHillSide = "DOWN";
      } else if (arr[i] == arr[i+1]) {
        return false;
      } else {
        if (trendOfHillSide.equals("DOWN")) {
          return false;
        }
      }
    }

    return trendOfHillSide.equals("DOWN");
  }
}
