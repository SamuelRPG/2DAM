import { StyleSheet, View } from 'react-native';
import { useState } from 'react';

export default function App() {
  const [formas, setCuadrados] = useState([
    {
    width: 0,
    height: 0,
    backgroundColor:'transparent',
    borderStyle:'solid',
    borderLeftWidth:50,
    borderRightWidth:50,
    borderBottomWidth:100,
    borderLeftColor:"transparent",
    borderRightColor:"transparent",
    borderBottomColor:"blue",
    }, 
    {
      height: 100, 
      width: 100,
      backgroundColor: 'blue'
    }, 
    {
      width: 300, 
      height: 100,
      backgroundColor: 'blue',
    },

  ]);

  return (
    <View style={styles.container}>
        {formas.map((el, i) => (
          <View key={i} style={el}/>
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
});