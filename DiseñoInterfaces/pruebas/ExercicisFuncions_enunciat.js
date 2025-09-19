//Executeu este codi i mireu el que mostra per consola

let dies=["Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres","Dissabte","Diumenge"];
function paraCada(array, accio){
    for(let i=0;i<array.length;i++){
        accio(array[i]);
    }
}
paraCada(dies,console.log);

//Modifiqueu-lo per a que faça el mateix utilitzant una funció fletxa (=>)
console.log("----------------------------------");
const paraCadaFlecha = (array, accio) => {
    for(let i=0;i<array.length;i++){
        accio(array[i]);
    }
};
paraCadaFlecha(dies, console.log)

//Modifiqueu el codi per a que faça el mateix utilitzant el mètode forEach()
console.log("----------------------------------")
const diasForEach = (element, accio) => dies.forEach(element => {
    accio(element)
});
diasForEach(dies, console.log);


// Que cree un altre array on calcule el numero de caracters de cada dia de la setmana
// ex: numCar=[7,7,8,6,9,8,8] 
// i després que mostre el contingut dels dos arrays de la següent manera:
// Dilluns: 7
// Dimarts: 7
// Dimecres: 8
// ...

console.log("----------------------------------");
//const numCar = (arrayDias) => {
    // const resultado = arrayDias.map((unDia) => unDia.length);
    //return resultado;
//}
//console.log(numCar(dies));

const numCar = (dies.map((el) => el.length));
// for(let i=0; i<dies.length;i++) {
//     console.log(dies[i],":",numCar[i] )
// }
dies.forEach((el, pos) => {
    console.log(el, ":", numCar[pos]);
});







//Mostra els dies que ténen més de 7 caracters (filter)
// console.log("----------------------------------")
// dies.forEach(element => {
//     if (element.length>7) console.log(element)
// });
const diasTochos = dies.filter((el) => el.length > 7);
console.log(diasTochos);



console.log("----------------------------------");
/* Ara volem fer el mateix, però que ens torne un String amb els dies que ténen més de 7 caracters */
/* reduce */

const diasTochosString = dies.filter((el) => el.length > 7).join("");
console.log(diasTochosString);

//0 es la inicialización de la variable acum.
//acum y unNumero son las variables que recibirá la función 
const numerosBasicos = [1, 2, 3, 4];
const sume = numerosBasicos.reduce((acum,unNumero)=>acum+unNumero,0);

