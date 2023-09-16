"""Hereda con preferencia los métodos de la clase que se ponga más a la izquierda en la creación de la clase

No sobrescribe __init__ ni cualquier otro método de mismo nombre de la clase A con los de la clase B si ya los heredó de A

Ejemplo:"""

class A:
    def __init__(self):
        print("Soy de A")
    def aaa(self):
        print("Método aaa de A")

class B:
    def __init__(self):
        print("Soy de A")
    def aaa(self):
        print("Método aaa de A")
    def b(self):
        print("Soy el método B de B")

class C(A,B):
    pass

prueba = C()

print(C())
print(prueba.aaa())