Algoritmo Ej3
	Definir num Como Real
	Definir deter Como Caracter
	
	Imprimir "Ingrese un número"
	Leer num
	
	si num < 0 Entonces
		deter = "negativo"
	FinSi
	si num > 0 Entonces
		deter = "positivo"
	FinSi
	si num = 0 Entonces
		deter = "neutro"
	FinSi
	
	Imprimir "El número ingresado es ",num, " y es ",deter
FinAlgoritmo
