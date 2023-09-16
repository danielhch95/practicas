"""MANEJO DE ERRORES

Si no se mete un int en el input, se ejecuta el except"""

#intenta el try, si tiene un error, jecuta el except, si no hay errores, se ejecuta lo del else.
#En el finally se ejecuta al final haya o no un erorr.
while(True):
    try:
        n = float(input("Pon un número: "))
        m = 4
        print("{}/{}={}".format(n,m,n/m))
    except:
        print("Ha ocurrido un error, introduce de nuevo el número.")
    else:
        print("Todo ha funcionado correctamente")
        break
    finally:
        print("Fin de la iteración.")

"""MULTIPLES EXCEPCIONES"""

try:
    n = input("Mete num:")
    print(5/n)
except Exception as e: #Se aisla el error en la variable e
    print( type(e).__name__ ) #Se extrae el tipo del error de la variable e.

# Se podría mostrar un print distinto por cada tipo de error por ejemplo
# En este ejemplo se realiza con el error de tipo de dato, valor erróneo y por un error al dividir por 0.

try:
    n = float(input("Mete num:"))
    print(5/n)
except TypeError:
    print("No se puede dividir una cadena por un número.")
except ValueError:
    print("Debes introducir un número.")
except ZeroDivisionError:
    print("No se puede dividir por 0.")
except Exception as e: #Se aisla el error en la variable e
    print( type(e).__name__ ) #Se extrae el tipo del error de la variable e.

"""Esta función de ejemplo equivaldría a la siguiente"""

def funcion_prueba(algo=None):
    if algo is None:
        print("ERROR! No se permite un valor nulo.")

def funcion_prueba(algo=None):
    try:
        if algo is None:
            raise ValueError("Error! No se permite un valor nulo.")
    except ValueError:
        print("Error desde la excepción.")


"""MÁS EXCEPCIONES EN https://docs.python.org/3/library/exceptions.html#base-classes"""