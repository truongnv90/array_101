package anry.project;

public class common {
  public static void printArr(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if (i == 0) {
        System.out.print("[" + array[i]);
        continue;
      }

      System.out.print(", " + array[i]);

      if (i == (array.length -1)) {
        System.out.println("]");
      }
    }
  }
}
