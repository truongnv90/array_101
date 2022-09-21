package anry.project.Chap02_InsertingItemIntoAnArray.MergeSortedArray;

public class MergeSortedArray {
  public static void printArray(int[] arr) {
    System.out.print("[" + arr[0]);
    if (arr.length > 1) {
      for (int i = 1; i < arr.length; i ++) {
        System.out.print(", " + arr[i]);
      }
    }
    System.out.print("]");
  }

  public static void printExampleData(int[] nums1, int[] nums2, int m, int n) {
    System.out.print("Input: nums1 = ");
    printArray(nums1);
    System.out.print(", m = " + m + ", nums2 = ");
    printArray(nums2);
    System.out.println(", n = " + n);
  }
  public static void printOutput(int[] arr) {
    System.out.print("Output: ");
    printArray(arr);
    System.out.println();
  }

  public static void shiftRight(int[] arr, int index) {
    int holdValue = 0;
    int currentPointer;
    for (int i = index; i< arr.length; i++) {
      currentPointer = arr[i];
      arr[i] = holdValue;
      holdValue = currentPointer;
    }
  }

  public static int[] solution(int[] nums1, int[] nums2, int m, int n) {
    int mCrtPointer = 0;
    int nCrtPointer = 0;
    int[] resultArr = new int[nums1.length];

    for (int i = 0 ; i < (m + n); i++) {
      if (mCrtPointer >= m && nCrtPointer >= n) {
        resultArr[i] = 0;
      } else if (mCrtPointer >= m) {
        resultArr[i] = nums2[nCrtPointer];
        nCrtPointer++;
      } else if (nCrtPointer >= n) {
        resultArr[i] = nums1[mCrtPointer];
        mCrtPointer ++;
      } else {
        resultArr[i] = Math.min(nums1[mCrtPointer], nums2[nCrtPointer]);
        if (nums1[mCrtPointer] <= nums2[nCrtPointer]) {
          mCrtPointer++;
        } else {
          nCrtPointer ++;
        }
      }
    }
    return resultArr;
  }

  public static void solution2(int[] nums1, int[] nums2, int m, int n) {
    int indexArr1 = 0;

    for (int k : nums2) {
      for (int j = indexArr1; j < nums1.length; j++) {
        if (nums1[j] > k) {
          shiftRight(nums1, j);
          nums1[j] = k;
          indexArr1 = j;
          break;
        }
      }
    }
    if(nums1[nums1.length - 2] < nums2[nums2.length - 1]) {
      nums1[nums1.length - 1] = nums2[nums2.length-1];
    }
  }


  public static void main(String[] args) {
    // Example 01
    int[] nums1 = new int[]{1,2,5,0,0,0};
    int[] nums2 = new int[]{2,3,6};
    int m = 3;
    int n = 3;
    printExampleData(nums1, nums2, m, n);

//    int[] resultArr = solution(nums1, nums2, m, n);
//    printOutput(resultArr);

    solution2(nums1, nums2, m, n);
    printExampleData(nums1, nums2, m, n);
  }
}
