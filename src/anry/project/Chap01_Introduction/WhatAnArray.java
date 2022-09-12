package anry.project.Chap01_Introduction;

public class WhatAnArray {
  public static class DVD {
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
      this.name = name;
      this.releaseYear = releaseYear;
      this.director = director;
    }

    @Override
    public String toString() {
      return this.name + ", director by " + this.director + ", release in " + this.releaseYear;
    }
  }


  /**
   *
   */
  public static void main(String[] args) {
    // init an array
    DVD[] dvdCollections = new DVD[15];

    // write some item to array
    DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
    DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
    DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
    DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
    dvdCollections[7] = avengersDVD;
    dvdCollections[3] = incrediblesDVD;
    dvdCollections[9] = findingDoryDVD;
    dvdCollections[2] = lionKingDVD;

    // replace item in array by other array
    DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
    dvdCollections[3] = starWarsDVD;

    // read item from array
    System.out.println(dvdCollections[7]);
    System.out.println(dvdCollections[10]);
    System.out.println(dvdCollections[3]);

    // write item into array with a loop
    int[] squareNumber = new int[10];
    for (int i = 0; i < 10; i ++) {
      squareNumber[i] = (i + 1) * (i + 1);
    }

    // read item from array with a loop
    for (int i = 0 ; i < 10 ; i ++) {
      System.out.println(squareNumber[i]);
    }
  }

}
