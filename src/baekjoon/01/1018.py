n, m = map(int, input().split())

inputList = [[0] * m for _ in range(n)]
for i in range(n):
    temp = list(input())
    for j in range(m):
        inputList[i][j] = temp[j]

countList = []
for k in range(n - 7):
    for l in range(m - 7):
        countWStart = 0
        countBStart = 0
        for i in range(k, k + 8):
            for j in range(l, l + 8):
                if ((i % 2 == 1 and j % 2 == 1) or (i % 2 == 0 and j % 2 == 0)):
                    if (inputList[i][j] != 'W'):
                        countWStart += 1
                    if (inputList[i][j] != 'B'):
                        countBStart += 1            
                else:
                    if (inputList[i][j] != 'B'):
                        countWStart += 1
                    if (inputList[i][j] != 'W'):
                        countBStart += 1          
        countList.append(countWStart)
        countList.append(countBStart)

print(min(countList))