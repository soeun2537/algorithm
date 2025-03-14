from collections import deque

def deckOperation(commands):
    deck = deque()
    result = []

    for command in commands:
        if command.startswith("1"):
            _, num = command.split()
            deck.appendleft(num)
        elif command.startswith("2"):
            _, num = command.split()
            deck.append(num)
        elif command == "3":
            if deck:
                result.append(deck.popleft())
            else:
                result.append(-1)
        elif command == "4":
            if deck:
                result.append(deck.pop())
            else:
                result.append(-1)
        elif command == "5":
            result.append(len(deck))
        elif command == "6":
            if deck:
                result.append(0)
            else:
                result.append(1)
        elif command == "7":
            if deck:
                first = deck.popleft()
                result.append(first)
                deck.appendleft(first)
            else:
                result.append(-1)
        elif command == "8":
            if deck:
                last = deck.pop()
                result.append(last)
                deck.append(last)
            else:
                result.append(-1)

    return result

count = int(input())

commands = []
for _ in range(count):
    commands.append(input())

print("\n".join(map(str, deckOperation(commands))))