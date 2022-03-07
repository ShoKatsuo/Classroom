Algoritmo Tienda_Zapatillas
	//Definir variables
	Definir obsequio, marca_selec, percentage Como Caracter
	Definir precio, descuento, imp_pagar, imp_compra  Como Real
	Definir cantidad, marca Como Entero
	//Saludo
	Escribir "Bienvenido(a) a tu tienda de zapatillas preferida"
	Escribir "" //espacio en blanco
	//Ingresar datos
	Escribir "Ingrese la cantidad comprada"
	Leer cantidad
	Escribir "" //espacio
	Escribir "Seleccione una marca"
	Escribir "1=adidas; 2=puma; 3=Sport Wear; 4=Fila"
	Leer marca
	//condicionales
	Segun marca Hacer
		1:
			marca_selec = "adidas"
			precio = 300
		2:
			marca_selec = "puma"
			precio = 270
		3:
			marca_selec = "Sport Wear"
			precio = 400
		4:
			marca_selec = "Fila"
			precio = 350
		De Otro Modo:
			Escribir "No ingresó una marca correcta, intente nuevamente"
	Fin Segun
	
	Si cantidad < 5 Entonces
		descuento = 0.05
		percentage = "5%"
	FinSi
	Si cantidad >= 5 y cantidad < 10 Entonces
		descuento = 0.07
		percentage = "7%"
	FinSi
	Si cantidad >= 10 y cantidad < 15 Entonces
		descuento = 0.09
		percentage = "9%"
	FinSi
	Si cantidad >= 15 Entonces
		descuento = 0.11
		percentage = "11%"
	FinSi
	
	imp_pagar = (precio * cantidad) - descuento
	imp_compra = precio * cantidad
	Si imp_pagar < 300 Entonces
		obsequio = "un borrador"
	SiNo
		obsequio = "un lapicero"
	FinSi
	//salida
	Escribir ""//espacio
	Escribir "El importe de la compra es ",imp_compra " soles y se le aplicará un descuento del ",percentage
	Escribir "El monto a pagar es ",imp_pagar, " soles y recibes como obsequio ",obsequio
FinAlgoritmo
