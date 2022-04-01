Algoritmo Supermercado
	//definir variables
	Definir marca, tdescuento Como Caracter
	Definir descuento, imp_compra, imp_descuento, imp_pagar Como Real
	Definir codigo, cantidad Como Entero
	
	menu
	Escribir "Ingrese el codigo del producto: "
	Leer codigo
	Escribir "Ingresar cantidad de litros"
	Leer cantidad
	venta(codigo,cantidad)
FinAlgoritmo
//menu para el usuario
SubAlgoritmo menu()
	Escribir "[1] Coca Cola"
	Escribir "[2] Inka Cola"
	Escribir "[3] Fanta"
	Escribir "[4] Sprite"
	Escribir "____________________"
FinSubAlgoritmo

SubAlgoritmo venta(cod,can)
	//Calcular el importe de compra, importe de venta, importe de descuento, descuento, marca segun los diferentes casos
	Segun cod
		1:
			Marca = "Coca Cola"
			imp_compra = 6.0 * can
			tdescuento = "12%"
			descuento = 0.12
			imp_descuento = imp_compra * descuento
			imp_pagar = imp_compra - imp_descuento
		2:
			Marca = "Inka Cola"
			imp_compra = 5.89 * can
			tdescuento = "10%"
			descuento = 0.10
			imp_descuento = imp_compra * descuento
			imp_pagar = imp_compra - imp_descuento
		3:
			Marca = "Fanta"
			imp_compra = 4.50 * can
			tdescuento = "8%"
			descuento = 0.08
			imp_descuento = imp_compra * descuento
			imp_pagar = imp_compra - imp_descuento
		4:
			Marca = "Fanta"
			imp_compra = 4.30 * can
			tdescuento = "7%"
			descuento = 0.07
			imp_descuento = imp_compra * descuento
			imp_pagar = imp_compra - imp_descuento
		De Otro Modo:
			Escribir " "
	FinSegun
	//Solo se imprimira marca,imp_compra,tdescuento,imp_descuento,imp_pagar solo si cod es mayor a 0 y menor a 5 y la cantidad sea mayor a 0
	si (cod > 0 y cod < 5 y can > 0) Entonces
		Escribir "La marca seleccionada es ",Marca
		Escribir "El importe de compra es ",imp_compra," soles"
		Escribir "Su descuento es ",tdescuento
		Escribir "El importe de descuento es ",imp_descuento," soles"
		Escribir "El importe de pago es ",imp_pagar," soles"
	SiNo
		Escribir "El codigo y/o la cantidad es erronea"
	FinSi
	
FinSubAlgoritmo

	