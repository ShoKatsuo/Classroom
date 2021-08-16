# num_1 = int(input("Escoge un número entero: "))
# num_2 = int(input("Escoge otro número entero: "))

# if num_1 > num_2:
# 	print("El primer número es mayor que el segundo")
# elif num_1 < num_2:
# 	print("El segundo número es mayor que el primero")
# else:
# 	print("Los dos números son iguales")

print("Este programa te permitirá comparar edades entre usuarios")
nombre_1 = str(input("Escribe tu nombre: "))
edad_1 = int(input("Escribe tu edad: "))
nombre_2 = str(input ("Escribe el nombre de la persona con la que deseas comparar edad: "))
edad_2 = int(input("Escribe su edad: "))

if edad_1 > edad_2:
	print(nombre_1 + " eres mayor que " + nombre_2)
elif edad_1 == edad_2:
	print(nombre_1 + " tienes la misma edad que " + nombre_2)
else:
	print(nombre_1 + " eres menor que " + nombre_2)

