# RPG Combat Kata

### 📷 Objetivos

> El objetivo de esta kata es practicar conceptos de OOP usando TDD.
>
>
> En un package con el nombre de la kata crea una clase llamada Character y crea un test para la clase.

# **Fondo**

Este es un kata divertido que tiene al programador construyendo reglas de combate simples, como para un juego de rol (RPG). Se implementa como una secuencia de iteraciones. El dominio no incluye un mapa ni ninguna otra habilidad de personaje además de su capacidad para dañarse y curarse unos a otros.

# **Instrucciones**

1. Complete cada iteración antes de leer la siguiente.
2. Se recomienda realizar este kata con un compañero y mientras se escriben pruebas.

## **Iteración uno**

1. Todos los personajes, cuando se crean, tienen:
    - Salud, a partir de 1000
    - Nivel, a partir de 1
    - Puede estar Vivo o Muerto, empezando Vivo (Vivo puede ser verdadero/falso)
2. Los personajes pueden causar daño a los personajes:
    - El daño se resta de la Salud
    - Cuando el daño recibido excede la Salud actual, la Salud se convierte en 0 y el personaje muere
3. Un personaje puede curar a un personaje:
    - Los personajes muertos no se pueden curar.
    - La curación no puede elevar la salud por encima de 1000

## **Iteración Dos**

1. Un Personaje no puede Infligirse Daño a sí mismo.
2. Un personaje solo puede curarse a sí mismo.
3. Al infligir daño:
    - Si el objetivo está 5 o más niveles por encima del atacante, el daño se reduce en un 50 %.
    - Si el objetivo está 5 o más niveles por debajo del atacante, el daño aumenta en un 50 %.

## **Iteración tres**

1. Los personajes tienen un alcance máximo de ataque.
2. Los luchadores *cuerpo a cuerpo* tienen un alcance de 2 metros.
3. Los luchadores *a distancia* tienen un alcance de 20 metros.
4. Los personajes deben estar dentro del alcance para infligir daño a un objetivo.

## **Retrospectiva**

- ¿Estás al día con los requisitos? ¿Alguna iteración ha sido un gran desafío?
- ¿Te sientes bien con tu diseño? ¿Es escalable y se adapta fácilmente a los nuevos requisitos?
- ¿Está todo probado? ¿Confías en tu código?

## **Cuarta iteración**

1. Los personajes pueden pertenecer a una o más Facciones.
    - Los personajes recién creados no pertenecen a ninguna facción.
2. Un personaje puede unirse o dejar una o más facciones.
3. Los jugadores que pertenecen a la misma Facción se consideran Aliados.
4. Los aliados no pueden infligirse daño entre sí.
5. Los aliados pueden curarse unos a otros.

## **Iteración cinco**

1. Los personajes pueden dañar *cosas* que no son personajes (accesorios).
    - Cualquier cosa que tenga Salud puede ser un objetivo.
    - Estas cosas no pueden curarse y no causan daño.
    - Estas cosas no pertenecen a Facciones; son neutrales.
    - Cuando se reduce la salud a 0, las cosas se *destruyen.*
    - Como ejemplo, puede crear un árbol con 2000 de salud.

## **Retrospectiva**

- ¿Qué problemas has encontrado?
- ¿Que has aprendido? ¿Alguna nueva técnica o patrón?
- Comparta su diseño con otros y obtenga comentarios sobre diferentes enfoques.

-