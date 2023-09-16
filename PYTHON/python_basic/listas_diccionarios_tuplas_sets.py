# //////////////////////////////////////////////////////////
# //////////////////////////////////////////////////////////

#List is a collection which is ordered and changeable. Allows duplicate members.
#Tuple is a collection which is ordered and unchangeable. Allows duplicate members.
#Set is a collection which is unordered, unchangeable*, and unindexed. No duplicate members.
#Dictionary is a collection which is ordered** and changeable. No duplicate members.


"""LISTAS"""

#Funciona con índices y slicing como las cadenas de caracteres

numeros = [1,2,3,4]
datos = [4, "Una cadena", -15, 3.14, "otra cadena"]

print(datos[0])
print(datos[-1])
print(datos[-2:])

#Son modificables

datos[0] = 7
datos.append(7*2)
print(datos)


#Ordenar listas

datos.sort()
datos

#Listas anidadas

a = [1,2,3]
b = [4,5,6]
c = [7,8,9]

r = [a,b,c]

print(r)

print(r[0]) #Saca la primera lista, funciona igualq ue una lista normal

print(r[0][0]) #El de la izquierda hace referencia a la primera lista,
#el segunda al primer item de la primera lista


"""LISTAS Y BUCLES ANIDADOS"""

lista = [
    "Texto",
    (1,2,3,4),
    ("mucho", "texto")
]

for coleccion in lista:
    print(coleccion)

for coleccion in lista:
    for elemento in coleccion:
        print(coleccion, "->", elemento)

for indice_coleccion, coleccion in enumerate(lista):
    for indice_elemento, elemento in enumerate(coleccion):
        print(lista[indice_coleccion][indice_elemento])

tabla = [ #O matriz
    [0,0,0],
    [1,1,1],
    [2,2,2]
]

for fila in tabla:
    print(fila)

for fila in tabla:
    for valor in fila:
        print(fila, "->", valor)

"""COMO DEFINIR UN CUBO"""

tabla = [ #O matriz
    [0,0,0],
    [1,1,1],
    [2,2,2]
]

cubo = [
    tabla, tabla, tabla
]

#Sería necesario el mismo número de filas en las tablas que tablas en el cubo

print(cubo[2][1][0])

"""Para dibujar las tres tablas que forman el cubo"""

for k,tabla in enumerate(cubo):
    for i,fila in enumerate(tabla):
        for j,columna in enumerate(fila):
            print((cubo[k][i][j]), end = " ")
        print()
    print()

"""TUPLAS

Igual que tablas pero su contenido es inmutable"""

#Ejemplo
tupla = (1,2,3,4)

"""CONJUNTOS (SET)

Se añaden números ordenados y las letras, después de los números pero desordenados"""

conjunto = set()

conjunto.add(4)
conjunto.add(0)
conjunto.add("A")
conjunto.add("Z")
conjunto.add("H")
print(conjunto)

print("A" in conjunto)
print("T" in conjunto)
print("T" not in conjunto)

#Eliminar una entrada de un conjunto

conjunto.discard("Z")

conjunto

"""Elimina los elementos duplicados"""

test = {"hola", "hola", "hola", 1, 6, 6}

print(test)

lista_test = list(test)

print(lista_test)

#Dada una lista se puede transformar a set y viceversa para eliminar duplicidades

lista_1 = [1,1,3,4,5,4,3]
print(list(set(lista_1)))

#A un conjunto de caracteres se le puede convertir en set y nos devolverá un set (o lista si reconvertimos) que elimina caracteres duplicados

cadena_1 = "Al pan pan y al vino vino"
cadena_1 = set(cadena_1)
print(cadena_1)

#Se pueden añadir o eliminar elementos del conjunto:

cadena_1.remove("A")
cadena_1.add("HOLA MUNDO")
print(cadena_1)


"""DICCIONARIOS

Utilizan un sistema clave:valor por lo que una clave debe ser única e identifica un valor

Igual que los set son colecciones desordenadas"""

#Diccionario vacío
vacio = {}

print(type(vacio))

colores = {
    "amarillo": "yellow",
    "rojo": "red",
    "verde": "green"
    }

print(colores["amarillo"])

#MODIFICAR VALORES DICCIONARIO

colores["amarillo"] = "white"
colores

#BORRAR LA CLAVE Y VALOR

del(colores["amarillo"])
colores

#Ejemplo incremental de edades

edades = {
    "Juan":21,
    "María":22,
    "David":56
}

edades["Juan"] += 1

edades["Juan"]

edades["Juan"] + edades["María"]

#Recorrerlo con un bucle for

for edad in edades: #Aquí recorremos los índices, edad nos devuelve el índice
    print(edad)

for usuario in edades: #Así mostramos los valores
    print(edades[usuario])

for clave in edades: #Forma chapucera de mostrar clave y valor
    print(clave,edades[clave])

for clave,valor in edades.items(): #Forma correcta de mostrar clave y valor con la función item
    print(clave,valor)

#Se pueden hace listas de diccionarios

a = {"Nombre":"Gimli", "Rol":"Guerrero","Raza":"Enano"}
b = {"Nombre":"Gandalf", "Rol":"Mago","Raza":"Humano"}
c = {"Nombre":"Legolas", "Rol":"Arquero","Raza":"Elfo"}

personajes = []

personajes.append(a)
personajes.append(b)
personajes.append(c)

for p in personajes:
    print(p["Nombre"], " es un ", p["Rol"], " de raza ", p["Raza"])


"""PILAS

Funcionan como listas pero en las que se usa el LIFO: Last In, First Out

En python no existen como tal pero se pueden simular con listas"""

pila = [1,2,4]
pila.append(6) #Añade un item al final de la lista
pila.append(7)
pila
n = pila.pop() #POP devuelve el último valor (Por defecto) y borra el valor de la lista
n
pila

"""COLAS

Método: FIFO: First In, First Out

Es necesario importar la función"""

from collections import deque

cola = deque()
cola

cola = deque(["Hector","Juan", "Miguel"])
cola

cola.append("Maria")
cola.append("Arnold")

cola

#Se saca el primero que entró en la cola por lo que es como un pop pero al inverso con popleft

cola.popleft() #Solo funciona en una deque, no en listas

cola