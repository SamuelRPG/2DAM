//dividir entre 5
let nums = [5, 10, 15];

const resultado = nums.map((el) => el/5);
console.log(resultado);

//Añadir ! al final de cada nombre 
let nombres = ["Anna", "Joan", "Maria"];
const exclamacionXD = nombres.map((el) => el.concat("!"));
console.log(exclamacionXD);

//elevar al cuadrado cada elemento
let numeros = [2, 4, 6, 8];
const cuadrados = numeros.map((el) => Math.pow(el, 2));
console.log(cuadrados);