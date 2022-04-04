Algoritmo sin_titulo
	Definir num,den,c Como Entero
	
	Definir sum Como Real
	num=3
	den=2
	
	Mientras c<=9 Hacer
		Escribir num,"/",den
		sum = sum + (num/den)
		//sum=sum +(num *1.0)/den
		num=num +4
		den=den +3
		c=c+1
		
	Fin Mientras
	
	Escribir sum
FinAlgoritmo
