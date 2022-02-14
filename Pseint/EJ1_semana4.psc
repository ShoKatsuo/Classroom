Algoritmo EJ1
	Definir golesa, golesb, goles Como Entero
	Definir resultado Como Caracter
	
	Escribir "Ingresar goles del equipo A: "
	Leer golesa
	Escribir  "Ingresar goles del equipo B: "
	Leer golesb
	
	Si(golesa>golesb) Entonces
		resultado = "Ganó equipo A por un marcador de "
		goles = golesa
	FinSi
	Si(golesb>golesa) Entonces
		resultado= "Ganó equipo B por un marcador de "
		goles = golesb
	FinSi
	si (golesa==golesb) Entonces
		resultado= "Empate de equipos por un marcador de "
	FinSi
	Escribir resultado,goles
	
FinAlgoritmo
