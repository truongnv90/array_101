function duplicateZeros(arr) {
    let resultArr = new Array(arr.length);
    let l = 0;
    for (let i =0 ; l < arr.length; i++) {
        if (arr[i] !== 0) {
            resultArr[l] = arr[i];
            l++;
        } else {
            resultArr[l] = 0;
            resultArr[l+1] = 0;
            l+=2;
        }
    }
    return resultArr;
}


let arr = [1,0,2,3,0,4,5,0]
arr = duplicateZeros(arr)
console.log(arr)

arr = [1,2,3]
arr = duplicateZeros(arr)
console.log(arr)
