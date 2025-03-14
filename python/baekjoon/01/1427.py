array = list(map(int, input()))

dictionary = {}

for i in range(len(array)):
    key = array[i]
    if key in dictionary:
        dictionary[key] += 1
    else:
        dictionary[key] = 1

for i in range(9, -1, -1):
    if i in dictionary:
        print(str(i) * dictionary[i], end="")
    else:
        continue