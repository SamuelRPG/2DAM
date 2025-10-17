import { Text, Pressable, TextInput, View, StyleSheet } from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>
      <Text style={{ fontSize: 30 }}>Datos usuario</Text>
      <TextInput
        style={{ height: 50 }}
        placeholder="placeholder"
        defaultValue="value"
        value="value"
      />
      <TextInput
        style={{ height: 50 }}
        placeholder="placeholder"
        defaultValue="value"
        value="value"
      />
      <TextInput
        style={{ height: 50 }}
        placeholder="placeholder"
        defaultValue="value"
        value="value"
      />
      <Pressable>
        <Text style={styles.text}>Pulsa</Text>
      </Pressable>
      <Text>Nombre: , Apellido: , Nickname: </Text>
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
  text: {
    height: 40,
    width: 80,
    backgroundColor: 'lightblue',
    borderRadius: 8,
    padding: 6,
  },
});
