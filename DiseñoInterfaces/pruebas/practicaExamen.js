const dadesClients = [
  {
    id: 1,
    name: "Laura Martínez",
    username: "lauram",
    email: "laura.martinez@example.com",
    address: {
      street: "Gran Via",
      suite: "Piso 3B",
      city: "Barcelona",
      zipcode: "08010",
      geo: { lat: "-41.3851", lng: "2.1734" }
    },
    phone: "934-112-223",
    website: "lauram.dev",
    company: {
      name: "TechNova",
      catchPhrase: "Innovating tomorrow’s code",
      bs: "develop smart digital ecosystems"
    }
  },
  {
    id: 2,
    name: "Carlos Ruiz",
    username: "carlosr",
    email: "carlos.ruiz@example.com",
    address: {
      street: "Calle Mayor",
      suite: "1ºA",
      city: "Madrid",
      zipcode: "28013",
      geo: { lat: "40.4168", lng: "-3.7038" }
    },
    phone: "915-789-321",
    website: "",
    company: {
      name: "DataFlow",
      catchPhrase: "Turning data into insights",
      bs: "optimize big data pipelines"
    }
  },
  {
    id: 3,
    name: "María López",
    username: "marial",
    email: "maria.lopez@example.com",
    address: {
      street: "Av. Libertad",
      suite: "Edificio Sol, 4ºD",
      city: "Valencia",
      zipcode: "46002",
      geo: { lat: "39.4699", lng: "-0.3763" }
    },
    phone: "963-441-112",
    website: "marialopez.io",
    company: {
      name: "WebWorks",
      catchPhrase: "Connecting creativity and technology",
      bs: "design scalable web platforms"
    }
  },
  {
    id: 4,
    name: "David Gómez",
    username: "davidg",
    email: "david.gomez@example.com",
    address: {
      street: "Ronda Norte",
      suite: "Bloque 12",
      city: "Sevilla",
      zipcode: "41015",
      geo: { lat: "37.3886", lng: "-5.9823" }
    },
    phone: "954-220-456",
    website: "",
    company: {
      name: "SoftVision",
      catchPhrase: "Empowering your digital presence",
      bs: "deliver cloud-based applications"
    }
  }
];


// llistat_Id_Nom_Email_clients()
// Devuelve un array con objetos que contengan id, name y email de cada cliente (usa map).
const llistat_Id_Nom_Email_clients = (objetoParam) => objetoParam.map((elem) => {
    return {
        id: elem.id, 
        name: elem.name,
        email: elem.email,
    }
});
const llistat_Id_Nom_Email_clientsPRO = (objetoParam) => objetoParam.map(({id, name, email}) => ({id, name, email}));
console.log(llistat_Id_Nom_Email_clientsPRO(dadesClients));


// llistaClientsSenseWeb()
// Devuelve un array con los nombres de los clientes que no tienen website (usa filter + map).
const llistaClientsSenseWeb = (objetoParam) => objetoParam.filter((elem) => 
    elem.website === "").map((usuario) => usuario.name);
console.log(llistaClientsSenseWeb(dadesClients));

// emailsDeMadrid()
// Devuelve un array con los emails de los clientes que viven en Madrid (usa filter + map).
const emailsDeMadrid = (objetoParam) => objetoParam.filter((elem ) => elem.address.city === "Madrid").map((elem) => elem.email);
console.log(emailsDeMadrid(dadesClients));
// 🟡 Nivel 2 — Intermedios

// llistaAmbAdrecesCompletes()
// Devuelve un array de objetos con id, name y address (string concatenando street, suite, zipcode, city).
const llistaAmbAdrecesCompletes = (objetoParam) => objetoParam.map(({id, name, address}) => 
    ({
        id, 
        name, 
        address: address.street + " " + address.suite + " " + address.zipcode + " " + address.city
    }));
    console.log(llistaAmbAdrecesCompletes(dadesClients));
// idEmpresesSenseWeb()
// Devuelve un array de objetos { id: X } de los clientes que no tienen website (usa reduce).
const idEmpresesSenseWeb = (objetoParam) => objetoParam.reduce((objetoDevuelto, elem) => {
    if (elem.website === "") {
        objetoDevuelto.push({ id: elem.id})
    }
    return objetoDevuelto;
}, []);
console.log(idEmpresesSenseWeb(dadesClients));

// clientsAmbLatitudPositiva()
// Devuelve los nombres de los clientes cuya lat (latitud) sea positiva (usa filter dentro de un map o viceversa).
const clientsAmbLatitudPositiva = (objetoParam) => objetoParam.filter((elem) => elem.address.geo.lat > 0).map((elem) => elem.name);
console.log(clientsAmbLatitudPositiva(dadesClients));

// 🔵 Nivel 3 — Avanzados (máximo 2 métodos anidados)

// emailsEmpresesCloud()
// Devuelve los emails de los clientes cuya empresa (company.bs) contenga la palabra "cloud" (usa filter + map).
const emailsEmpresesCloud = (objetoParam) => objetoParam.filter((elem) => elem.company.bs.toLowerCase().includes("cloud")).map((elem) => elem.email)
console.log(emailsEmpresesCloud(dadesClients));

// nomsICiutatsSenseWeb()
// Devuelve un array de objetos { name, city } de los clientes que no tienen website (usa filter + map).
const nomsICiutatsSenseWeb = (objetoParam) => objetoParam.filter((elem) => elem.website === "").map((elem) => ({ name: elem.name, city: elem.address.city }));
console.log(nomsICiutatsSenseWeb(dadesClients));

// idsClientsEnLatitudOest()
// Devuelve los IDs de los clientes cuya longitud (lng) sea negativa (usa filter + map).

// clientsAmbWebIOmple()
// Devuelve un array con { name, website } pero solo si el website no está vacío y tiene más de 8 caracteres (usa filter + map).

// infoEmpresaClientSenseWeb()
// Devuelve un array con { name: nombreCliente, company: nombreEmpresa } de aquellos clientes sin website (usa reduce o filter + map).
const infoEmpresaClientSenseWeb = (objetoParam) => objetoParam.filter((elem) => elem.website === "").reduce((acum, elem) => {
    acum.push({name: elem.name, company: elem.company.name})
    return acum;
}, []);
console.log(infoEmpresaClientSenseWeb(dadesClients));

// ciutatsAmbClientsSenseWeb()
// Devuelve las ciudades donde haya clientes sin website (usa filter + map).