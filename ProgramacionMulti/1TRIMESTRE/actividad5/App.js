import { Text, View, Pressable } from 'react-native';
import {useState} from 'react';

export default function Calculadora() {
  const [num1, setNum1] = useState("");
  const [num2, setNum2] = useState("");
  const [operador, setOperador] = useState(null);
  const[resultado, setResultado] = useState();
  
  function handleOnNum(valor) {
    if (valor === "." && !operador) {
      setNum1(prev => {
       const nuevoValor= prev + valor;
        setResultado(nuevoValor);
      });
    } else if (valor === ","){
        setNum2(prev => {
          const nuevoValor = prev + valor;
           setResultado(nuevoValor);
        });
    }
    else if(!operador) {
       setNum1(prev => {
        const nuevoValor = prev + valor;
         setResultado(nuevoValor);
       });
    } else {
      setNum2(prev => {
        const nuevoValor = prev + valor;
        setResultado(nuevoValor);
      }); 
  }
}
  function handleCalcular() {
  if (!num1 || !num2 || !operador) return; // si falta algo, no hacemos nada

  const n1 = parseFloat(num1);
  const n2 = parseFloat(num2);
  let res;

  switch (operador) {
    case "+":
      res = n1 + n2;
      break;
    case "-":
      res = n1 - n2;
      break;
    case "*":
      res = n1 * n2;
      break;
    case "/":
      res = n2 !== 0 ? n1 / n2 : "Error"; // evitar división por 0
      break;
    default:
      res = "Operador inválido";
  }

  setResultado(res.toString()); // actualizar display
  setNum1(res.toString());      // el resultado se convierte en nuevo num1
  setNum2("");
  setOperador(null);
}

  function handleOnC() {
    setResultado(0); setNum1(null); setNum2(null); setOperador(null);
  }
function handleOnOperador(operador) {
    setOperador(operador);
}
  
  function handleOnInversa(number) {
    number === null ? alert("no se puede operar") : 
    setResultado(1/number);
  }
  function handleOnFactorial(number) {
    if (number === null) alert("no se puede operar");
    else {
    let acum = 0;
    for (let i=number; i > 0; i--) {
        acum*=i;
    }
    setResultado(acum);
  }
}
  function handleOnRaiz(number) {
    number === null ? alert("no se puede operar") : 
    setResultado(Math.sqrt(number));
  }
  function handleOnLn(number) {
    number === null ? alert("no se puede operar") : 
    setResultado(Math.log(number))
  }
  function handleOnLog10(number) {
    number === null ? alert("no se puede operar") : 
    setResultado(Math.log10(number));
  }
  function handleOnPi() {
    if (!operador) {
      setNum1(Math.PI());
    } else setNum2(Math.PI());
  }
  function handleOnRad(number) {
    number === null ? alert("no se puede operar") : 
    setResultado(number * (Math.PI / 180));
  }
  function handleOnDeg(number) {
    number === null ? alert("no se puede operar") : 
    setResultado(number * (180 / Math.PI));
  }
  function handleOnSen(number) {
    number === null ? alert("no se puede operar") :
    setResultado(Math.sin(number));
  }
  function handleOnCos(number) {
  number === null ? alert("no se puede operar") :
  setResultado(Math.cos(number));
  }
  function handleOnTan(number) {
    number === null ? alert("no se puede operar") :
    setResultado(Math.tan(number));
  }
  return (
    <View
      style={{
        justifyContent: 'center',
        alignSelf: 'center',
        marginVertical: 80,
      }}>
      <Text style={{ fontSize: 45, fontWeight: 'bold' }}>Calculadora</Text>

      <View style={{ marginTop: 5 }}>
        <View
          style={{
            flexDirection: 'row',
            marginBottom: 10,
            height: 70,
            width: 340,
            borderRadius: 4,
            borderWidth: 1,
          }}>
          <Text style={{ fontSize: 50, textAlign: 'right', flex: 1 }}>
            {resultado}
          </Text>
        </View>
        <View style={{ flexDirection: 'row' }}>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnSen(num1)}
              >
                
              <Text>sen</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnCos(num1)}
              >
                
              <Text>cos</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnTan(num1)}
              >
                
              <Text>tan</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnDeg(num1)}
              >
                
              <Text>deg</Text>
            </Pressable>
          </View>
        </View>
        <View style={{ flexDirection: 'row' }}>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnLn(num1)}
              >
              <Text>ln</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnLog10(num1)}
              >
                
              <Text>log</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnPi()}
            >
                
              <Text>&Pi;</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnRad(num1)}
              >
              <Text>rad</Text>
            </Pressable>
          </View>
        </View>
        <View style={{ flexDirection: 'row' }}>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnInversa(num1)}
              >
                
              <Text>1/X</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnFactorial(num1)}
              >
                
              <Text>!</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnRaiz(num1)}
              >
                
              <Text>√</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnOperador("/")}
              >
                
              <Text>/</Text>
            </Pressable>
          </View>
        </View>
        <View style={{ flexDirection: 'row' }}>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'blue',
              }}
              onPress={() => handleOnNum("7")}
              >
                
              <Text>7</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'blue',
              }}
              onPress={() => handleOnNum("8")}
              >
                
              <Text>8</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'blue',
              }}
              onPress={() => handleOnNum("9")}
              >  
              <Text>9</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnOperador("*")}
              >
              <Text>x</Text>
            </Pressable>
          </View>
        </View>
        <View style={{ flexDirection: 'row' }}>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'blue',
              }}
              onPress={() => handleOnNum("4")}
              >
              <Text>4</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'blue',
              }}
              onPress={() => handleOnNum("5")}
              >
              <Text>5</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'blue',
              }}
              onPress={() => handleOnNum("6")}
              >
              <Text>6</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnOperador("-")}
              >
              <Text>-</Text>
            </Pressable>
          </View>
        </View>
        <View style={{ flexDirection: 'row' }}>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'blue',
              }}
               onPress={() => handleOnNum("1")}
              >
              <Text>1</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'blue',
              }}
              onPress={() => handleOnNum("2")}
              >
              <Text>2</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'blue',
              }}
              onPress={() => handleOnNum("3")}
              >
                
              <Text>3</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnOperador("+")}>
                
              <Text>+</Text>
            </Pressable>
          </View>
        </View>
        <View style={{ flexDirection: 'row' }}>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnC()}
              >
                
              <Text>C</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'blue',
              }}
              onPress={() => handleOnNum("0")}
              >
              <Text>0</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleOnNum(".")}
              >             
              <Text>,</Text>
            </Pressable>
          </View>
          <View style={{ padding: 3 }}>
            <Pressable
              style={{
                borderRadius: 8,
                justifyContent: 'center',
                alignItems: 'center',
                textAlignVertical: 'center',
                width: 80,
                height: 80,
                backgroundColor: 'gray',
              }}
              onPress={() => handleCalcular()}
              >
              <Text>=</Text>
            </Pressable>
          </View>
        </View>
      </View>
    </View>
  );
}