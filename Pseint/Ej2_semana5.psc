Algoritmo Ej2
	//Declarar variables
	Definir cod, can Como Entero
	Definir imp_compra, imp_descuento, imp_pagar, precio Como Real
	Definir obsequio Como Entero
	
	//Ingreso datos
	Escribir  "Ingrese cantidad "
	Leer can
	Escribir  "Ingrese codigo 101-102-103 "
	Leer cod
	//condiciones
	si cod=101
		imp_compra = can * 17.5
	FinSi
	si cod = 101
		imp_compra = can * 17.5
	FinSi
	si cod = 102
		imp_compra = can * 25.0
	FinSi
	si cod = 103
		imp_compra = can * 15.5
	FinSi
	//Calcular el imp_descuento en base a la cantidad
	si can < 11
		imp_descuento = 0.05 * imp_compra
	FinSi
	si can >= 11 y can < 21
		imp_descuento = 0.075 * imp_compra
	FinSi
	si can >= 21 y can < 31
		imp_descuento = 0.10 * imp_compra
	FinSi
	si can >= 31
		imp_descuento = 0.125 * imp_compra
	FinSi
	// determinar obsequio
	imp_pagar = imp_compra - imp_descuento
	si imp_pagar > 250
		obsequio = 3 * can
	SiNo
		obsequio = 2 * can
	FinSi
	
	//salida
	Escribir  "Importe compra ",imp_compra
	Escribir  "Importe descuento ",imp_descuento
	Escribir "Importe pago ",imp_pagar
	Escribir "Caramelos de obsequio ",obsequio
FinAlgoritmo
