from collections import deque

def queuestackOperation(queue, num):
    result = num

    queue.appendleft(num)
    result = queue.pop()

    return result

count = int(input())
typeList = list(map(int, input().split()))
elementList = list(map(int, input().split()))
caseCount = int(input())
caseList = list(map(int, input().split()))

queue = deque([elementList[i] for i in range(count) if typeList[i] == 0])

for case in caseList:
    print(queuestackOperation(queue, case), end=" ")