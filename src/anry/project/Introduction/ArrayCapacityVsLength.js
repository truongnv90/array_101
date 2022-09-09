const array = new Array(6)

// Array Capacity
// The capacity cannot be changed later
if (Object.seal) {
    array.fill(undefined)
    Object.seal(array) // now array is a fixed-size array with mutable entries
}

let capacity = array.length
console.log("The array has a capacity of " + capacity)

// Array Length
const intArray = new Array(6);
if (Object.seal) {
    intArray.fill(0);
    Object.seal(intArray);
}

let length = 0;
for (let i = 0; i < 3; i++) {
    intArray[i] = i * i;
    length++;
}
console.log("The int array has a capacity of " + intArray.length)
console.log("The int array has a length of " + length)


