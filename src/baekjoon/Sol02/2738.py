n, m = map(int, input().split())

matrix = [[0] * m for _ in range(n)]

for _ in range(2):
    for i in range(n):
        row = list(map(int, input().split()))
        for j in range(m):
            matrix[i][j] += row[j]

for i in range(n):
    for j in range(m):
        print(matrix[i][j], end=" ")
    print(end="\n")