def shift_value__to_right(int_arr: list[int], index_number: int):
    return int_arr[:index_number] + [0] + int_arr[index_number:len(int_arr) - 1]


class Solution:

    def duplicateZeros(self, arr: list[int]) -> None:
        """
        Do not return anything, modify arr in-place instead.
        """
        flag = False
        for i in range(len(arr)):
            if arr[i] == 0:
                if flag is False:
                    arr[:] = arr[:i] + [0] + arr[i:len(arr) - 1]
                    flag = True
                else:
                    flag = False


if __name__ == '__main__':
    arr = [1, 0, 2, 3, 0, 4, 5, 0]
    print(arr)
    Solution().duplicateZeros(arr)
    print(arr)

    print("="*20)
    arr = [1, 2, 3]
    print(arr)
    Solution().duplicateZeros(arr)
    print(arr)

