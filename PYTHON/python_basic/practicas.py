#Función para comprobar si yuna matriz 3x3 es la matriz unidad
def comprobacion_matriz_unidad_3x3(matriz):
    for indice_fila, fila in enumerate(matriz):
        if indice_fila == 0:
            if matriz[0][0] == 1 and matriz[0][1] == 0 and matriz[0][2] == 0:
                comprobacion_fila_1 = True
            else:
                comprobacion_fila_1 = False
                break
        elif indice_fila == 1:
            if matriz[1][0] == 0 and matriz[1][1] == 1 and matriz[1][2] == 0:
                comprobacion_fila_2 = True
            else:
                comprobacion_fila_2 = False
                break
        elif indice_fila == 2:
            if matriz[2][0] == 0 and matriz[2][1] == 0 and matriz[2][2] == 1:
                comprobacion_fila_3 = True
            else:
                comprobacion_fila_1 = False
                break
    if comprobacion_fila_1 == True and comprobacion_fila_2 == True and comprobacion_fila_3 == True:
        print("Es la matriz unidad")
    else:
        print("esto que coño es????")
#Función calculadora básica con menú
def menu_calculadora_basica():

    n1 = int(input("Intruduce el primer número: "))
    n2 = int(input("Intruduce el segundo número: "))

    print("Elige la operación a realizar:\n[1] Sumar los dos números.\n[2] Restar los dos números\n[3] Multiplicar los dos números\n[4] Dividir los dos números")

    opcion = int(input("Introduce la opción: "))
    
    if opcion == 1:
        print("Resultado: ", n1+n2)
    elif opcion == 2:
        print("Resultado: ", n1/n2)
    elif opcion == 3:
        print("Resultado: ", n1*n2)
    elif opcion == 4:
        print("Resultado: ", n1/n2)
#Comprobación si es una matriz cuadrada
def comprobacion_matriz_cuadrada(matriz_ejemplo):
    for fila in matriz_ejemplo:
        es_cuadrada = True
        if len(fila) == len(matriz_ejemplo):
            continue
        else:
            print("No es una matriz cuadrada")
            es_cuadrada = False
            break
    if es_cuadrada:
        print("Es cuadrada.")
comprobacion_matriz_cuadrada([[0,1],[1,0]])
#Función para comprobar si una matriz cuadrada de cualquier rango es la matriz unidad
def comprobacion_matriz_unidad_cualquier_rango(matriz_unidad):
    es_unidad = True #Partimos de la base que es verdade que es la matriz unidad
    for indice_fila, fila in enumerate(matriz_unidad):#Leemos las líneas de la matriz
        if es_unidad == False:#Comprobamos que no haya dado falso, si dio falso en el for de los valores de cada línea, cortamos el for de las filas
            break
        for indice_valor, valor in enumerate(fila): #Se leen los valores de cada línea de la matriz
            if indice_valor == indice_fila and matriz_unidad[indice_fila][indice_valor] == 1: #Comprueba la poisición del 1
                continue
            elif indice_valor != indice_fila and matriz_unidad[indice_fila][indice_valor] == 0: #Comprueba que el resto sea 0
                continue
            else: #Si no dan 0 todo lo demás o los 1 no están donde deben, devuelve el valor falso que se utiliza al comienzo del primer for y rompe este for
                es_unidad = False
                break
    if es_unidad == True: #Si el resultado de las pruebas no da resultao falso, se imprime que es una matriz cuadrada unidad de rango x
        print("Es una matriz unidad de rango {}".format(len(matriz_unidad)))
    else:
        print("No es una matriz unidad")
comprobacion_matriz_unidad_cualquier_rango([[1,0],[0,1]])

#Calculadora de matrices con manejo de errores.