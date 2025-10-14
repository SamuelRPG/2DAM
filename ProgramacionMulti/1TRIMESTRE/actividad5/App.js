import {
  Text,
  TextInput,
  Pressable,
  Image,
  View,
  StyleSheet,
} from "react-native";
import { use, useState } from "react";

export default function Ejec4() {
  //constantes
  const [text, setText] = useState("");
  const [textIndex, setTextIndex] = useState("");
  const [array, setArray] = useState([]);
  const [textPosicion, setTextPosicion] = useState("");

  function handleOnPress() {
    let newArray = [...array];
    if (text === "" || text === null) {
      alert("No has introducido nada");
    } else {
          newArray.push(text);
          setArray(newArray);
    }
    setText("");

  }

  function searchIndex() {
    if (textIndex === "" || textIndex === null) {
      alert("No has introducido nada")
    }
    else if (isNaN(textIndex)) {
      alert("Introduce un solo número")
    } else if (textIndex > array.length) {
      alert("No existe esta posición del array")
    } else {
      setTextPosicion(array[textIndex]);
    }
    setTextIndex("");
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

      <TextInput
        style={styles.input}
        placeholder="Inserta posicion del array"
        onChangeText={(newText2) => setTextIndex(newText2)}
        defaultValue={textIndex}
      />
      <Pressable style={styles.btn} onPress={searchIndex}>
        <Text>Botón</Text>
      </Pressable>
        <Text> {textPosicion} </Text>
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
    backgroundColor: "blue",
    borderRadius: 4,
    width: 100,
    height: 30,
    justifyContent: "center",
    alignItems: "center",
  },
  input: {
    fontSize: 20,
    fontWeight: "bold",
    textAlign: "center",
  },
});