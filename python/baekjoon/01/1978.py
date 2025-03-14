num = int(input())
array = list(map(int, input().split()))

count = 0
for i in range(num):
    is_Prime = True

    for j in range(2, array[i]):
        if (array[i] % j == 0):
            is_Prime = False

    if is_Prime and array[i] > 1:
        count += 1

print(count)