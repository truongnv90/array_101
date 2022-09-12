def find_numbers_with_even_number_of_digits(array: list) -> int:
    count = 0
    for i in array:
        if (len(str(i)) % 2) == 0:
            count += 1
    return count


if __name__ == '__main__':
    array_exp01 = [12, 345, 2, 6, 7896]
    array_exp02 = [555, 901, 482, 1771]

    print("Count of example 01: {}".format(find_numbers_with_even_number_of_digits(array_exp01)))
    print("Count of example 02: {}".format(find_numbers_with_even_number_of_digits(array_exp02)))
