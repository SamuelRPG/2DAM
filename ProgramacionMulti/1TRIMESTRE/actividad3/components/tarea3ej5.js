import { Pressable, TextInput, Text, View, StyleSheet } from 'react-native';
import { useState } from 'react';

export default function App() {
  const[text, setText] = useState('');
  const[text2, setText2] = useState('');

  function calculaMillas() {
    let cnv = (text*0.62137).toFixed(2);
    setText2(cnv);
  }
  function handleOnPress() {
    if (text=='') {
      alert("No has introducido nada")
    } else if (text == Number.parseInt(text)) {
      calculaMillas();
    } else alert("Has introducido texto, introduce numeros para hacer la conversion");
  }
  return (
    <View style={styles.container}> 
    <Text style={styles.mainText}>Convertidor de km a millas</Text>
      <TextInput
        onChangeText={(newText) => setText(newText)}
        defaultValue={text}
        placeholder="Introduce kilometros"
        style={styles.input}
      />
      <TextInput
        style={styles.input}
        defaultValue={text2}
        editable={false}
      />
      <Pressable style={styles.button}>
        <Text style={styles.buttonText} onPress={() => (handleOnPress())}>Pulsame</Text>
      </Pressable>
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
  input: {
    width: '80%',
    height: 40,
    borderWidth: 1,
    borderColor: 'gray',
    paddingHorizontal: 10,
    marginBottom: 20,
    borderRadius: 5,
  },
  button: {
    width: 100,
    height: 40, 
    backgroundColor: 'blue',
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 5,
  },
  mainText: {
    fontSize: 25,
    fontWeight: 'bold',
    marginBottom: 15,
  },
  buttonText: {
    color: 'white',
    fontWeight: 'bold',
  },
});