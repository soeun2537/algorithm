target = int(input())

answer = 0
for i in range(1, target):
    sum = i
    length = len(str(i))

    for j in range(length):
        sum += i // 10**j % 10

    if (sum == target):
        answer = i
        break

print(answer)
