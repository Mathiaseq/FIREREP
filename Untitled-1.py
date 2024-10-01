print("Program testujący operatorów arytmetycznych.")

a = int ( input("Podaj a: "))
b = int ( input("Podaj b: "))
#arytmetyczne
print(a + b)#dodawanie
print(a - b)#odejmowanie
print(a * b)#mnożenie
print(a / b)#dzielenie

print("Następnie program testujący operatory porożnawcze.")

a = int ( input("Podaj a: "))
b = int ( input("Podaj b: "))
#porożnawcze
print(a == b)
print(a != b)
print(a > b)
print(a < b)
print(a >= b)
print(a <= b)

print("Test na trójkąta z użyciem if i else")

a = int(input("Podaj A: "))
b = int(input("Podaj B: "))
c = int(input("Podaj C: "))
#trójkąt
if a + b > c and a + c > b and b + c > a:
    print("Trójkąt ten spełnia warunki")
elif a == b == c:
    print("Trójkąt równoboczny")
elif a == b or a == c or b == c:
    print("Trójkąt równoramienny")
else:
    print("Trójkąt nie spełnia warunków")

print("Liczby parzyste/nieparzyste")

a = int(input("Podaj A: "))
#parzyste/nieparzyste
if a % 2 == 0:
    print("Liczba jest parzysta")
else:
    print("Liczba jest nieparzysta")
    exit 