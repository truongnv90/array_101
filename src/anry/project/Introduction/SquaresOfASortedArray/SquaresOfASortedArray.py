
def sortedSquares(nums):
    return sorted([x**2 for x in nums])


arrayEx01 = [-4, -1, 9, 3, 10]
arrayEx02 = [-7, -3, 2, 3, 11]


if __name__ == '__main__':
    print(sortedSquares(arrayEx01))
