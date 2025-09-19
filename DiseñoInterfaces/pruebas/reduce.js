//encontrar palabras mas largas de 3 caracteres
const palabras = ["sol","pluja", "mar"];

const palLargas = palabras.filter((el) => el.length > 3);
console.log(palLargas);

//usar reduce para multiplicar todos los numeros 
const n=[2,3,4];

const mult = n.reduce((acum, numero) => acum*numero, 1);
console.log(mult);

const concatenar = ["Hola", "mon"].reduce ((acum, n) => acum+n,"");
console.log(concatenar);



