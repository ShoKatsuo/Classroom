Algoritmo Ej1
	Definir canad Como Entero
	Definir precio,impcom, impdes, imppag Como Real
	Definir obs Como Caracter
	//Entrada
	Escribir "Ingrese cantidad "
	Leer canad
	Escribir "Ingrese precio "
	Leer precio
	// condiciones doble si... SiNo
	//que determinanoms importe de compra
	impcom = precio * canad
	si canad > 10
		impdes = impcom * 0.15
	SiNo
		impdes = impcom * 0.05
	FinSi
	imppag = impcom - impdes
	si impcom > 200
		obs = "Agenda"
	SiNo
		obs = "cuaderno"
	FinSi
	//Salida Mostrar importe compra, descuento
	//importe a pagar y obsequio
	Escribir  "El importe de compra es: ",impcom
	Escribir "Tiene un descuento ",impdes, " ud pagará ",imppag," y su obsequio será ",obs
FinAlgoritmo
