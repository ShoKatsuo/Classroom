Algoritmo Ej1_grupal_sem5
	//Definir Variables
	Definir num_tarjeta Como Entero
	Definir descuento, imp_compra, imp_pagar Como Real
	
	//Ingresar datos
	Escribir "Ingrese el numero de tarjeta "
	Leer num_tarjeta
	Escribir "Ingrese el importe de su compra "
	Leer imp_compra
	
	//Condicional
	si num_tarjeta > 100
		descuento = 0.15 * imp_compra
	SiNo
		descuento = 0.05 * imp_compra
	FinSi
	// Proceso de datos
	imp_pagar = imp_compra - descuento
	//Salida
	Escribir "El numero de su tarjeta es ",num_tarjeta, " y tienes un descuento de ",descuento, " soles"
	Escribir "El importe a pagar es S/. ",imp_pagar
FinAlgoritmo
