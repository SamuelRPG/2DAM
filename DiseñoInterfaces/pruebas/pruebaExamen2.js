let dies=["Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres","Dissabte","Diumenge"];
// mostraDiesMajuscules()
// Crea una función que, a partir del array dies, devuelva otro array con todos los nombres en mayúsculas usando map.
const diasMayus = (objetoParam) => objetoParam.map((elem) => elem.toUpperCase());
console.log(diasMayus(dies));

// mostraDiesAmbCaracters()
// Muestra por consola el nombre de cada día junto con su número de caracteres,
// pero solo para los que tengan más de 7 letras (usa filter + forEach).
const diasMayor7 = (objetoParam) => objetoParam.filter((elem) => elem.length > 7).forEach(element => {
    console.log(element);
});   
diasMayor7(dies);

// sumaLongitudsDies()
// Calcula cuántos caracteres en total tienen todos los días de la semana (usa reduce).
const sumaLongitudsDies = (objetoParam) => objetoParam.reduce((acum, elem) => acum+=elem.length, 0);
console.log(sumaLongitudsDies(dies));

// diesAmbE()
// Devuelve un array con los días que contienen la letra "e" (usa filter + includes()).
const diesAmbE = (objetoParam) => objetoParam.filter((elem) => elem.toLowerCase().includes("e"));
console.log(diesAmbE(dies));

// 🟡 NIVEL 2 — Basados en dadesUsuaris
const dadesUsuaris = [
    {
        id: 1,
        name: "Leanne Graham",
        username: "Bret",
        email: "Sincere@april.biz",
        address: {
            street: "Kulas Light",
            suite: "Apt. 556",
            city: "Gwenborough",
            zipcode: "92998-3874",
            geo: {
                lat: "-37.3159",
                lng: "81.1496"
            }
        },
        phone: "1-770-736-8031 x56442",
        website: "hildegard.org",
        company: {
            name: "Romaguera-Crona",
            catchPhrase: "Multi-layered client-server neural-net",
            bs: "harness real-time e-markets"
        }
    },
    {
        id: 2,
        name: "Ervin Howell",
        username: "Antonette",
        email: "Shanna@melissa.tv",
        address: {
            street: "Victor Plains",
            suite: "Suite 879",
            city: "Wisokyburgh",
            zipcode: "90566-7771",
            geo: {
                lat: "-43.9509",
                lng: "-34.4618"
            }
        },
        phone: "010-692-6593 x09125",
        website: "",
        company: {
            name: "Deckow-Crist",
            catchPhrase: "Proactive didactic contingency",
            bs: "synergize scalable supply-chains"
        }
    },
    {
        id: 3,
        name: "Clementine Bauch",
        username: "Samantha",
        email: "Nathan@yesenia.net",
        address: {
            street: "Douglas Extension",
            suite: "Suite 847",
            city: "McKenziehaven",
            zipcode: "59590-4157",
            geo: {
                lat: "-68.6102",
                lng: "-47.0653"
            }
        },
        phone: "1-463-123-4447",
        website: "ramiro.info",
        company: {
            name: "Romaguera-Jacobson",
            catchPhrase: "Face to face bifurcated interface",
            bs: "e-enable strategic applications"
        }
    },
    {
        id: 4,
        name: "Patricia Lebsack",
        username: "Karianne",
        email: "Julianne.OConner@kory.org",
        address: {
            street: "Hoeger Mall",
            suite: "Apt. 692",
            city: "South Elvis",
            zipcode: "53919-4257",
            geo: {
                lat: "29.4572",
                lng: "-164.2990"
            }
        },
        phone: "493-170-9623 x156",
        website: "kale.biz",
        company: {
            name: "Robel-Corkery",
            catchPhrase: "Multi-tiered zero tolerance productivity",
            bs: "transition cutting-edge web services"
        }
    },
    {
        id: 5,
        name: "Chelsey Dietrich",
        username: "Kamren",
        email: "Lucio_Hettinger@annie.ca",
        address: {
            street: "Skiles Walks",
            suite: "Suite 351",
            city: "Roscoeview",
            zipcode: "33263",
            geo: {
                lat: "-31.8129",
                lng: "62.5342"
            }
        },
        phone: "(254)954-1289",
        website: "",
        company: {
            name: "Keebler LLC",
            catchPhrase: "User-centric fault-tolerant solution",
            bs: "revolutionize end-to-end systems"
        }
    }
]

