l = int(input())
a = int(input())
b = int(input())
c = int(input())
d = int(input())

korean = 0
if (a % c == 0):
    korean += a // c
else:
    korean += a // c + 1

math = 0
if (b % d == 0):
    math += b // d
else:
    math += b // d + 1

print(l - max(korean, math))