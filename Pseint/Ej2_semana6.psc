Algoritmo venta
	Definir impcom, impdes, imppag Como Real
	Escribir "ingrese codigo 0,1,2,3"
	Leer codigo
	Escribir "Ingrese cantidad"
	Leer cantidad
	Si codigo = 0 Entonces
		impcom=cantidad * 6.0
	SiNo Si codigo=1 Entonces
			impcom = cantidad * 5.5
		SiNo Si codigo = 2 Entonces
				impcom = cantidad * 4.5
			SiNo
				impcom = cantidad * 4.7
			FinSi
		FinSi
	FinSi
	Si cantidad < 4 Entonces
		impdes = 0.075 - impcom
		SiNo Si cantidad >= 4 y cantidad < 7 Entonces
			impdes = 0.075 * impcom
			SiNo Si cantidad >= 7 y cantidad < 10 Entonces
			impdes = 0.1 * impcom
				SiNo Si cantidad >= 10 Entonces
				impdes = 0.125 * impcom
				FinSi
			FinSi
		FinSi
	FinSi
	Escribir "Importe de compra ",impcom
	Escribir "Importe de descuento", impdes
	Escribir "importe a pagar ",imppag
FinAlgoritmo
