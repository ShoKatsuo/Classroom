Algoritmo Ejercicio_3
	//Definir Variables
	Definir  sueldo, bono Como Real
	Definir categoria Como Caracter
	//ingresar datos
	Escribir "Ingrese el monto de su sueldo"
	Leer sueldo
	Escribir "Ingrese su categoria"
	Leer categoria
	//Segun
	Segun categoria Hacer
		"a": 
			bono = 0.10 * sueldo
			Escribir "Su bonificación es ",bono,+ " soles" 
		"b":
			bono = 0.20 * sueldo
			Escribir "Su bonificación es ",bono,+ " soles" 
		"c":
			bono = 0.30 * sueldo
			Escribir "Su bonificación es ",bono,+ " soles" 
		"d":
			bono = 0.50 * sueldo
			Escribir "Su bonificación es ",bono,+ " soles" 
		De Otro Modo:
			Escribir "La categoria ingresada no es correcta"
	Fin Segun
FinAlgoritmo
