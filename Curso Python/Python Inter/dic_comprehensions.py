# def main():
#     my_dict = {}

#     for i in range(1, 101):
#         if i % 3 != 0:
#             my_dict[i] = i**3

#     print(my_dict)

## Dic comprehensions
# def main():
#     my_dic = {
#         i: i**3 for i in range(1, 101) if i%3 != 0
#     }
#     print(my_dic)

## Reto 
# Crear con un dictionary comprehension, un diccionario cuyas llaves sean los 1000 primeros números naturales con sus raíces cuadradas como valor

def main():
    dic_comp = {
        i: i**0.5 for i in range(1,1001)
    }
    print(dic_comp)

if __name__ == '__main__':
    main()