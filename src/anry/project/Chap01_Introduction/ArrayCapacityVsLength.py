if __name__ == '__main__':
    lst_array = [None] * 6

    # Array Capacity
    # The capacity cannot be changed later
    # NOTE: it's wrong with dynamic type
    capacity = len(lst_array)
    print("The Array has a capacity of {}".format(capacity))

    # Array length
    int_array = [0]*6
    length = 0
    for i in range(3):
        int_array[i] = i * i
        length += 1

    print("The int array has a capacity of {}".format(len(int_array)))
    print("The int array has a length of {}".format(length))
