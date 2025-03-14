a1, b1 = map(int, input().split())
a2, b2 = map(int, input().split())

numerator = a1 * b2 + a2 * b1
denominator = b1 * b2

for i in range(2, max(numerator, denominator)//2):
    while (numerator % i == 0 and denominator % i == 0):
        numerator //= i
        denominator //= i

print(numerator, denominator)