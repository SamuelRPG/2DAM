
// funcion flecha 
const sumaUno = x => x + 1;
//funcion flecha que calcule el maximo de 3 numeros a,b,c
const maxNum = (a, b, c) => {
    let unMax = Math.max(a, b, c);
    return unMax;
}

const saludoInicial = () => console.log("tu puta madre");

console.log("El máximo es", +maxNum(5,2,9));
saludoInicial();

const numeros = [1,2,3,4];
let arraySum = [];


    for (let i = 0; i < numeros.length; i++) {
        arraySum[i] =sumaUno(numeros[i]);
    }

console.log(arraySum);

