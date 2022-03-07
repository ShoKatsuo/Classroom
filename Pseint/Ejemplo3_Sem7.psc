Algoritmo Ejercicio_3
	//definir variables
	Definir codigo, can_adq Como Entero
	Definir precio,imp_pagar, descuento Como Real
	//ingresar datos
	Escribir "Ingrese el código"
	Leer codigo
	Escribir  "Ingrese la cantidad adquirida"
	Leer can_adq
	//Condicional
	Segun codigo Hacer
		0:
			precio = 6.0
			imp_pagar = precio * descuento
		1:
			precio = 5.5
		2:
			precio = 4.5
		3:
			precio = 4.7
		De Otro Modo:
			Escribir "El codigo ingresado no es correcto, intente nuevamente"
	FinSegun
	Si can_adq < 4 Entonces
		descuento = 0.05
	SiNo Si can_adq > 4 Entonces
		descuento = 0.075
	Sino Si can_adq >= 7 y < 10 Entonces
			descuento = 0.010 
		FinSi
	FinSi
	Fin Si
FinAlgoritmo
