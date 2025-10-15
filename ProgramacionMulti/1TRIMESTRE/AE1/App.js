import { Text, View, Pressable } from 'react-native';


export default function App() {

  return (
    <View style={{ justifyContent: 'center', alignSelf: "center", marginVertical: 80 }}>

      <Text style={{ fontSize: 45, fontWeight: "bold" }}>Calculadora</Text>

      <View style={{ marginTop: 5 }}>
        <View style={{ flexDirection: "row", marginBottom: 10, height: 70, width: 340, borderRadius: 4, borderWidth: 1 }}>
          <Text style={{ fontSize: 50, textAlign: "right", flex: 1 }}>Hola</Text>
        </View>
        <View style={{ flexDirection: "row" }}>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>sen</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>cos</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>tan</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>deg</Text></Pressable>
          </View>
        </View>
        <View style={{ flexDirection: "row" }}>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>ln</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>log</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>&Pi;</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>rad</Text></Pressable>
          </View>
        </View>
        <View style={{ flexDirection: "row" }}>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>1/X</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>!</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>√</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>/</Text></Pressable>
          </View>
        </View>
        <View style={{ flexDirection: "row" }}>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'blue' }}><Text>7</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'blue' }}><Text>8</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'blue' }}><Text>9</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>x</Text></Pressable>
          </View>
        </View>
        <View style={{ flexDirection: "row" }}>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'blue' }}><Text>4</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'blue' }}><Text>5</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'blue' }}><Text>6</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>-</Text></Pressable>
          </View>
        </View>
        <View style={{ flexDirection: "row" }}>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'blue' }}><Text>1</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'blue' }}><Text>2</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'blue' }}><Text>3</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>+</Text></Pressable>
          </View>
        </View>
        <View style={{ flexDirection: "row" }}>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>C</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'blue' }}><Text>0</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>,</Text></Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable style={{ borderRadius: 8, justifyContent: 'center', alignItems: 'center', textAlignVertical: 'center', width: 80, height: 80, backgroundColor: 'gray' }}><Text>=</Text></Pressable>
          </View>
        </View>
      </View>

    </View>
  )
}
