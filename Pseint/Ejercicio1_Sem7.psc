Algoritmo Ejercicio_1
	//Definir variables
	Definir  cantidad, costo, pagar Como Real
	
	//Ingresar datos
	Escribir "Ingrese la cantidad de teclados comprados"
	Leer cantidad
	
	Segun cantidad Hacer
		1,2,3:
			costo = 15 * cantidad
			Escribir "Usted deberá pagar ",costo, + " soles"
		4,5,6,7,8:
			costo = 11 * cantidad
			Escribir "Usted deberá pagar ",costo, + " soles"
		De Otro Modo:
			costo = 10 * cantidad
			Escribir "Usted deberá pagar ",costo, + " soles"
	Fin Segun
	
FinAlgoritmo
