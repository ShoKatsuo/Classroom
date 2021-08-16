def conversor(tipo_pesos, valor_dolar):
    pesos = input("¿Cuántos pesos " + tipo_pesos + " tienes?: ")
    pesos = float(pesos)
    dolares = pesos / valor_dolar
    dolares = str(dolares)
    print("Tienes $" + dolares + " dolares")    

menu = """
Bienvenido al conversor de monedas 💲

1 - Pesos Colombianos
2 - Pesos Argentinos
3 - Pesos Mexicanos

Elige una opción: """

opcion = int(input(menu))

if opcion == 1:
    conversor("Colombiano", 3835)
elif opcion == 2:
    conversor("Argentino", 98.960)
elif opcion == 3:
    conversor("Mexicano", 19.879243)
else:
    print("Ingresa una opción correcta")
