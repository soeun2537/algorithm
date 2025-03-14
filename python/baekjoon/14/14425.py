n, m = map(int, input().split())

inputList = []
for _ in range(n):
    inputList.append(input())
inputDict = {value: index for index, value in enumerate(inputList)}

count = 0
for i in range(m):
    target = input()
    if (target in inputDict):
        count += 1

print(count)