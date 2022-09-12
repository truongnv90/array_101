package anry.project.Chap01_Introduction.MaxConsecutiveOnes;


public class MaxConsecutiveOnes {
  static int[] arrayEx1 = new int[]{1,1,0,1,1,1};
  static int[] arrayEx2 = new int[]{1,0,1,1,0,1};

  public static int countTheMaximumConsecutiveOnes(int[] array) {
    int currentCount = 0;
    int maxCount = 0;

    for (int j : array) {
      if (j == 0) {
        maxCount = Math.max(currentCount, maxCount);
        currentCount = 0; // reset current count
      } else {
        currentCount++;
      }
    }
    maxCount = Math.max(currentCount, maxCount);
    return maxCount;
  }

  public static void main(String[] args) {
    // example 01
    System.out.println("Example 01 is " + MaxConsecutiveOnes.countTheMaximumConsecutiveOnes(arrayEx1));
    System.out.println("Example 02 is " + MaxConsecutiveOnes.countTheMaximumConsecutiveOnes(arrayEx2));

  }
}
