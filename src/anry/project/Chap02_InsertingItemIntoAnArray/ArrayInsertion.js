function shiftAllValueToRight(array) {
    for (let i = array.length-1; i >=0; i--) {
        if (i === 0 ) {
            array[0] = 0;
            continue;
        }
        array[i] = array[i-1]
    }
}


/*
    MAIN FUNCTION
 */
const intArray = [0, 1, 2, 3, 0, 0];

// inserting at the end of an array
intArray[3] = 10
console.log(intArray)

// shift all value to right
shiftAllValueToRight(intArray)

// insert at the start of array
intArray[0] = 8
console.log(intArray)
