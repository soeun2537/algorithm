num = int(input())
inputList = list(map(int, input().split()))

rank = sorted(list(set(inputList)))
rankDict = {value: index for index, value in enumerate(rank)}

resultList = []
for i in inputList:
    resultList.append(rankDict[i])

for i in range(len(resultList)):
    print(resultList[i], end=" ")