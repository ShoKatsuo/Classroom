# 
# menu = """
# Bienvenido 😄
# Escoge alguno de estos algoritmos para encontrar la raíz cuadrada

# 1 - Enumeración Exhaustiva
# 2 - Aproximación de Soluciones
# 3 - Busqueda Binaria
# """
# option = int(input(menu))
# if option == 1:
#     objetivo = int(input("Escoge un número: "))
#     respuesta = 0

#     while respuesta**2 < objetivo:
#         respuesta += 1

#     if respuesta**2 == objetivo:
#         print(f'La raíz cuadrada de {objetivo} es {respuesta}')
#     else:
#         print(f'{objetivo} no tiene una raíz cuadrada exacta')

# elif option == 2:
#     objetivo = int(input('Escoge un número: '))
#     epsilon = 0.01
#     paso = epsilon**2
#     respuesta = 0.0

#     while abs(respuesta**2 - objetivo) >= epsilon and respuesta <= objetivo:
#         respuesta += paso
    
#     if abs(respuesta**2 - objetivo) >= epsilon:
#         print(f'No se encontró la raíz cuadrada')
#     else:
#         print(f"La raíz cuadrada {objetivo} es {respuesta}")

# elif option ==3:
#     objetivo = int(input('Escogé un número: '))
#     epsilon = 0.01
#     bajo = 0.0
#     alto = max(1.0, objetivo)
#     respuesta = (alto + bajo) / 2

#     while abs(respuesta**2 - objetivo) >= epsilon:
#         if respuesta**2 < objetivo:
#             bajo = respuesta
#         else:
#             alto = respuesta

#         respuesta = (alto + bajo) / 2

#     print(f'La raíz cuadrada de {objetivo} es {respuesta}')

# else:
#     print("No ha elegido alguna opción valida, vuelve a intentar")


def menu():
    print(f'Bienvenido 😄 \nEstos algoritmos te ayudarán a encontrar la raíz cuadrada \n1 - Enumeración Exhaustiva \n2 - Aproximación de Soluciones \n3 - Busqueda Binaria')
    option_menu = int(input("Escoja una opción: "))
    valor = int(input('Inserte un número: '))

    if option_menu == 1:
        option_1(valor)
    elif option_menu ==2:
        option_2(valor)
    elif option_menu == 3:
        option_3(valor)
    else:
        print('No ha elegido alguna opción valida, vuelve a intentar')


def option_1(objetivo):
    respuesta = 0

    while respuesta**2 < objetivo:
        respuesta += 1

    if respuesta**2 == objetivo:
        print(f'La raíz cuadrada de {objetivo} es {respuesta}')
    else:
        print(f'{objetivo} no tiene una raíz cuadrada exacta')

def option_2(objetivo):
    epsilon = 0.01
    paso = epsilon**2
    respuesta = 0.0

    while abs(respuesta**2 - objetivo) >= epsilon and respuesta <= objetivo:
        respuesta += paso
    
    if abs(respuesta**2 - objetivo) >= epsilon:
        print(f'No se encontró la raíz cuadrada')
    else:
        print(f'La raíz cuadrada {objetivo} es {respuesta}')

def option_3(objetivo):
    epsilon = 0.01
    bajo = 0.0
    alto = max(1.0, objetivo)
    respuesta = (alto + bajo) / 2

    while abs(respuesta**2 - objetivo) >= epsilon:
        if respuesta**2 < objetivo:
            bajo = respuesta
        else:
            alto = respuesta

        respuesta = (alto + bajo) / 2

    print(f'La raíz cuadrada de {objetivo} es {respuesta}')

menu()



