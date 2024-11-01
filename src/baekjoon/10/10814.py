num = int(input())

inputList = [[0] * 2 for _ in range(num)]
for i in range(num):
    age, name = map(str, input().split())
    inputList[i][0] = int(age)
    inputList[i][1] = name

inputList.sort(key = lambda x: x[0])

for i in range(num):
    print(inputList[i][0], end=" ")
    print(inputList[i][1])