//hecho por Samuel Rodriguez
import { Text, Pressable, TextInput, View, StyleSheet } from 'react-native';
import {useState} from 'react';

export default function Ejercicio2() {
  const[nom, setNom] = useState("Nombre");
  const[apellido, setApellido] = useState("Apellido");
  const [nick, setNick] = useState("Nickname");
  const [array, setArray] =useState([]);

  const handleOnPress = () => {
    if (!isNaN(nom) || nom==null || nom=="") {
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
      <TextInput
        style={{ height: 50 }}
        placeholder="Nombre"
        defaultValue="Nickname"
        value={nom}
        onChangeText={(newNom) => setNom(newNom)}
      />
      <TextInput
        style={{ height: 50 }}
        placeholder="Apellido"
        defaultValue="value"
        value={apellido}
        onChangeText={(newApe) => setApellido(newApe)}
      />
      <TextInput
        style={{ height: 50 }}
        placeholder="Nickname"
        defaultValue="value"
        value={nick}
        onChangeText={(newNick) => setNick(newNick)}
      />
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