from collections import deque

num, order = map(int, input().split())

queue = deque([i for i in range(1, num +1)])
result = []

while queue:
    for _ in range(order - 1):
        queue.append(queue.popleft())
    result.append(queue.popleft())

print("<" + ", ".join(map(str, result)) + ">")