def is_prime(number):
    contador = 0

    for i in range (1, number + 1):
        if i == 1 or i == number:
            continue
        if number % i == 0:
            contador += 1
    if contador == 0:
        return True
    else:
        return False


def main():
    number = int(input('Escribe un número: '))
    if is_prime(number):
        print('Es primo')
    else:
        print('No es primo')


if __name__ == '__main__':
    main()