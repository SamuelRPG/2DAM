//en este ejercicio hacemos el cuadrado central mas pequeño con 
//cada pulsacion sobre el boton

import { View, Pressable, Text, StyleSheet } from 'react-native';
import {useState} from 'react';
export default function App() {

const [bColor, setbColor] = useState('green');
const [bColorSquare, setbColorSquare] = useState('yellow');
const [wRectangle, setwRectangle] =useState(200);
const [hRectangle, sethRectangle] = useState(200);


  function handleOnPress(){
    if (bColor == 'green') {
       setbColor('yellow');
       setbColorSquare('green');
       }
    else {
       setbColor('green');
       setbColorSquare('yellow');
       }
    setwRectangle(wRectangle-20);
    sethRectangle(hRectangle-20);
  }
  return (
    <View style={[styles.container, {backgroundColor:bColor}]}>
      <View style={[styles.square, {width:wRectangle}, {height:hRectangle},{backgroundColor:bColorSquare}]} />
      <Pressable onPress={handleOnPress}>
        <Text style={styles.text}>Púlsame!</Text>
      </Pressable>
    </View>
  );
}
const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'green',
    alignItems: 'center',
    justifyContent: 'center',
  },
  square: {
    size: '100',
    mt: '-2',
    marginTop: -6,
    width: 200,
    height: 400,
    backgroundColor: 'yellow',
  },
  text: {
    height: 40,
    width: 80,
    backgroundColor: 'blue',
    borderRadius: 8,
    padding: 6,
  },
});