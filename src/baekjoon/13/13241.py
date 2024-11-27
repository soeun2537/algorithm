a, b = map(int, input().split())
leastCommonMultiple = 1

for j in range(2, max(a, b) + 1):
    while (a % j == 0 and b % j == 0):
        leastCommonMultiple *= j
        a = a // j
        b = b // j

leastCommonMultiple *= a
leastCommonMultiple *= b
print(leastCommonMultiple)