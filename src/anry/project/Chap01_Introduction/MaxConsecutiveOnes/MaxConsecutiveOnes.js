const arrayExp01 = [1,1,0,1,1,1];
const arrayExp02 = [1,0,1,1,0,1];

function countMaxConsecutiveOnes(array) {
    let currentCount = 0;
    let maxCount = 0;

    for (let i = 0; i< array.length; i++) {
        if (array[i] === 0) {
            maxCount = Math.max(currentCount, maxCount);
            currentCount = 0; // reset current count
        } else {
            currentCount++;
        }
    }
    maxCount = Math.max(currentCount, maxCount);
    return maxCount;
}

console.log("Count of example 01: " + countMaxConsecutiveOnes(arrayExp01))
console.log("Count of example 02: " + countMaxConsecutiveOnes(arrayExp02))
