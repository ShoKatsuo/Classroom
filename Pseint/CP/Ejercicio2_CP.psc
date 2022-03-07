Algoritmo Facultades
	//Definir variables
	Definir facultad Como Caracter
	Definir monto, recibir, ingenieria, educacion, ciencias, telecomunicaciones Como Real
	Definir facu_selec Como Entero
	//Ingresar datos
	Escribir "Ingrese el monto a repartir"
	Leer monto
	Escribir "Seleccione su facultad"
	Escribir "1=Ingenieria; 2=Educacion; 3=Ciencias; 4=Telecomunicaciones; 5=Letra"
	Leer facu_selec
	// valores
	ingenieria = 0.35 * monto
	educacion = 0.3 * monto
	ciencias = 0.75 * ingenieria
	telecomunicaciones= 0.40 * (ingenieria + ciencias)
	letras = monto - (ingenieria+ciencias+educacion+telecomunicaciones)
	//Condicional Segun con salida
	Segun facu_selec Hacer
		1:
			facultad = "ingenieria"
			Escribir "Su facultad es ",facultad, " y se repartirá ",ingenieria, " soles"
		2:
			facultad = "educacion"
			Escribir "Su facultad es ",facultad, " y se repartirá ",educacion, " soles"
		3:
			facultad = "ciencias"
			Escribir "Su facultad es ",facultad, " y se repartirá ",ciencias, " soles"
		4:
			facultad = "telecomunicaciones"
			Escribir "Su facultad es ",facultad, " y se repartirá ",telecomunicaciones, " soles"
		5:
			facultad = "letra"
			Escribir "Su facultad es ",facultad, " y se repartirá ",letra, " soles"
		De Otro Modo:
			Escribir "No ingresó una facultad correcta, intente nuevamente"
	Fin Segun

FinAlgoritmo
