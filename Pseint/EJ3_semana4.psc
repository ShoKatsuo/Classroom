Algoritmo Ej3
	Definir num Como Real
	Definir deter Como Caracter
	
	Imprimir "Ingrese un n�mero"
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
	
	Imprimir "El n�mero ingresado es ",num, " y es ",deter
FinAlgoritmo
