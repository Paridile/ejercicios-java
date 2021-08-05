# Orientación a Objetos

## Temas vistos

1. Encapsulación, Herencia, Sobrescritura 

2. Sobrecarga Métodos, Polimorfismo 

3. Constructores 

4. InstanceOf, Conversiones de Tipos 

5. Implementando Interfaces, Tipos de Retorno 

6. Miembros Estáticos, uso de la palabra reservada Static 

7. Acoplamiento y Cohesión 

8. Clases Internas Y Anónimas  

</br>

-----------------

</br>

## Ejercicios

</br>

 - Constructores

 	- [Bottom2](https://github.com/Paridile/ejercicios-java/blob/main/src/main/java/com/paridile/week1/objectoriented/Bottom2.java): Con este ejercicio se buscó reforzar el conocimiento referente a los constructores y como se comportan cuando heredan a otra clase, en este caso, fue utilizado un constructor con un parámetro de tipo String, una clase que hereda de ella intenta implementar el constructor por defecto (vacio) pero al existir un constructor definido el que java genera por defecto desaparece por lo que hay que hacer la referencia `super(String)` en la clase hija.

 	- [Kinder](https://github.com/Paridile/ejercicios-java/blob/main/src/main/java/com/paridile/week1/objectoriented/Kinder.java): Este ejercicio consiste en llenar espacios vacios con los elementos de una tabla proporcionada, es necesario utilizar cada uno de los elementos de dicha tabla y no todos los espacios necesariamente deben ser llenados.

<div align="center">

 |		 |       |       |       |
 | :---: | :----:| :---: | :---: |
 | AgedP | super | this  |       |
 | (     | )     | {     |   }   |
 | ;     |       |       |       |

</div>

- Innerclases

	- [Clock](https://github.com/Paridile/ejercicios-java/tree/main/src/main/java/com/paridile/week1/objectoriented/innerclasses/clock): Este fue un proyecto pequeño para que quedara mas claro el comportamiento de las clases internas y anonimas. 

	- [Panel](https://github.com/Paridile/ejercicios-java/blob/main/src/main/java/com/paridile/week1/objectoriented/innerclasses/Panel.java): Este fue un ejercicio que realize para comprobar si el tema de las clases internas me habia quedado claro, consiste en un panel que tiene un botón, este botón hereda de la clase JButton y tiene una clase interna que implementa el ActionListener del botón.


</br>




