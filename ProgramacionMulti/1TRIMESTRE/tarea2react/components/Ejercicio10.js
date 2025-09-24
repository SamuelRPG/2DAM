import { View, Pressable, Text, StyleSheet } from 'react-native';
import { useState } from 'react';

export default function Ejercicio10() {
  const [conditions, setConditions] = useState({ color: 'white', limit: 390 });
  const [square, setSquare] = useState({
    color: 'green',
    side: 150
  });

  function handleOnPress() {
    if (square.color === 'yellow' && square.side <= conditions.limit) {
      setConditions({ color: 'white', limit: 390 });
      setSquare({
        color: 'green',
        side: square.side + 10,
      });
    } else if (square.color === 'yellow' && square.side > conditions.limit) {
      setConditions({ color: 'white', limit: 150 });
      setSquare({
        color: 'green',
        side: square.side - 10,
      });
    } else if (square.color === 'green' && square.side <= conditions.limit) {
      setConditions({ color: 'black', limit: 390 });
      setSquare({
        color: 'yellow',
        side: square.side + 20,
      });
    } else if (square.color === 'green' && square.side > conditions.limit) {
      setConditions({ color: 'black', limit: 150 });
      setSquare({
        color: 'yellow',
        side: square.side - 20,
      });
    }
  }

  return (
    <View style={[styles.container, { backgroundColor: conditions.color }]}>
      <View
        style={[
          styles.square,
          {
            width: square.side,
            height: square.side,
            backgroundColor: square.color,
          },
        ]}
      />
      <Pressable onPress={handleOnPress}>
        <Text style={styles.text}>Púlsame!</Text>
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
  square: {
    marginTop: -6,
    width: 200,
    height: 200,
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
