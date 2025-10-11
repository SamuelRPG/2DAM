import { Pressable, View, StyleSheet } from 'react-native';
import { useState } from 'react';

export default function App() {
  const [square1, setSquare1] = useState({
    width: 200,
    height: 200,
    backgroundColor: 'yellow',
  });
  const [square2, setSquare2] = useState({
    width: 200,
    height: 200,
    backgroundColor: 'yellow',
  });

  function handleOnPress(id) {
    if (id===1) {
      setSquare1 ({
        width: square1.width+10,
        height: square1.height+10,
        backgroundColor: 'green',
      });
      setSquare2({
        width: square2.width+10,
        height: square2.height+10,
        backgroundColor: 'green',
      })
    } else {
      setSquare2({
        width: square2.width-10, 
        height: square2.height-10,
        backgroundColor: 'yellow',
      });
      setSquare1({
        width: square1.width-10,
        height: square1.height-10,
        backgroundColor: 'yellow',
      });
    }
  }
  return (
    <View style={styles.container}>
      <Pressable style={styles.square, square1} onPress={() => handleOnPress(1)}></Pressable>
      <Pressable style={styles.square, square2} onPress={() => handleOnPress(2)}></Pressable>
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
});