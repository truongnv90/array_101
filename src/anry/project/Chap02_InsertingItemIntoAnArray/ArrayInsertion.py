from collections import deque


def shift_all_value_to_right(array):
    new_array = deque(array)
    new_array.rotate(1)
    new_array[0] = 0
    return list(new_array)


def shift_value_to_right_with_index(array, int_index):
    if (int_index < 0) or (int_index >= len(array)):
        print("Cannot process with index: {}".format(int_index))
        raise ValueError("Cannot process with index: {}".format(int_index))
    if int_index == 0:
        return shift_all_value_to_right(array)

    left_partition_array = array[:(int_index-1)]
    right_partition_array = array[(int_index-1):]
    shift_right_array = shift_all_value_to_right(right_partition_array)
    return left_partition_array + shift_right_array


if __name__ == '__main__':
    # init an array
    int_array = [0, 1, 2, 0, 0]
    print(int_array)

    # shift all value to right
    int_array = shift_all_value_to_right(int_array)

    # insert at the Start of an Array
    int_array[0] = 8
    print(int_array)

    # shift value to right from index 3
    int_array = shift_value_to_right_with_index(int_array, 3)

    # insert new value to index 3
    int_array[2] = 99
    print(int_array)
