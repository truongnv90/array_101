class DVD:
    def __init__(self, name, release_year, director):
        self.name = name
        self.release_year = release_year
        self.director = director

    def __str__(self):
        return "{}, director by {}, release in {}".format(
            self.name,
            self.director,
            self.release_year
        )


if __name__ == '__main__':
    # init an array
    lst_dvd_collections = [None] * 15

    # write some item to array
    avengersDVD = DVD("The Avengers", 2012, "Joss Whedon")
    incrediblesDVD = DVD("The Incredibles", 2004, "Brad Bird")
    findingDoryDVD = DVD("Finding Dory", 2016, "Andrew Stanton")
    lionKingDVD = DVD("The Lion King", 2019, "Jon Favreau")
    lst_dvd_collections[7] = avengersDVD
    lst_dvd_collections[3] = incrediblesDVD
    lst_dvd_collections[9] = findingDoryDVD
    lst_dvd_collections[2] = lionKingDVD

    # replace item in array by other array
    starWarsDVD = DVD("Star Wars", 1977, "George Lucas")
    lst_dvd_collections[3] = starWarsDVD

    # read item from array
    print(lst_dvd_collections[7])
    print(lst_dvd_collections[10])
    print(lst_dvd_collections[3])

    # write item into array with a loop
    lst_square_number = [0] * 10
    for i in range(10):
        lst_square_number[i] = (i + 1) * (i + 1)

    # read item from array with a loop
    for i in range(10):
        print(lst_square_number[i])
