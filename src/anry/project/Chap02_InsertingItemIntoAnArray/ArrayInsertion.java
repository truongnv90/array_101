package anry.project.Chap02_InsertingItemIntoAnArray;

public class ArrayInsertion {
  public static void printArray(int[] array) {
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

  public static void moveAllValueToRight(int[] intArray) {
    for (int i = intArray.length - 1; i>= 0; i--) {
      if (i == 0) {
        intArray[i] = 0;
        continue;
      }
      intArray[i] = intArray[i-1];
    }
  }

  public static void moveValueToRightFromIndex(int[] intArray, int fromIndex) throws Exception {
    if ((fromIndex < 0) || (fromIndex >= intArray.length)) {
      System.out.println("Cannot process with index: " + fromIndex);
      throw new Exception("out bound of index");
    }

    for (int i = intArray.length - 1; i>= fromIndex; i--) {
      if (i == fromIndex) {
        intArray[i] = 0;
        continue;
      }
      intArray[i] = intArray[i-1];
    }
  }

  public static void main(String[] args) throws Exception {

    int[] intArray = new int[6];
    int length = 0;

    // init an array
    for (int i = 0; i < 3; i++) {
      intArray[length] = i;
      length++;
    }

    // Inserting at the End of an Array
    intArray[length] = 10;
    printArray(intArray);

    // shift all value to right
    moveAllValueToRight(intArray);

    // insert at the Start of an Array
    intArray[0] = 8;
    printArray(intArray);

    // shift value to right from index 3
    moveValueToRightFromIndex(intArray, 3);

    // insert new value to index 3
    intArray[3] = 99;
    printArray(intArray);
  }
}
