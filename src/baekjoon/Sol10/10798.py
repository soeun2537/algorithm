arr = [[-1 for _ in range(15)] for _ in range(5)]

for i in range(0, 5):
    row = input()
    for j in range(len(row)):
        arr[i][j] = row[j]
    
for i in range(0, 15):
    for j in range(0, 5):
        if (arr[j][i] == -1):
            continue
        print(arr[j][i], end="")