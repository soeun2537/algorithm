n, m = map(int, input().split())

intDict = {}
strDict = {}
for i in range(n):
    name = input()
    intDict[i+1] = name
    strDict[name] = i+1

for j in range(m):
    target = input()
    if (target.isdigit()):
        print(intDict[int(target)])
    else:
        print(strDict[target])