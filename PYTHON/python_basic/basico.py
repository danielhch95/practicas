# //////////////////////////////////////////////////////////
# //////////////////////////////////////////////////////////
#NUMEROS

#TIPOS DE NUMEROS

A = int(1)
print(A)

#Los decimales deben ponerse con un .

B = float(2.34)
print(B)

#OPERACIONES:

Suma = 3 + 2
Resta = 3 - 2
Multiplicacion = 3 * 2
Division = 3 / 2
Modulo = 3 % 2
Potencia = 3 ** 2

#Python tiene en cuenta las reglas matemáticas

print(3+2-4*20)


# //////////////////////////////////////////////////////////
# //////////////////////////////////////////////////////////
#VARIABLES

#Reglas:
#1 - No puede comenzar por número
#2 - No puede tener espacios
#3 - No puede tener caracteres especiales (áéíóúñç¿?)
#4 - Recomendable usar _ para los espacios

#TEXTO

#TIPOS DE TEXTO

#Hay dos tipos de comillas que sirven para mostrar unas comillas dentro de otras para mostrar en la salida.

print('Hola mundo') # Salida -> Hola mundo
print("Hola mundo") # Salida -> Hola mundo
print("Hola 'mundo'") #Salida -> Hola 'mundo'

# print("Hola "mundo"") falla, para esto hay los escapes: \'mundo\' y \"mundo\'""

print("Hola \"mundo\"")

#Tabulación: \t
#Salto de línea: \n
print("hola\tmundo")
print("hola\nmundo")

#Para que no entren en conflicto con caracteres de rutas del sistema, por ejemplo, se puede poner r antes del comillado
print("C:\nombre") #En este caso hace un salto de línea
print(r"C:\nombre")

#Varias lineas en un mismo print

print("""Hola
mundo
.""")

ruta_de_acceso = "C:\nombre" #Guarda el texto como tal, el print es el que interpreta el \n como salto de línea
ruta_de_acceso = r"C:\nombre" #Así se anularía el \n y se mostraría el texto tal cual

#OPERACIONES CON TEXTO

ruta_de_acceso_2 = "\HOLAMUNDO"

#SUMA

print (ruta_de_acceso + ruta_de_acceso_2)

#MULTIPLICACION

print (" " * 10 +"Hola mundo") #Añade 10 espacios con la multiplicacion

#Varias cadenas en una variable

texto_a = "Hola" " mundo"
print (texto_a) # Muestra "Hola mundo"
print(texto_a + ruta_de_acceso) #Se pueden sumar variables con varias cadenas dentro