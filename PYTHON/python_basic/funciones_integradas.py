"""FUNCIONES INTEGRADAS EN PYTHON"""

int() #Transforma en entero
float() #Transforma en flotante (decimal)
bin() #Transforma en binario
hex() #Transforma en hexadecimal
oct() #Transforma en octal

str() #Transforma a cadena de caracteres


#Para transformar de str a número hay que pasar por int() obligatoriamente

n = "10"
bin(int(n))

#Para pasar e int a binario o hexadecimal hace falta indicar el factor de conversion
int("0b0101", 2)
int("0xaa", 16)

abs() #Valor absoluto del número
round() #Redondea al alza siempre
eval() #Evalúa una cadena como números

eval("2-1")

n=10
eval("n*10 - 2") #Soporta variables dentro

len() #Longitud de cadena, lista, etc.

help() #Ayuda de python offline. 

#Más funciones en https://docs.python.org/3/library/functions.html
