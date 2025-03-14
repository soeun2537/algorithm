inputNum = int(input())
inputList = list(map(int, input().split()))
inputDict = {value: 1 for value in inputList}

targetNum = int(input())
targetList = list(map(int, input().split()))

for i in targetList:
    if (i in inputDict):
        print(1, end = " ")
        continue
    print(0, end = " ")