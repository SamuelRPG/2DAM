import { StyleSheet, View, Pressable } from 'react-native';
import {useState} from 'react';

export default function Ejercicio1() {
  const [circulo, setCirculo] = useState([
    {
      width: 100, 
      height: 100, 
      borderRadius: 50,
      backgroundColor: 'red',
    },
    {
      width: 100,
      height: 100,
      borderRadius: 50,
      backgroundColor: 'blue',
    },
    {
      width: 100,
      height: 100,
      borderRadius: 50,
      backgroundColor: 'green',
    },
])

      const handleOnPress = (index) => {
        let newArray = [...circulo];
        if (newArray[index].backgroundColor == 'red') {
          newArray[index].backgroundColor=='blue';
        } else if (newArray[index].backgroundColor == 'blue') {
          newArray[index].backgroundColor == 'green';
        } else if (newArray[index].backgroundColor == 'green') {
          newArray[index].backgroundColor == 'red';
        }
        setCirculo(newArray);
    }
  return (
    <View style={styles.container}>
      <View style={styles.column}>
        {circulo.map((elem, i) => (
          <Pressable 
          key={i.toString()}
          style={elem}
          onPress={() => handleOnPress(i)}
          >
          </Pressable>
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
  column: {
    flexDirection: 'column',
    alignItems: 'center',
    marginBottom: 30, 
  },
});
