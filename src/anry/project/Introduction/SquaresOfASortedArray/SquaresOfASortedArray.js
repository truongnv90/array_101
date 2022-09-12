const arrayEx01 = [-4,-1,9,3,10];
const arrayEx02 = [-7,-3,2,3,11];

function SquaresOfASortedArray(array) {
    return array.map((x) => Math.pow(x, 2)).sort();
}

console.log(SquaresOfASortedArray(arrayEx01))
console.log(SquaresOfASortedArray(arrayEx02))
