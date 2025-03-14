while(True):
    a, b, c = map(int, input().split())
    if (a == b == c == 0):
        break
    a2 = a ** 2
    b2 = b ** 2
    c2 = c ** 2
    if (a2 + b2 == c2):
        print("right")
        continue
    if (b2 + c2 == a2):
        print("right")
        continue
    if (c2 + a2 == b2):
        print("right")
        continue
    print("wrong")