package anry.project.Chap01_Introduction.FindNumberswithEvenNumberofDigits;

public class FindNumbersWithEvenNumberOfDigits {
  public static int[] arrayExp1 = new int[]{12,345,2,6,7896};
  public static int[] arrayExp2 = new int[]{555,901,482,1771};

  public static int findNumbersWithEvenNumberOfDigits(int[] array) {
    int count = 0;
    for (int j : array) {
      if ((String.valueOf(j).length() % 2) == 0) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println("Count of example 1: " + findNumbersWithEvenNumberOfDigits(arrayExp1));
    System.out.println("Count of example 2: " + findNumbersWithEvenNumberOfDigits(arrayExp2));
  }

}
