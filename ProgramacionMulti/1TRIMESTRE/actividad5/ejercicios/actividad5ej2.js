import {
  Text,
  TextInput,
  Pressable,
  Image,
  View,
  StyleSheet,
} from "react-native";
import { useState } from "react";

export default function Ejec4() {
  //constantes
  const [text, setText] = useState("");
  const [array, setArray] = useState([]);

  function handleOnPress() {
    let arrayDigits = [...array];
    if (text === "" || text === null) {
      alert("no se ha introducido nada");
    } else if (!isNaN(text)) {
      alert("se ha introducido el digito: " + text);
      arrayDigits.push(text);
      setArray(arrayDigits);
    } else {
      alert("se ha introducido el texto: " + text);
    }
    setText("");
  }

  return (
    <View style={styles.container}>
      <TextInput
        style={styles.input}
        placeholder="Inserta tu texto..."
        onChangeText={(newText) => setText(newText)}
        defaultValue={text}
      />

      <Pressable style={styles.btn} onPress={handleOnPress}>
        <Text>Botón</Text>
      </Pressable>
      {array.map((value, index) => (
        <Text key={index}>{value}</Text>
      ))}
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "white",
    alignItems: "center",
    justifyContent: "center",
  },
  btn: {
    backgroundColor: 'blue', 
    borderRadius: 4,
    width: 100,
    height: 30,
    justifyContent: 'center', 
    alignItems: 'center',
  },
    input: {
    fontSize: 20, 
    fontWeight: 'bold',
    textAlign: 'center'
  }, 
});