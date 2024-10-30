num = int(input())

inputList = [[0] * 2 for _ in range(num)]

for i in range(num):
    x, y = map(int, input().split())
    inputList[i][0] = x
    inputList[i][1] = y

inputList.sort(key = lambda x: (x[1], x[0]))

for i in range(num):
    print(inputList[i][0], end = " ")
    print(inputList[i][1])