def findDecimal(number):
    if (number < 2):
        return False
    for i in range(2, int(number**0.5)+1):
        if (number % i == 0):
            return False
    return True

a, b = map(int, input().split())

for i in range(a, b+1):
    if (findDecimal(i)):
        print(i)