//multiplicamos cada elemento del array por 2.
let nums = [10, 9, 7];
let numResultado=[];
//bucle for
for (let i=0;i<nums.length;i++) {
    numResultado.push(nums[i]*2);
}
console.log(numResultado);


//ahora lo hacemos con .map
const numResultadoMap= nums.map((el) => el*2);
console.log(numResultadoMap);
