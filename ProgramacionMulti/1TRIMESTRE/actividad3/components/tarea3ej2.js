import { Text, Pressable, Image, View, StyleSheet } from 'react-native';
import {useState } from 'react';
export default function App() {
  const [space1, setSpace1] = useState({
    text: 'Texto 1', 
    //image: require('./assets/patrick.jpg'),
  });
  const [space2, setSpace2] = useState ({
    text: 'Texto 2',
    //image: require('./assets/spongebob.jpg'),
  });

  function handleOnImage(id) {
    if (id ===1) {
      if (space1.text==='Texto 1') {
        setSpace1({
          text: 'Texto 1 cambiado',
          //image: require('./assets/squidward.jpg'),
        });
      }
        else {
        setSpace1({
          text: 'Texto 1', 
          //image: require('./assets/patrick.jpg'),
        });
        }
      }
      if (id===2) {
        if (space2.text==='Texto 2') {
          setSpace2({
          text: 'Texto 2 cambiado', 
          //image: require('./assets/plankton.jpg'),
        });
      }
      else {
        setSpace2({
          text: 'Texto 2', 
          //image: require('./assets/spongebob.jpg'),
        });
      }
    }
  }
  return (
    <View style={styles.containerRow}>
      <Pressable onPress={() => (handleOnImage(1))}>
        <Image style={styles.image} source={space1.image} />
        <Text>{space1.text}</Text>
      </Pressable>
      <Pressable onPress={() => (handleOnImage(2))}>
        <Image style={styles.image} source={space2.image} />
        <Text>{space2.text}</Text>
      </Pressable>
    </View>
  );
}
const styles = StyleSheet.create({
  containerRow: {
    flex: 1,
    backgroundColor: 'white',
    alignItems: 'center',
    justifyContent: 'center',
    flexDirection: 'row',
  },
  image: {
    width: 100,
    height: 100,
  },
});