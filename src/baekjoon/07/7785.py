num = int(input())

existList = []
for i in range(num):
    name, status = map(str, input().split())
    if (status == "enter"):
        existList.append(name)
    if (status == "leave"):
        existList.remove(name)

existList.sort()

for i in range(len(existList)-1, -1, -1):
    print(existList[i])