//ver que numeros son mayores que 5
const numeros = [2,7,4,10];
const pares = numeros.filter((el) => el>5);
console.log(pares);

//ver que numeros numeros estan en una posicion impar del array
const imparIndex= numeros.filter((el, i) => i % 2 === 1 );
console.log(imparIndex);