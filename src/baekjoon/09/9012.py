count = int(input())

for _ in range(count):
    stack = []
    string = input()

    for char in string:
        if (char == "("):
            stack.append("(")
        elif (char == ")"):
            if (stack):
                stack.pop()
            else:
                print("NO")
                break
    else:
        if (len(stack) == 0):
            print("YES")
        else:
            print("NO")