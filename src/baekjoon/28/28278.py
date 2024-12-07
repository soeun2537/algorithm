def stackOperation(commands):
    stack = []
    result = []

    for command in commands:
        if command.startswith("1"):
            _, number = command.split()
            stack.append(number)
        elif command == "2":
            if (len(stack) == 0):
                result.append(-1)
            else:
                result.append(stack.pop())
        elif command == "3":
            result.append(len(stack))
        elif command == "4":
            if (len(stack) == 0):
                result.append(1)
            else:
                result.append(0)
        elif command == "5":
            if (len(stack) == 0):
                result.append(-1)
            else:
                result.append(stack[-1])
    
    return result

count = int(input())

commands = []
for _ in range(count):
    commands.append(input())

result = stackOperation(commands)
print("\n".join(map(str, result)))