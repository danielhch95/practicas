v = "Hola"
n = 10
# print(v, "guapo, te daba hasta",n, "veces <3")

# #Con los corchetes le indicamos que en ese lugar irá el contenido de las variables indicadas en format(v,n)
# # de forma ordenada v en el primer corchete y n en el segundo

# c = "{} guapo, te daba hasta {} veces <3".format(v,n)

# print(c)

c = "{1} guapo, te daba hasta {0} veces <3".format(v,n) #Los números indican el orden en la tupla de los valores enviados al format

print(c)

#Otras formas de hacer esto:

c = "{v} guapo, te daba hasta {n} veces <3".format(v=v,n=n)

print(c)

"""OTRAS FUNCIONES DE FORMAT

Con {:>30} alinea la palabra a la derecha ocupando en total, espacios y palabra, 30 caracteres
Con {:^30} la alinea justo en el centro de un espacio de 30 caracteres
Con {:.5} muestra solo hasta el quinto caracter

Se pueden combinar en:

Con {:>30.5} Alinea en 30 caracteres a la derecha y muestra los 5 primeros caracteres
"""

print("{:>30}".format("una palabra"))
print("{:^30}".format("una palabra"))
print("{:.5}".format("una palabra"))
print("{:>30.5}".format("una palabra"))

"""FORMATEO DE NUMEROS ENTEROS RELLENADOS CON ESPACIOS

Quiero mostrar el 1, 10 y 100 que rellenen con espacios a la izquierda de forma que ocupen 4 dígitos cada uno

Con {:4d} se determina a 4 dígitos y rellena a la izquierda con espacios
Con {:04d} se determina a 4 dígitos y rellena con 0"""

print("{:04d}".format(10))
print("{:04d}".format(100))
print("{:04d}".format(1000))

# Recortar a 2 decimales. Rellena con 0 si no tiene suficientes decimales

print("{:.2f}".format(3.43563))

#Para alinear a la vez que se determinan los decimales se usa {:7.3f}
# y si le añadimops 0 delante del , es el caracter con el que rellenar

print("{:07.2f}".format(3.43563))