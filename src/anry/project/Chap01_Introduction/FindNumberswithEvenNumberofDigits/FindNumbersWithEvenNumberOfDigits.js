function findNumbersWithEventNumberOfDigits(array) {
    let count = 0;
    for (let i in array) {
        if ((array[i].toString().length % 2) === 0) {
            count++;
        }
    }
    return count;
}

const arrayExp01 = [12,345,2,6,7896];
const arrayExp02 = [555,901,482,1771];

console.log("Count of example 01 is " + findNumbersWithEventNumberOfDigits(arrayExp01))
console.log("Count of example 02 is " + findNumbersWithEventNumberOfDigits(arrayExp02))
