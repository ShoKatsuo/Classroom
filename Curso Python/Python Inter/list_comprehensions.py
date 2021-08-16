## Generando números naturales y potenciados al cuadrado

# def main():
#     squares = []
#     for i in range(1, 101):
#         squares.append(i**2)
#     print(squares)

## Cuadrado de los números que no sean divisibles entre 3
# def main():
#     squares = [
#         i**2 for i in range (1, 101) if i % 3 != 0
#     ]
#     print(squares)


## Reto 3 List comprehension
## Una lista de todos los múltiplos de 4, 6 y 9 (up to 5 digits (9999))

def main():
    list_comp = [
        i for i in range (1, 10000) if i % 36 == 0
    ]
    print(list_comp)


if __name__ == '__main__':
    main()