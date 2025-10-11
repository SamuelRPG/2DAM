import { StyleSheet, View } from 'react-native';
import { useState } from 'react';

export default function App() {
  const [semicirculos, setSemicirculos] = useState([
    // Cada círculo tiene dos semicircunferencias (izquierda roja, derecha azul)
    {
      left: { width: 200, height: 200, backgroundColor: 'red', borderTopLeftRadius: 100, borderBottomLeftRadius: 100 },
      right: { width: 200, height: 200, backgroundColor: 'blue', borderTopRightRadius: 100, borderBottomRightRadius: 100 },
    },
    {
      left: { width: 150, height: 150, backgroundColor: 'red', borderTopLeftRadius: 75, borderBottomLeftRadius: 75 },
      right: { width: 150, height: 150, backgroundColor: 'blue', borderTopRightRadius: 75, borderBottomRightRadius: 75 },
    },
    {
      left: { width: 100, height: 100, backgroundColor: 'red', borderTopLeftRadius: 50, borderBottomLeftRadius: 50 },
      right: { width: 100, height: 100, backgroundColor: 'blue', borderTopRightRadius: 50, borderBottomRightRadius: 50 },
    },
  ]);

  return (
    <View style={styles.container}>
      {semicirculos.map((el, i) => (
        <View key={i} style={styles.row}>
          <View style={el.left} />
          <View style={el.right} />
        </View>
      ))}
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
  row: {
    flexDirection: 'row',
    justifyContent: 'center',
    alignItems: 'center',
    marginVertical: 10,
  },
});
