import { StyleSheet, View } from 'react-native';
import { useState } from 'react';

export default function App() {
  const [cuadrados, setCuadrados] = useState([
    { measureSquareOne: 100, backgroundColorOne: 'blue', measureSquareTwo: 100, backgroundColorTwo: 'blue'}, 
    { measureSquareOne: 100, backgroundColorOne: 'red', measureSquareTwo: 100, backgroundColorTwo: 'blue'},
    { measureSquareOne: 100, backgroundColorOne: 'red', measureSquareTwo: 100, backgroundColorTwo: 'red' },
  ]);

  return (
    <View style={styles.container}>
      <View style={{ flexDirection: 'column' }}>
        {cuadrados.map((el, i) => (
          <View key={i.toString()} style={{flexDirection:'row'}}>
            <View style={{
              height: el.measureSquareOne,
              width: el.measureSquareOne, 
              backgroundColor: el.backgroundColorOne,
            }}/>
              <View style={{
                height: el.measureSquareTwo,
                width: el.measureSquareTwo, 
                backgroundColor: el.backgroundColorTwo,
              }}/>
          </View>
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