num = int(input())

stack = list(map(int, input().split()))
stack.reverse()

newLine = []
currentNum = 0
for i in range(1, num + 1):
    if newLine and newLine[-1] == i:
        newLine.pop()
        continue
    while stack and stack[-1] != i:
        newLine.append(stack.pop())
    if stack and stack[-1] == i:
        currentNum = stack.pop()

if not newLine and not stack:
    print("Nice")
else:
    print("Sad")