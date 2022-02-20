Algoritmo Ej5_grupal_sem5
	Definir bonificacion, sueldo_bruto Como Real
	Definir num_hijos Como Entero
	
	//Ingresar datos
	Escribir "Ingrese su sueldo neto"
	Leer sueldo_bruto
	Escribir "Ingrese el numero de hijos"
	Leer num_hijos
	
	//Condicional
	si num_hijos > 2
		bonificacion = (0.125 * sueldo_bruto) + (30 * num_hijos)
	SiNo
		bonificacion = (0.125 * sueldo_bruto) + (40 * num_hijos)
	FinSi
	
	//salida
	Escribir "El sueldo bruto es ",suldo_bruto," y el numero de hijos ",num_hijos, " .Su bonificación será ",bonificacion," soles"
	
FinAlgoritmo
