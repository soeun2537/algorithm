while (True):
    a, b, c = map(int, input().split())
    
    if (a == b == c == 0):
        break

    if (max(a, b, c) >= (a + b + c - max(a, b, c))):
        print("Invalid")
        continue

    if (a == b == c):
        print("Equilateral")
        continue
    
    if (a == b or b == c or a == c):
        print("Isosceles")
        continue

    print("Scalene")