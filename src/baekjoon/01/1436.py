n = int(input())

end = []

for i in range(666, 10000000):
    string = str(i)
    length = len(string)
    for j in range(length - 2):
        if (string[j] == "6"):
            if (string[j + 1] == "6"):
                if (string[j + 2] == "6"):
                    end.append(i)
                    break

print(end[n - 1])
