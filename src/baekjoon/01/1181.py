num = int(input())

inputList = []
for i in range(num):
    inputList.append(input())

noDuplicateInputList = list(set(inputList))
noDuplicateInputList.sort(key = lambda x: (len(x), x))

for i in noDuplicateInputList:
    print(i)