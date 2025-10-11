import { Pressable, TextInput, Text, View, StyleSheet } from 'react-native';
import { useState } from 'react';

export default function App() {
  const[text, setText] = useState('');

  function handleOnPress() {
      if (text==='' || text == null) {
        alert("No has introducido nada");
      } else { 
        return (validarDNI(text)) ? alert("DNI introducido válido") : alert("DNI introducido no válido");
      }
    }
    
    function validarDNI(dni) {
       const letrasDNI = [
      "T", "R", "W", "A", "G", "M", "Y", 
      "F", "P", "D", "X", "B", "N", "J", 
      "Z", "S", "Q", "V", "H", "L", "C", 
      "K", "E"
      ];
      //convierto text en array 
      let dniSinLetra=dni.slice(0, -1);
      let dniOrigen = dni.split('');
      let letraOriginal = dniOrigen.pop();
      let resto = dniSinLetra%23;
      let letra = letrasDNI[resto];

      return letra === letraOriginal ? true : false;
    }
  return (
    <View style={styles.container}> 
    <Text style={styles.mainText}>Validad de DNI</Text>
      <TextInput
        onChangeText={(newText) => setText(newText)}
        defaultValue={text}
        placeholder="Introduce tu DNI"
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

