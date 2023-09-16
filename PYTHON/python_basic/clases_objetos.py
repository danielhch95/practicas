"""Un objeto se crea a partir de la clase, una vez termina el programa, se libera de la memoria y deja de existir. No es persistente.

Una BBDD sí es persistente porque aunque el programa termine, permanece en memoria"""

#La clase es como un molde para crear objetos
class Galleta:
    chocolate = True

una_galleta = Galleta()
otra_galleta = Galleta()

print(type(una_galleta))
print(type(Galleta))

#Ejemplos

una_galleta.sabor = "Salado"
una_galleta.color = "Marrón"

print("El sabor de la galleta es", una_galleta.sabor)

una_galleta.chocolate = False

print(una_galleta.chocolate)

"""METODO INIT

Es un método especial que siempre se ejecuta para cualquier objeto de la clase

self indica que hace referencia al propio objeto y hace referencia al """

class Galleta():
    chocolate = False
    def __init__(self):
        print("Creamos galleta")
    
g = Galleta()

"""EJEMPLOS

En este ejemplo se recogen 3 datos en la creación del objeto: Titulo, duración y fecha de lanzamiento

En la clase película hacemos un print que indica que se ha creado la película mientras que en el método especial __str__ 
devolvemos un valor en forma de cadena formateada

La clase catálogo consiste en una lista que parte vacía en el método especial __init__ que se ejecuta al crearse el objeto y tenemos dos métodos más:

agregar: Añade a la lista el objeto que le indiquemos. En este caso, añade objetos de la clase Pelicula en forma del return del método __str__
mostrar: muestra cada item de la lista películas."""

class Pelicula():

    def __init__(self, titulo,  duracion, lanzamiento) -> None:
        self.titulo = titulo
        self.duracion = duracion
        self.lanzamiento = lanzamiento
        print("Se ha creado la película{}".format(self.titulo))

    def __str__(self) -> str:
        return f"{self.titulo} ({self.lanzamiento})"


class Catalogo:
    peliculas = []

    def __init__(self, peliculas = []):
        self.peliculas = peliculas
    
    def agregar(self, p):
        self.peliculas.append(p)
    
    def mostrar(self):
        for p in self.peliculas:
            print(p)

pelicula_1 = Pelicula("El Padrino", 175, 1972)
pelicula_2 = Pelicula("El Padrino: Parte 2", 195, 1975)

catalogo_1 = Catalogo([pelicula_1])
catalogo_1.agregar(pelicula_2)

catalogo_1.mostrar()

"""METODOS Y ATRIBUTOS PRIVADOS

Se hacen con doble barra baja al comienzo del nombre del método.

Sí puedenser accesibles desde fuera del objeto mediante funciones públicas que los invoquen"""

class Ejemplo:
    __atributo_privado = "Sisoy atributo privado"

    def __metodo_privado(self):
        print("Sisoy metodo privado")

    def funcion_desprivatizadora(self):
        return self.__atributo_privado
    def funcion_desprivtizadora(self):
        return self.__metodo_privado()
    
a = Ejemplo()
a.funcion_desprivatizadora()
a.funcion_desprivtizadora()

"""QUE ES SELF???

self se refiere al propio atributo en memoria. En la mayoría de los lenguajes es explícito pero en Python no


"""