inputNum = int(input())
inputCard = list(map(int, input().split()))

targetNum = int(input())
targetCard = list(map(int, input().split()))

countDict = {}
for num in inputCard:
    if num in countDict:
        countDict[num] += 1
    else:
        countDict[num] = 1

result = [str(countDict.get(card, 0)) for card in targetCard]
print(" ".join(result))
