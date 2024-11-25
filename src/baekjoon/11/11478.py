string = input()

resultList = []
for i in range(len(string)):
    for j in range(i+1, len(string)+1):
        resultList.append(string[i:j])

print(len(set(resultList)))