from collections import deque

num = int(input())

queue = deque()

for i in range(1, num + 1):
    queue.append(i)

for _ in range(num - 1):
    queue.popleft()
    queue.append(queue.popleft())

print(queue.pop())