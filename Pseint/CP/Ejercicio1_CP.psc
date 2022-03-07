Algoritmo Mi_Mejor_Amigo
	//Definir variables
	Definir number Como Entero
	Definir obsequio Como Caracter
	//Ingresar datos
	Escribir "Bienvenido(a) a la veterinaria Mi Mejor Amigo"
	Escribir "" //Espacio en blanco
	Escribir "Porfavor, ingrese el número de la ruleta"
	Leer number
	//condicional
	Segun number Hacer
		2:
			obsequio = "collar antipulgas"
		8,9:
			obsequio = "1 caja de RicoCrack"
		11,12,13,14,15:
			obsequio = "comida para perro Canbo"
		21:
			obsequio = "correa para mascota"
		De Otro Modo:
			obsequio = "un descuento del 5% en su siguiente compra de comida para su mascota"
	FinSegun
	//salida
	Escribir "Su premio es ",obsequio
FinAlgoritmo
