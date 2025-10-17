//hecho por Samuel Rodriguez
import { StyleSheet, View, Pressable } from 'react-native';
import { useState } from 'react';

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
  ]);

  const handleOnPress = (index) => {
    let newArray = [...circulo];
    if (newArray[index].backgroundColor == 'red') {
      if (newArray[index].width >= 150) {
        newArray[index].width = 100;
        newArray[index].height = 100;
      } else {
        newArray[index].width += 10;
        newArray[index].borderRadius += 5;
        newArray[index].height += 10;
        newArray[index].backgroundColor = 'blue';
      }
    } else if (newArray[index].backgroundColor == 'blue') {
      if (newArray[index].width >= 150) {
        newArray[index].width = 100;
        newArray[index].height = 100;
      } else {
        newArray[index].width += 10;
        newArray[index].borderRadius += 5;
        newArray[index].height += 10;
        newArray[index].backgroundColor = 'green';
      }
    } else if (newArray[index].backgroundColor == 'green') {
      if (newArray[index].width >= 150) {
        newArray[index].width = 100;
        newArray[index].height = 100;
      } else {
        newArray[index].width += 10;
        newArray[index].borderRadius += 5;
        newArray[index].height += 10;
        newArray[index].backgroundColor = 'red';
      }
    }
    setCirculo(newArray);
  };
  return (
    <View style={styles.container}>
      <View style={styles.column}>
        {circulo.map((elem, i) => (
          <Pressable
            key={i.toString()}
            style={elem}
            onPress={() => handleOnPress(i)}></Pressable>
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
