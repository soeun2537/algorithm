while (True):
    string = input()
    if (string == "."):
        break

    stack = []
    machingBrackets = {')': '(', ']': '['}

    for char in string:
        if char in "([":
            stack.append(char)
        elif char in ")]":
            if stack and stack[-1] == machingBrackets[char]:
                stack.pop()
            else:
                print("no")
                break
    else:
        if (len(stack) == 0):
            print("yes")
        else:
            print("no")