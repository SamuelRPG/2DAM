import { StyleSheet, Pressable, TextInput, Text, View, Alert } from 'react-native';
import { useState } from 'react';
// You can import supported modules from npm
import { Card } from 'react-native-paper';

// or any files within the Snack
import AssetExample from './components/AssetExample';

export default function App() {

  const[miArray, setmiArray] = useState([]);
  const[text, setText] = useState();

  const handleOnPress = () => {
    let newArray = [...miArray];
    if (text.trim() === '') {
      Alert.alert("No has introducido nada");
    } else if (isNaN(text)) {
      Alert.alert("No has introducido un número");
    }

  }
  return (
    <View style={styles.container}>
      <TextInput 
      defaultValue={text}
      onChangeText={(newText) => setText(newText)}
      style={styles.input}
      placeholder="Tilin vs zaza"/>
      <Pressable onPress={handleOnPress}> 
      <Text style={styles.text}> Pulsame </Text> 
      </Pressable>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    backgroundColor: '#ecf0f1',
    padding: 8,
    alignItems: 'center', 
  },
  input: {
    fontSize: 20, 
    fontWeight: 'bold',
    textAlign: 'center'
  }, 
  text: {
   height: 40,
    width: 80,
    backgroundColor: 'blue',
    borderRadius: 8,
    padding: 6,
  }
  
});
