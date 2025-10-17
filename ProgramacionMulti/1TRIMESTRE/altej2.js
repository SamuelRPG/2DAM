//hecho por Samuel Rodriguez
import { Text, Pressable, TextInput, View, StyleSheet } from 'react-native';
import {useState} from 'react';

export default function Ejercicio2() {
  const[datos, setDatos] = useState([
  {
    valor: "Nombre",
  }, 
  {
    valor: "Apellido"
  },
  {
    valor: "Nickname",
  },
  ])
  const [array, setArray] =useState([]);

  const handleOnPress = () => {
    let newDatos = [...datos];
    if (!isNaN(newDatos.valor)) {
      alert("El nombre introdcudio no es válido")
    } else if (!isNaN(apellido) || apellido==null || apellido=="") {
      alert("El apellido introducido no es válido")
    } else if (!isNaN(nick) || nick==null || nick=="") {
      alert("El nickname introducido no es válido")
    } else {
      let newArray = [...array];
      newArray.push({nombre: nom, ape: apellido, nickname: nick});
      setArray(newArray);
    }
  }

  return (
    <View style={styles.container}>
      <Text style={{ fontSize: 30 }}>Datos usuario</Text>
      {datos.map((elem, i) => (
        <TextInput
        style={{ height: 50 }}
        placeholder=""
        defaultValue=""
        value={elem.valor}
        onChangeText={(newText) => elem.valor(newText)}
        />
      ))}
      <Pressable
      onPress={() => handleOnPress()}>
        <Text style={styles.text}>Pulsa</Text>
      </Pressable>
      <View>
      {array.map((value) => (
        <Text>Nombre: {value.nombre} Apellido: {value.ape} Nickname: {value.nickname} </Text>
      ))}
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  text: {
    height: 40,
    width: 80,
    backgroundColor: 'lightblue',
    borderRadius: 8,
    padding: 6,
  },
});