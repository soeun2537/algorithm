from collections import deque

count = int(input())

balloon = deque({key + 1: value} for key, value in enumerate(map(int, input().split())))
result = []

result.append(1)
value = balloon.popleft()[1]

while balloon:
    if value > 0:
        for i in range(value - 1):
            balloon.append(balloon.popleft())
        target = balloon.popleft()
    else:
        for i in range(abs(value) - 1):
            balloon.appendleft(balloon.pop())
        target = balloon.pop()
    order = next(iter(target.keys()))
    value = next(iter(target.values()))
    result.append(order)

print(" ".join(map(str, result)))
