#Acceso a caracteres concretos de una cadena

palabra = "Python"

print(palabra[0])

#Índice de python:
# P  Y  T  H  O  N
# 0  1  2  3  4  5
#-6 -5 -4 -3 -2 -1

print(palabra[-1], palabra[-6])

#SLICING

print(palabra[0:2]) #Muestra desde el índice 0 al 1 (2 no lo incluye)
print(palabra[2:]) #Muestra desde el índice 2 al final (2 no lo incluye)
print(palabra[:2]) #Muestra desde el comienzo al 1 (2 no lo incluye)

#print(palabra[99]) Da error porque no existe
print(palabra[99:]) #No muestra nada ya que no hay nada desde la posición 99 en adelante
print(palabra[:99]) #Muestra la cadena desde el comienzo hasta el 98, en este caso únicamente muestra "Python" ya que no hay nada más a partir de la posición 6

print(palabra[::-1]) #CADENA VOLTEADA



#SUSTITUCION DE CARACTERES DE LA CADENA NO SE PUEDE PERO AL CREAR UNA NUEVA VARIABLE SI

#palabra[0] = "N" da error ya que el objeto tipo cadena (string str) no permite la asignación de items

# Esta es la solución

palabra_2 = "N" + palabra[1:]
print(palabra_2)

#Conocer propiedades de la cadena
#LONGITUD

print(len(palabra))

#EJERCICIO DE VOLTEO DE CADENAS

# Variables del ejercicio
cadena_corrupta = "airotsiH,6.7,aícraG nómaR"

cadena_volteada = cadena_corrupta[::-1] #SE LE DA LA VUELTA

#Se seleccionan las string adecuadas

nombre = cadena_volteada[:12]
nota = cadena_volteada[13:16]
materia = cadena_volteada[17:]

#Se suman

cadena_formateada = nombre + " ha sacado un " + nota + " en " + materia