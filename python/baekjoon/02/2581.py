m = int(input())
n = int(input())

array = []
for i in range(m, n+1):
    isPrime = True

    for j in range(2, i):
        if (i % j == 0):
            isPrime = False
            break
        
    if (isPrime and i > 1):
        array.append(i)

if (len(array) == 0):
    print(-1)
else:
    print(sum(array))
    print(min(array))