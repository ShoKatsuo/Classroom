Algoritmo Ejemplo_1
	
	//Definir Variables
	Definir number Como Real
	Definir regalo Como Caracter
	//introducir datos
	Escribir "Ingrese el número de la bolita"
	Leer number
	//condicion
	Segun number Hacer
		10,48:
			regalo = "reloj"
			Escribir "Según el numero ingresado, su regalo es ",regalo
		27:
			regalo = "USB"
			Escribir "Según el numero ingresado, su regalo es ",regalo
		36:
			regalo = "pelota"
			Escribir "Según el numero ingresado, su regalo es ",regalo
		5:
			regalo = "lapicero"
			Escribir "Según el numero ingresado, su regalo es ",regalo
		De Otro Modo:
			Escribir "No se registra la bolita ingresada, vuelva a ingresar el numero de la bolita"
	Fin Segun
	
	// Salida
	//Escribir "Según el numero ingresado, su regalo es ",regalo
FinAlgoritmo
