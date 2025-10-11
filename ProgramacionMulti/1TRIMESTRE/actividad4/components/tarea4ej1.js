import { StyleSheet, View } from 'react-native';
import { useState } from 'react';

export default function App() {
  const [cuadrados, setCuadrados] = useState([
    { width: 100, height: 100, backgroundColor: 'yellow' }, 
    { width: 300, height: 300, backgroundColor: 'red' },
  ]);

  return (
    <View style={styles.container}>
      <View style={{ flexDirection: 'column' }}>
        {cuadrados.map((el, i) => (
          <View key={i} style={el}/>
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
});