from collections import deque

def queueOperation(commands):
    queue = deque()
    result = []

    for command in commands:
        if command.startswith("push"):
            _, number = command.split()
            queue.append(number)
        elif command == "pop":
            if queue:
                result.append(queue.popleft())
            else:
                result.append(-1)
        elif command == "size":
            result.append(len(queue))
        elif command == "empty":
            if queue:
                result.append(0)
            else:
                result.append(1)
        elif command == "front":
            if queue:
                result.append(queue[0])
            else:
                result.append(-1)
        elif command == "back":
            if queue:
                result.append(queue[-1])
            else:
                result.append(-1)

    return result

count = int(input())

commands = []
for _ in range(count):
    commands.append(input())

result = queueOperation(commands)
print("\n".join(map(str, result)))