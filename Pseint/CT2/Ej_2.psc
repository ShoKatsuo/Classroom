Algoritmo OPN
	Definir t_jubilacion Como Caracter
	Definir  años,tservicio Como entero
	definir resultado Como Caracter
	//leer datos
	Escribir "Ingresar años"
	leer años
	Escribir "Ingresar tiempo de servicio"
	leer tservicio
	t_jubilacion=process(años,tservicio)
	Escribir "Tipo de jubilacion por edad de años:",t_jubilacion
FinAlgoritmo
SubProceso a<-process(edad,tser)
	si edad>=70 y tser>25 Entonces
		resultado=" Jubilacion por edad"
	sino si edad<=60 y edad<=70 y tser>=20 entonces
			resultado=" Jubilacion por Antiguedad adulta"
		sino si edad>50 y edad<=60 y tser>=15 Entonces
				resultado=" Jubilacion por antiguedad joven"
			sino 
				resultado="no tiene jubilacion actual"
			FinSi
		FinSi
	FinSi
	a<-resultado
FinSubProceso