Algoritmo Ejercicio_2
	//Definimos Variables
	Definir albergue, comedor_pop, guarderia, panaderia, monto Como Real
	//Importar datos
	Imprimir  "Bienvenido a la ONG Nuevo Amanecer" //Lanzamos el mensaje de bienvenida para dar un mejor feedback
	Imprimir "" //Espcio en blanco
	Imprimir "Ingrese un monto" //Le pedimos al usuario que ingrese un monto que luego se repartira entre entidades
	Leer monto //Guardamos el dato ingresado en la variable monto
	Imprimir  "El monto ingresado es ",monto,+" soles"//Para mejorar la experiencia de usuario, la terminal le indicará al usuario el monto ingresado
	//Calcular datos
	albergue = 0.25 * monto //El importe del albergue es el 25% del monto
	comedor_pop = 0.20 * monto //El importe del comedor popular es el 20% del monto
	guarderia = 0.25 * (albergue + comedor_pop) //El importe de la guarderia es el 25% del monto
	panaderia = monto - (albergue+comedor_pop+guarderia) //El importe de la panaderia es lo que resta del monto
	//Mostar en pantalla el resultado
	Imprimir "" //Dejo espacio en blanco
	Imprimir "El importe asignado para :" //Se muestra una especie de menu indicando que se viene una lista de resultados
	Imprimir "El albergue es de ",albergue,+" soles" //Se imprime en pantalla importe del albergue
	Imprimir "El comedor popular es de ",comedor_pop,+" soles" //Se imprime en pantalla el importe del comedor popular
	Imprimir "La guarderia es de ",guarderia,+" soles" //Se imprime en pantalla el importe de la guarderia
	Imprimir "la panaderia es de ", panaderia,+ " soles" //Se muestra en pantalla el importe de la panaderia
FinAlgoritmo
