while (True):
    a, b = map(int, input().split())

    if (a == 0 and b == 0):
        break

    if ((b / a > 1) and (b % a == 0)):
        print("factor")
        continue

    if ((a / b > 1) and (a % b == 0)):
        print("multiple")
        continue

    print("neither")