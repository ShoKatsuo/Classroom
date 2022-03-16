Algoritmo Ejercicio1
	Definir codigo, vlad1, vlad2 Como real
	Escribir "Ingresar Codigo de la Figura "  
	Escribir "[1] Cuadrado "
	Escribir "[2] Rectangulo "
	Escribir "[3] Triangulo "
	Escribir "[4] Pentagono "
	Escribir "[5] Salir "
	Leer codigo
	Calculo(codigo)
FinAlgoritmo

SubProceso Calculo(codigo)
	Segun codigo Hacer
		1: 
			Escribir "Escribir lado "
			Leer vlad1
			per= vlad1*4
			Escribir "El perimetro es: ", per
		2: 
			Escribir "Escribir A"
			Leer vlad1
			Escribir "Escribir B"
			Leer vlad2
			per= 2*vlad1 + 2*vlad2
			Escribir "El perimetro es: ", per
		3:
			Escribir "Escribir lado "
			Leer vlad1
			per= vlad1*3
			Escribir "El perimetro es: ", per
		4:
			Escribir "Escribir lado "
			Leer vlad1
			per= vlad1*5	
			Escribir "El perimetro es: ", per
		De Otro Modo:
			escribir " SALIR " 
	Fin Segun
	
FinSubProceso