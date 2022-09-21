package anry.project.Chap03_DeletingItemsFromAnArray;

public class ArrayDeletions {
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

  public static void shiftLeftArr(int[] arr, int indexNumber) {
    for (int i = indexNumber + 1; i < arr.length; i++) {
      arr[i -1] = arr[i];
    }
  }

  public static void main(String[] args) {
    // create origin array
    int[] intArray = new int[10];
    for (int i = 0; i< 6; i++) {
      intArray[i] = i;
    }
    printArr(intArray);


    // shift left arr
    shiftLeftArr(intArray, 3);
    printArr(intArray);
  }
}