// emailsUsuarisSenseWeb()
// Devuelve los emails de los usuarios que no tienen website (usa filter + map).
const emailsUsuarisSenseWeb = (objetoParam) => objetoParam.filter((elem) => elem.website === "").map((elem) => elem.email);
console.log(emailsUsuarisSenseWeb(dadesUsuaris));
// nomEmpresaCiutat()
// Devuelve un array con objetos que contengan:
const nomEmpresaCiutat = (objetoParam) => objetoParam.map(({company, address}) => ({empresa: company.name, ciutat: address.city }));
console.log(nomEmpresaCiutat(dadesUsuaris));
// { empresa: nomEmpresa, ciutat: nomCiutat }


// (usa map y destructuring).

// nomICiutatAmbSaltDeLinia()
// Crea un array de strings con el siguiente formato para cada usuario:
const nomICiutatAmbSaltDeLinia = (objetoParam) => objetoParam.reduce((acum, elem) => {
    acum.push(`${elem.name} ${elem.address.city}`);
    return acum;
}, []);

const nomICiutatAmbSaltDeLiniaMap = (objetoParam) => objetoParam.map((elem) => `${elem.name} \n ${elem.address.city}`)
console.log(nomICiutatAmbSaltDeLinia(dadesUsuaris));
console.log(nomICiutatAmbSaltDeLiniaMap(dadesUsuaris));

// Leanne Graham
// Gwenborough


// (usa map).

// llistatAmbTelefonCurt()
// Devuelve un array con los nombres de los usuarios cuyo teléfono tenga menos de 15 caracteres.
const llistatAmbTelefonCurt = (objetoParam) => objetoParam.filter((elem) => elem.phone.length < 15).map((elem) => elem.name);
console.log(llistatAmbTelefonCurt(dadesUsuaris));

// 🔵 NIVEL 3 — Combinando métodos y creando estructuras nuevas

// llistaAmbEmpresaYSenseWeb()
// Devuelve un array con { id, name, companyName } solo de los usuarios que no tienen website.
// → Usa filter + map.
const llistaAmbEmpresaYSenseWeb = (objetoParam) => objetoParam.filter((elem) => elem.website==="").map(({id, name, company}) => ({
    id, name, companyName: company.name
}));
console.log(llistaAmbEmpresaYSenseWeb(dadesUsuaris));

// llistaCompletaAdreces()
// Devuelve un array con los datos combinados así:

// {
//   nom: "Ervin Howell",
//   ciutat: "Wisokyburgh",
//   address: "Victor Plains, Suite 879, 90566-7771"
// }

const llistaCompletaAdreces = (objetoParam) => objetoParam.map(({name, address}) => ({
    nom: name, ciutat: address.city, address: `${address.street} ${address.suite} ${address.zipcode} ${address.geo.lat} ${address.geo.lng}`
}));
console.log(llistaCompletaAdreces(dadesUsuaris));

// (usa map y template strings o concatenación).

// usuarisPerCiutat()
// Devuelve un objeto (no array) donde las claves sean las ciudades y los valores sean arrays con los nombres de las personas que viven ahí.
// Ejemplo:

// {
//   Gwenborough: ["Leanne Graham"],
//   Wisokyburgh: ["Ervin Howell"],
//   ...
// }
const usuarisPerCiutat = (objetoParam) => 
  objetoParam.reduce((acum, elem) => {
    const ciutat = elem.address.city;
      acum[ciutat] = []; // si no existe, la creamos
    acum[ciutat].push(elem.name); // añadimos el nombre del usuario
    return acum;
  }, {});

console.log(usuarisPerCiutat(dadesUsuaris));

// (usa reduce).

// emailsEmpresesAmbWord()
// Devuelve los emails de los usuarios cuya empresa (company.name) contenga la palabra "Romaguera".
// (usa filter + map + includes).
const emailsEmpresesAmbWord = (objetoParam) => objetoParam.filter((elem) => elem.company.name.toLowerCase().includes("romaguera")).map((elem) => elem.name)
console.log(emailsEmpresesAmbWord(dadesUsuaris));

const nameCiudadSBsinWeb = (objetoParam) => objetoParam.filter((elem) => elem.website === "").map(({name, address, company}) => ({
    nom: name, ciutat: address.city, compani: company.bs
}));
console.log(nameCiudadSBsinWeb(dadesUsuaris));