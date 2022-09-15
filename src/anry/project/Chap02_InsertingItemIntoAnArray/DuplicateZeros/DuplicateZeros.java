package anry.project.Chap02_InsertingItemIntoAnArray.DuplicateZeros;

public class DuplicateZeros {
  public static void shiftValueToRight(int[] arr, int indexNumber) {
    for (int i = arr.length - 1; i>= indexNumber; i--) {
      if (i == indexNumber) {
        arr[i] = 0;
        continue;
      }
      arr[i] = arr[i-1];
    }
  }
  public static void duplicateZeros(int[] intArray) {
    int flagCheckZero = 0;
    for (int i = 0; i< intArray.length; i++) {
      if (intArray[i] == 0 & flagCheckZero == 0) {
        shiftValueToRight(intArray, i);
        flagCheckZero = 1;
      } else if (intArray[i] == 0 & flagCheckZero == 1) {
        flagCheckZero = 0;
      }
    }
  }

  public static void printArray(int[] arr) {
    System.out.print("[");
    for (int i = 0 ; i< arr.length; i++) {
      if (i == 0) {
        System.out.print(arr[0]);
      } else {
        System.out.print(" ," + arr[i]);
      }
    }
    System.out.println("]");
  }
  public static void main(String[] args) {
    int[] arrEx1 = new int[]{1,0,2,3,0,4,5,0} ;
    int[] arrEx2 = new int[] {1,2,3};

    printArray(arrEx1);
    duplicateZeros(arrEx1);
    printArray(arrEx1);
    System.out.println("===================");
    printArray(arrEx2);
    duplicateZeros(arrEx2);
    printArray(arrEx2);
  }
}
