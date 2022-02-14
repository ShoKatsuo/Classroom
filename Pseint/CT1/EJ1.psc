Algoritmo Ejercicio_1
	//Definir  variable
	Definir monto, hijos, años_T, incentivo_h, imp_tiempo, imp_total Como Real
	//Ingresar Datos 
	// La sintaxis Imprimir o Escribir son validas al mostrar algo en pantalla
	Imprimir  "Bienvenido(a) su Agencia de Viajes preferida" //Mensaje de bienvenida
	Imprimir ""//Espacio en blanco
	Imprimir "Ingrese el número de hijos: " //Solicito que el usuario ingrese el numero de hijos
	Leer hijos //Los datos ingresados se guardará en "hijos"
	Imprimir "Ingrese el tiempo de servicio del trabajador: "
	Leer años_T //Los datos ingresados del tiempo de servicio se guardará en "años_T"
	//Calcular datos
	incentivo_h = 30 * hijos //Segun el enunciado, el incentivo por hijos se calcula multiplicadno el # de hijos por 30
	imp_tiempo = 40 * años_T //El importe por el tiempo de trabajo se calcula multiplicando los años de trabajo por 40
	imp_total = incentivo_h + imp_tiempo //el importe total es la suma del incentivo por hijos y el importe por tiempo de trabajo
	//Mostrar Resultados
	Imprimir "" //Espacio en blanco
	Imprimir  "El importe por tiempo de servicio es ",imp_tiempo,+ " soles" + " y el incentivo por hijos es ",incentivo_h,+ " soles" //La terminal mostrará en pantalla el importe por tiempo de servicio y el incentivo por hijos
	Imprimir  "El importe total es ",imp_total, + " soles" //En este punto, la terminal mostrará el importe total
	
	
	
FinAlgoritmo
