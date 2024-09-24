paper = [[0 for _ in range(100)] for _ in range(100)]

num = int(input())

for _ in range(num):
    line = input()
    left = int(line.split()[0])
    bottom = int(line.split()[1])
    for i in range(left, left + 10):
        for j in range(bottom, bottom + 10):
            paper[i][j] = 1
        
count = 0
for row in paper:
    for col in row:
        if col == 1:
            count += 1              

print(count)