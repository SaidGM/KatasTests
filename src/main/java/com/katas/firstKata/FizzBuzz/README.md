# FizzBuzz Kata

### 🎥 Objetivos

> El objetivo de esta kata es conocer los principios básicos de un lenguaje y cómo hacer test automático

### ⚙️ Requisitos

Hay que usar TDD. Recuerda:

<aside>
💡 Test → Red → Green → Refactor 🔁

</aside>

- No puedes escribir código sin un test que falle.
- No puedes escribir nuevos tests que no fallen.
- Escribe siempre la solución más sencilla que haga pasar los tests. Factorize después.


### ⚙️ Requisitos Funcionales

- **Ejemplo Java:**

[//]: # (```java)

[//]: # (@Test)

[//]: # (void test&#40;&#41; {)

[//]: # ()
[//]: # (})

[//]: # (```)

- Escribe un programa/función/clase que, como parámetro, reciba un número del 1 al 100 y devuelva:
    - Para múltiplos de tres, devuelva una string: `Fizz`

      en lugar del número.

    - Para los múltiplos de cinco, devuelva una string: `Buzz`

      en lugar del número.

    - Para números que son múltiplos de tres y cinco, devuelva una string: `FizzBuzz`

      en lugar del número.

    - Por supuesto.. para números que no son múltiplos de tres y cinco, debe devolver el mismo número.

- Escribe una función que reciba una lista de números y un número:
    - La función devolverá otro array con todos los números de, la lista inicial divisibles por el número que le hemos pasado por parámetro.

- Escribe una función que reciba un array de objetos ‘usuario’ que tenga el nombre y la edad:
    - La función debe devolver otro array con los usuarios mayores de edad