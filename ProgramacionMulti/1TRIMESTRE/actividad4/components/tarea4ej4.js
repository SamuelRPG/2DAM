import { StyleSheet, View } from 'react-native';
import { useState } from 'react';

export default function App() {
  const [circulos, setCirculos] = useState([
    // Fila 1
    { backgroundColor: 'red' },
    { backgroundColor: 'blue' },
    { backgroundColor: 'green' },
    // Fila 2
    { backgroundColor: 'blue' },
    { backgroundColor: 'green' },
    { backgroundColor: 'red' },
    // Fila 3
    { backgroundColor: 'green' },
    { backgroundColor: 'red' },
    { backgroundColor: 'blue' },
  ]);

  return (
    <View style={styles.container}>
      <View style={styles.grid}>
        {circulos.map((el, i) => (
          <View key={i} style={[styles.circle, el]} />
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
  grid: {
    flexDirection: 'row',
    flexWrap: 'wrap',
    width: 330, // ancho para acomodar 3 círculos de 100px + márgenes
    justifyContent: 'center',
  },
  circle: {
    width: 100,
    height: 100,
    borderRadius: 50,
    margin: 5,
  },
});