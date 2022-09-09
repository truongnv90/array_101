function DVD(name, releaseYear, director) {
    this.name = name;
    this.releaseYear = releaseYear;
    this.director = director;
}

DVD.prototype.toString = function dvdToString() {
    return `${this.name}, director by ${this.director} , release in ${this.releaseYear}`
};

// init an array
const dvdCollections = [];

// write some item to array
avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
dvdCollections[7] = avengersDVD;
dvdCollections[3] = incrediblesDVD;
dvdCollections[9] = findingDoryDVD;
dvdCollections[2] = lionKingDVD;

// replace item in array by other item
starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
dvdCollections[3] = starWarsDVD;

// read item from array
console.log(dvdCollections[7])
console.log(dvdCollections[10])
console.log(dvdCollections[3])

// write item in to array with a loop
const squareNumber = []
for (let i = 0; i < 10; i++) {
    squareNumber[i] = (i + 1) * (i + 1);
}

// read item from array with a loop
for (let i = 0; i < 10; i ++) {
    console.log(squareNumber[i])
}
