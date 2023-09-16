# //////////////////////////////////////////////////////////
# //////////////////////////////////////////////////////////
#LOGICA TRUE FALSE

print(1 + 1 == 3) #Salida: False
print(1 + 1 == 2) #Salida: True

#OPERADORES RELACIONALES (Devuelven true o false)

# == Igual que
# != Distinto de
# > Mayor que
# < Menor que
# >= Mayor o igual que
# <= Menor o igual que

#Se puede comparar texto

print("hola" == "hola")#True
palabra = "Hola"
print(palabra[0] == "H") #True

#Con listas

a = [1,2,3]
b = [1,2,3]
c = [1,6,4]

print(a == b) #True
print(a == c) #False

#Lógicos

print(True == True) #True
print(True == False) #False

print(True > False) #Da True porque en binario True es igual a 1
print(False > True) #False

print(False / 5) #0.0
print(True * 3) #3

# //////////////////////////////////////////////////////////
# //////////////////////////////////////////////////////////
#OPERADORES LOGICOS

#Negación de una mentira, es verdad, negación de una verdad, mentira

print(not True) #False
print(not True == False) #True

#OPERADOR AND

#True and True == True
#False and True == False
#True and False == False
#False and False == False

print(True and True) #True
print(True and False) #False

a = 13
print(a > 10 and a < 20) #True es mayor de 10 y menor de 20

#OPERADOR OR

#True or True == True
#False or True == True
#True or False == True
#False or False == False

a = 7
print(a < 10 and a > 20) #True es menor de 10

#EXPRESIONES ANIDADAS

#Orden:
# 1 - Paréntesis
# 2 - Aritméticas: Exponentes, raíces -> Mult. Divisiones -> Sumas y restas
# 3 - Relacionales: ==, !=, <=, etc.
# 4 - Lógicos: True, False

b=2

print(a * b - 2**b >= 20 and not (a % b) != 0) #Da False


# //////////////////////////////////////////////////////////
# //////////////////////////////////////////////////////////
#OPERADORES DE ASIGNACION

a = 0 #Asigna 0 a la variable a
a += 5 #Suma 5 a la variable a
a -= 10 #Resta 10 a la variable a
a *= 2 #Producto en asignación
a /= 2 #División en asignación
a %= 2 #Módulo en asignación
a **= 10 #Potencia en asignación

# //////////////////////////////////////////////////////////
# //////////////////////////////////////////////////////////
#EJEMPLO

n = 0 #Asignación de 0 en n
while n < 10: #Expresión relacional n < 10 que devuelve True
    if (n % 2) == 0: #Expresión aritmética y expresión relacional
        print(n, 'es un número par')
    else:
        print(n, 'es un número impar')
    n += 1 #Expresión aritmética n = n + 1 equivalente en asignación a n += 1