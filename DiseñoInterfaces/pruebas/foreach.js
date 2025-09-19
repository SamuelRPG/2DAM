const frutas = ["Pera", "Sandia"];
frutas.forEach((el, i) => {
    console.log("El elemento", i+1, "es ", el);
});

//mostrar y multiplicar 
const nums = [2, 4, 6];
nums.forEach(element => {
    console.log(element*3)
});

//mostrat un hola antes del nombrre 
const nombres = ["Anna", "Joan", "Maria"]
nombres.forEach(element => {
    console.log("Hola", element);
});

const numeros = [5, 10, 15];
let suma=0;
numeros.forEach(element => {
    suma+=element;
});
console.log(suma);
