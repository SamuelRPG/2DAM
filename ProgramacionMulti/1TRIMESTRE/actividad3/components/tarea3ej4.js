import { Pressable, TextInput, Text, View, StyleSheet } from 'react-native';
import { useState } from 'react';

export default function App() {
  const[text, setText] = useState('');

  function handleOnPress() {
    if (text=='') {
      alert("No has introducido nada")
    } else if (text == Number.parseInt(text)) {
      alert("Has introducido un numero")
    } else alert("Has introducido texto");
  }
  return (
    <View style={styles.container}> 
      <TextInput
        onChangeText={(newText) => setText(newText)}
        defaultValue={text}
        placeholder="Un video mas mi gente"
        style={styles.input}
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
  buttonText: {
    color: 'white',
    fontWeight: 'bold',
  },
});