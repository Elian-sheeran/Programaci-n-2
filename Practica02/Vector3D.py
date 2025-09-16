import math

class Vector3D:
    def __init__(self, x, y, z):
        self.x, self.y, self.z = x, y, z

    # a) Suma de dos vectores
    def __add__(self, other):
        return Vector3D(self.x + other.x, self.y + other.y, self.z + other.z)

    # b) Multiplicación de un escalar por un vector
    def __rmul__(self, r):  # r * a
        return Vector3D(r * self.x, r * self.y, r * self.z)

    def __mul__(self, other):
        # Producto escalar (a · b)
        if isinstance(other, Vector3D):
            return self.x * other.x + self.y * other.y + self.z * other.z
        # Escalar * Vector (si se hace a * r en vez de r * a)
        elif isinstance(other, (int, float)):
            return Vector3D(self.x * other, self.y * other, self.z * other)
        else:
            raise TypeError("Operación no soportada")

    # c) Longitud del vector
    def norma(self):
        return math.sqrt(self.x**2 + self.y**2 + self.z**2)

    # d) Vector normal (unitario)
    def normal(self):
        n = self.norma()
        if n == 0:
            raise ValueError("No se puede normalizar un vector nulo")
        return Vector3D(self.x/n, self.y/n, self.z/n)

    # e) Producto vectorial (a × b)
    def cross(self, other):
        return Vector3D(
            self.y*other.z - self.z*other.y,
            self.z*other.x - self.x*other.z,
            self.x*other.y - self.y*other.x
        )

    # Representación en texto
    def __str__(self):
        return f"({self.x}, {self.y}, {self.z})"



a = Vector3D(1, 2, 3)
b = Vector3D(4, 5, 6)

print("a =", a)
print("b =", b)

print("a + b =", a + b)
print("2 * a =", 2 * a)
print("a · b =", a * b)  # producto escalar
print("a × b =", a.cross(b))  # producto vectorial
print("|a| =", a.norma())
print("a normalizado =", a.normal())

