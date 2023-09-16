def saludo():
    print("Hola holita desde funciones.saludo()")

def despedida():
    print("Adiós")


# saludo() #Si ponemos esto, al importar el fichero entero desde el otro .py, se ejecuta también esto

#Para evitarlo, podemos comprobar que la variable name (que tendrá el nombre del fichero)
# tenga el valor "__main__" que se le da únicamente al fichero desde el que ejecutamos el programa

if __name__ == '__main__':
    saludo()