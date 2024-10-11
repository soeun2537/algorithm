a = int(input())
b = int(input())
c = int(input())

while (True):
    if (a + b + c != 180):
        print("Error")
        break
    if (a == b == c == 60):
        print("Equilateral")
        break
    if (a == b or b == c or a == c):
        print("Isosceles")
        break
    print("Scalene")
    break