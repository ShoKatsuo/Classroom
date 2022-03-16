Algoritmo MenuDeOpciones
	
FinAlgoritmo
//Crear un procedimiento con opciones de menu
SubAlgoritmo menu()
	Escribir "1 Archivo "
	Escribir "2 Editar "
	Escribir "3 Ayuda"
	Escribir "4 Salir "
FinSubAlgoritmo
//subproceso con el código de cada Opcion
SubAlgoritmo eleccion()
	Escribir "---------------------------------"
	Escribir "Selecciona una opción "
	Leer op
	Segun op
		1:Escribir "Elijo la opcion archivo...."
		2:Escribir "Elijo la opcion editar....."
		3:Escribir "Elijo la opcion"
	FinSegun
FinSubAlgoritmo
	