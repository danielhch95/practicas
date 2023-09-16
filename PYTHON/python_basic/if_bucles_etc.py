#IF

"""En Python 3.10 se ha añadido una nueva sentencia condicional inspirada en el clásico switch-case de los lenguajes basados en C, se trata de match-case.

Esta sentencia permite evaluar un valor y definir diferentes casos para actuar en consecuencia, de manera que en lugar de un if con múltiples elif como el siguiente:"""

opcion = input("Mete A, B o C: ")
 
if opcion == "A":
    print("Opción A")
elif opcion == "B":
    print("Opción B")
elif opcion == "C":
    print("Opción C")
else:
    print("Opcion por defecto")

#//////////////////////////////////////////////////////
#//////////////////////////////////////////////////////
#SE PUEDE REALIZAR ASÍ CON MATCH Y CASE

    opcion = input()
 
match opcion:
    case "A":
        print("Opción A")
    case "B":
        print("Opción B")
    case "C":
        print("Opción C")
    case _:
        print("Opción por defecto")

"""Lo único destacable es el caso por defecto que se específica con _
por lo demás es prácticamente lo mismo y considerando que no todos estamos utilizando Python 3.10 creo que aún no vale la pena profundizar demasiado."""


"""BUCLES"""

"""WHILE"""

x = 0
while x < 10:
    print(x)
    x += 1

"""FUNCION BREAK Y CONTINUE"""

x = 0
while x < 10:
    if x == 7:
        x += 1
        break # Cuando pasa a valer 7, se rompe el bucle y termina el while
    print(x)
    x += 1

x = 0
while x < 10:
    if x == 7:
        x += 1
        continue # Cuando pasa a valer 7, reinicia el bucle y lo hace con x = 8
    print(x)
    x += 1

"""FUNCION FOR"""

"""Ideal para recorrer listas o hacer que el for tenga x cantidad de iteraciones"""

for numero in range(10):
    print(numero)

#Para cambiar los valores de una lista sobre la marcha:
#En este ejemplo multiplicamos por 10 cada valor de la lista.

indice = 0
numeros = [1,2,3,4,5,6]
for numero in numeros:
    numeros[indice] *= 10 #Multiplica el valor del índice 0 de la lista numeros
    indice +=1 #Suma 1 al valor que utilizamos como índice de la lista números
print(numeros)

#UTILIZANDO LA FUNCION ENUMERATE
#enumerate nos saca 2 valores. En la primera variable indicada 
# en el for nos saca el índice y en la segunda el valor de ese índice en la lista

numeros = [2,5,1,4,5,6]
for indice, numero in enumerate(numeros):
    numeros[indice] *= 10
print(numeros)