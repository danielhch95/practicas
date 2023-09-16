#Definir función
def prueba_1():
    print("Hola mundo")
prueba_1()

"""Sentencia return"""

def test():
    return "Hola mundo, retornado" #Aquí se deja de ejecutar la función y se devuelve ese valor
    print("Hello") #Nunca se ejecutará
test()

#Es mejor asignar a una variable la salida de una función si la vamos a ejecutar varias veces
a = test()
a

#Devolviendo listas
def prueba_2():
    return [1,2,3,4,5]
prueba_2()[0]

#Devolver múltiples valores en tupla
def prueba_3():
    return "Hola mundo", 20, [1,2,3,4,5]
prueba_3()

#Si lo asignamos en varias variables de modo que cada valor de la tupla, corresponde de forma secuencial con cada variable
#En este caso a = prueba_3()[0], b = prueba_3()[1] y c = = prueba_3()[2]
a, b, c = prueba_3()
print(a)
print(b)
print(c)

"""VALORES POR DEFECTO DE LA FUNCION"""

def prueba_4(a=None, b=None):
    if a == None or b == None:
        print("Error")
        return
    else:
        return a - b

"""Los int se pasan como valor a la función mientras que las listas, por ejemplo, se pasan como referencia
por lo que un cambio en la lista dentro de una función, modifica la variable fuera de la función
mientras que si la variable es un int, un número, al pasarse como valor, la función no modifica su valor
fuera de la función"""

#Ejemplo:

#En este caso no se modifica el valor de la variable al pasar el número como valor:
def prueba_5(numero_1):
    numero_1 *= 2

num = 5
prueba_5(num)
print(num)

#En este caso, al pasarse como referencia, sí se modifica el valor de la variable
def prueba_5(lista_1):
    for i,n in enumerate(lista_1):
        lista_1[i] *= 2
        
lista_1 = [1,5,10]
prueba_5(lista_1)
print(lista_1)

"""No se puede indicar a python cuándo pasar como valor o referencia
pero se puede devolver el valor modificado dentro de la función y volver a asignarlo a la variable"""

#Ejemplo: Pasar un número como referencia en lugar de valor
def prueba_5(numero_1):
    return numero_1*2

num = 5
num = prueba_5(num)
print(num)

# Ejemplo pasar una lista como valor en lugar de referencia creando una copia mediante el slicing

def prueba_5(lista_1):
    for i,n in enumerate(lista_1):
        lista_1[i] *= 2

lista_prueba = [1,5,10]
print(prueba_5(lista_prueba[:]))
print(lista_prueba)

"""COMPROBACIONES SOBRE LAS REFERENCIAS"""


#En este ejemplo ambas listas son realmente las mismas ya que se asigna la lista 2 a la lista 1 y viceversa. Cualquier cambio en la lista 1, se refleja en la dos
lista_prueba_1 = [1,2,3,4,5]
lista_prueba_2 = lista_prueba_1 #Funciona como acceso directo
lista_prueba_1[0] = 1000
lista_prueba_2

lista_prueba_2[1] = 567
lista_prueba_1

#Ocupan el mismo espacio en memoria ya que esta funcion indica el lugar en memoria que ocupa un objeto. El resultado es el mismo en ambas.
def memoria(obj):
    print(f"{hex(id(obj))}")

memoria(lista_prueba_1)
memoria(lista_prueba_2)

a = 10
b = "hola"

memoria(a)
memoria(b)

"""ARGUMENTOS INDETERMINADOS

Número indeterminado de argumentos pasados a la función

El resultado es una tupla"""

def indeterminados_posicion(*args):
    print(args)

indeterminados_posicion(1,"Hola Mundo", [1,2,3,4])

#En lugar de gestionarlo con una tupla, con un diccionario

def indeterminados_por_nombre(**kwargs):
    print(kwargs)

indeterminados_por_nombre(n=5, c="Hola Mundo", l=[1,2,3,4]) #n, c y l funcionan como los índices del diccionario

def super_funcion(*args,**kwargs):
    t = 0
    for arg in args:
        t += arg
    print("Sumatorio indeterminado es: ", t)
    for kwarg in kwargs:
        print(kwarg, " es ", kwargs[kwarg])

super_funcion(10,50,40,-20, nombre="Daniel", edad=28)


"""FUNCIONES RECURSIVAS

Al parecer, la ejecución se va anidando y el proceso de la función cuando num es igual a 4 lleva a otro proceso 
en el que num es igual a 3, así sucesivamente hasta que cuando num es = a 0, se termina ese proceso, vuelve al proceso de num = 1, lo cierra
y así sucesivamente hasta cerrar el primer proceso que era el momento en que num era igual a 4. De ahí que la salida del último
print se realice después del boom que se ejecuta en el proceso de num = 0"""

def cuenta_atras(num):
    num -= 1
    if num > 0:
        print(num)
        cuenta_atras(num)
    else:
        print("BOOOOOM")
    print("Fin de la función", num)

cuenta_atras(5)

#Ejemplo para mostrar el factorial

def factorial(numero):
    print("Valor inicial ->", numero)
    if numero > 1:
        numero = numero * factorial(numero -1)
    print("Valor final ->", numero)
    return numero

factorial(5)