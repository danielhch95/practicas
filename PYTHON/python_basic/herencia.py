"""HERENCIA Y SUBCLASES"""

# #Ejemplo sin subclases:

# class Producto:
#     def __init__(self, referencia, tipo, nombre, pvp,  descripcion, productor=None, distribuidor=None, isbn=None, autor=None):
#         self.referencia = referencia
#         self.tipo = tipo
#         self.nombre = nombre
#         self.pvp = pvp
#         self.descripcion = descripcion
#         self.productor = productor
#         self.distribuidor = distribuidor
#         self.isbn = isbn
#         self.autor = autor


# adorno = Producto('000A','ADORNO','Vaso Adornado',15,
#                   'Vaso de porcelana con dibujos') 

# print(adorno)
# print(adorno.tipo)  

# #Ejemplo de subclase Adorno de producto:

class Producto: #Producto es una superclase ya que tiene subclases
    def __init__(self,referencia,nombre,pvp,descripcion):
        self.referencia = referencia
        self.nombre = nombre
        self.pvp = pvp
        self.descripcion = descripcion
#Con el método especial __str__ se modifica la salida (output) de los objetos como string (cadena) al realizar un print sobre el objeto
    def __str__(self): #Formateamos la salida del print(producto_1) y los demás objetos de la subclase Producto.
        return f"REFERENCIA\t {self.referencia}\n" \
               f"NOMBRE\t\t {self.nombre}\n" \
               f"PVP\t\t {self.pvp}\n" \
               f"DESCRIPCIÓN\t {self.descripcion}\n"
    
#Subclase. Hereda las propiedades de la clase superior
#Hereda tanto el __init__ como el __str__
class Adorno(Producto):
    pass

#Subclase alimento que añade distribuidor y productor

class Alimento(Producto):
    productor = ""
    distribuidor = ""

    def __str__(self): #Formateamos la salida del print(alimento_1) y los demás objetos de la subclase Alimento.
        return f"REFERENCIA\t {self.referencia}\n" \
               f"NOMBRE\t\t {self.nombre}\n" \
               f"PVP\t\t {self.pvp}\n" \
               f"DESCRIPCIÓN\t {self.descripcion}\n" \
               f"PRODUCTOR\t\t {self.productor}\n" \
               f"DISTRIBUIDOR\t\t {self.distribuidor}\n"

"""En esta subclase, cojemos directamente en el init, las variables de la super clase con super().__init__(nombre, etc)"""

class Libro(Producto):

    def __init__(self, referencia, nombre, pvp, descripcion, isbn, autor):
        super().__init__(referencia, nombre, pvp, descripcion)
        self.isbn = isbn
        self.autor = autor

    def __str__(self): #Formateamos la salida del print(libro_1) y los demás objetos de la subclase Libro.
        return f"REFERENCIA\t {self.referencia}\n" \
               f"NOMBRE\t\t {self.nombre}\n" \
               f"PVP\t\t {self.pvp}\n" \
               f"DESCRIPCIÓN\t {self.descripcion}\n" \
               f"ISBN\t\t {self.isbn}\n" \
               f"AUTOR\t\t {self.autor}\n"
    
"""De esta manera, nos evitamos hacer una clase única para todos los objetos tengan o no ISBN, productor, Autor, Distribuidor, etc.

En lugar de eso, creamos una superclase que tendrá los atributos comunes a todos ellos y después una subclase para cada especificación de superclase

En este caso, Alimento, Libro y Adorno son subclases de Producto. Todas las subclases tienen los mismos atributos que la superclase pero estas subclases
tienen peculiaridades y atributos a mayores."""



"""Podemos recorrer los objetos de la lista producto pero si están mezcladas varias subclases, nos dará error al hacer print en atributos específicos de la subclase que no tiene una subclase.

Para paliar esto existe la función isinstance({subclase}) para meterla en un if, elif y comprobar la subclase"""

#Ejemplo

productos = []

libro_1 = Libro(1001, "SPQR", 12.99, "Libro sobre la Roma hasta siglo III d.c.", "0-123451-67-8", "Mary Beard")
libro_2 = Libro(1002, "Matar al Rey", 10.99, "Libro sobre la España medieval siglo XIV d.c.", "0-123451-67-9", "Jose Luis Corral")
alimento_1 = Alimento(2001, "Mandarina", 1.00, "Es una mandarina")
alimento_2 = Alimento(2001, "Mandarina", 1.00, "Es una mandarina")
alimento_1.productor = "Granja Verde"
alimento_1.distribuidor = "Mercadona"
alimento_2.productor = "Granja Verde"
alimento_2.distribuidor = "Mercadona"
adorno_1 = Adorno(3001, "Libreta", 2.49, "Es una libreta")
adorno_2 = Adorno(3002, "Lámpara", 5.99, "Es una lámpara blanca")

productos.append(libro_1)
productos.append(libro_2)
productos.append(alimento_1)
productos.append(alimento_2)
productos.append(adorno_1)
productos.append(adorno_2)

for p in productos:
    if isinstance(p, Adorno):
        print(p.referencia, p.nombre, p.pvp)
    if isinstance(p, Libro):
        print(p.referencia, p.nombre, p.pvp, p.autor)
    if isinstance(p, Alimento):
        print(p.referencia, p.nombre, p.pvp, p.productor)

print(libro_1)

"""No se pueden realizar copias de los objetos. Los valores de los objetos se pasan como referencia, no valor.

Ejemplo:"""

def rebaja_de_precio(cosa_a_rebajar, rebaja):
    cosa_a_rebajar.pvp = cosa_a_rebajar.pvp - (cosa_a_rebajar.pvp/100 * rebaja)
    return cosa_a_rebajar

alimento_1_rebajado = rebaja_de_precio(alimento_1, 10)
print(alimento_1_rebajado)
print(alimento_1)#Muestran lo mismo porque al realizar un alimento_1 = alimento_1_rebajado, lo que se hace es crear un enlace de modo que se accede al objeto desde 2 variables.

"""Para copiar un objeto hay que importar el módulo copy

De esta manera la copia es realmente un objeto nuevo y las modificaciones en él no influye al objeto origina"""

from copy import copy

copia_alimento_1 = copy(alimento_1)
copia_alimento_1 = rebaja_de_precio(copia_alimento_1, 10)
print(copia_alimento_1)
print(alimento_1)