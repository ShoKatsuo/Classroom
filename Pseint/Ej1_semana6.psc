Algoritmo Ejercicio1
	//Declarar variables
	Definir promedio Como Real
	Definir categoria Como Caracter
	//Entrada de datos
	Escribir "Ingrese promedio"
	Leer promedio
	Si promedio >= 17 Entonces
		categoria = "A"
	SiNo Si promedio >= 14 y promedio < 17
			categoria = "B"
		SiNo Si promedio >= 12 y promedio < 14
				categoria = "C"
			SiNo
				categoria = "D"
			FinSi
		FinSi
	FinSi
	//Salida
	Escribir "Su categoria es: ",categoria
	
FinAlgoritmo
