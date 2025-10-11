import { View, Pressable, Text, Image, StyleSheet } from 'react-native';
import {useState} from 'react';
export default function App() {

  const [bColor, setColor ] = useState('green');
  const [txtShown, setText] = useState('My title');
  const [imgSource, setImgSource] = useState(require('../assets/snack-icon.png'));

  function handleOnPress() {
    if (bColor == 'green') {
        setColor('yellow'),
        setText('My new title'), 
        setImgSource(require('../assets/spongebob-smile.png'));
    } else {
        setColor('green'), 
        setText('My title');
        setImgSource(require('../assets/snack-icon.png'));
    }
  }
  return (
    <View style={[styles.container, {backgroundColor: bColor}]}>
      <Text style={styles.title}>{txtShown}</Text>
      <Image style={styles.image} source={imgSource} />
      <Pressable onPress={handleOnPress}>
        <Text style={styles.text}>Púlsame!</Text>
      </Pressable>
    </View>
  );
}
const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  title: {
    fontSize: 25,
    fontWeight: 'bold',
    fontStyle: 'italic',
    textDecorationLine: 'underline',
  },
  image: {
    width: 200,
    height: 200,
  },
  text: {
    height: 40,
    width: 80,
    backgroundColor: 'blue',
    borderRadius: 8,
    padding: 6,
  },
});