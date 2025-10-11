import { Text, View, StyleSheet } from 'react-native';
import { useState } from 'react';
export default function App() {
  const [texto1, setTexto1] = useState("Hola");
  const [texto2, setTexto2] = useState("tilin");
  const [texto3, setTexto3] = useState("payo");
  const [texto4, setTexto4] = useState("blanquitaaa");


  function handleOnText(texto) {
    if (texto === "Hola") setTexto1("Adios");
    if (texto === "tilin") setTexto2("zaza");
    if (texto === "payo") setTexto3("gitano");
    if (texto === "blanquitaaa") setTexto4("como la coca");
  }


  return (
    <View style={styles.container}>
      <Text style={styles.text} onPress={() => handleOnText(texto1)}>{texto1}</Text>
      <Text style={styles.text} onPress={() => handleOnText(texto2)}>{texto2}</Text>
      <Text style={styles.text} onPress={() => handleOnText(texto3)}>{texto3}</Text>
      <Text style={styles.text} onPress={() => handleOnText(texto4)}>{texto4}</Text>
    </View>
  );
}
const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'white',
    alignItems: 'center',
    justifyContent: 'center',
  },
  text: {
    fontSize: 30,
    marginBottom: 20,
  },
});