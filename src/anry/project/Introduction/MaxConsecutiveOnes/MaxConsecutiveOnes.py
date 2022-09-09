if __name__ == '__main__':
    lst_array_exp01 = [1, 1, 0, 1, 1, 1]
    lst_array_exp02 = [1, 0, 1, 1, 0, 1]

    def count_max_consecutive_ones(array_check):
        current_count = 0
        max_count = 0
        for i in array_check:
            if i == 0:
                max_count = max(max_count, current_count)
                current_count = 0  # reset current count
            else:
                current_count += 1
        max_count = max(max_count, current_count)  # last check
        return max_count

    print("Count of example 01: {}".format(count_max_consecutive_ones(lst_array_exp01)))
    print("Count of example 02: {}".format(count_max_consecutive_ones(lst_array_exp02)))
    
