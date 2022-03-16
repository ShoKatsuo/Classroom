Algoritmo tienda
	Definir precio, codigo Como Entero
	Escribir "Ingrese Codigo del producto [1] P1 [2] P2 [3] p3"
	Leer codigo
	Escribir "ingrese cantidad"
	Leer cantidad
	venta(codigo, cantidad)
FinAlgoritmo

SubProceso venta(cod,can)
	//Calcular importe compra, imdes, impv, obse
	//1 impcomp
	Definir icom,ides,ipag Como Real
	Segun cod
		1:icom = 15 * can
		2:icom = 17.5 * can
		3:icom = 20 * can
		De Otro Modo:
			Escribir "código no existe"
			icom = 0
	FinSegun
	//2 Calcular el ides
	si (can > 10) Entonces
		ides = icom * 0.15
	SiNo
		ides=icom * 0.07
	FinSi
	
	ipag = icom - ides
	
	//salida
	Escribir "importe compra :",icom
	Escribir "importe descuento ",ides
	Escribir "importe a pagar ",ipag
	FinSubProceso
	