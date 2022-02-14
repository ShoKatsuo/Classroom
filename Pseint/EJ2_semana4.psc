Algoritmo EJ2
	Definir promedio Como Real
	Definir categoria Como Caracter
	
	Escribir  "Ingrese su promedio: "
	Leer promedio
	
	si promedio >= 17 Entonces
		categoria = "a"
	FinSi
	si promedio >= 14 y promedio < 17 Entonces
		categoria = "b"
	FinSi
	si promedio >= 12 y promedio < 14 Entonces
		categoria = "c"
	FinSi
	si promedio < 12 Entonces
		categoria = "d"
	FinSi
	
	Imprimir "Tú promedio es: ",promedio , + " y está en la categoria ",categoria
FinAlgoritmo
