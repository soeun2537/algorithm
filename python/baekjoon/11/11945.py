n, m = map(int, input().split())

bread = []
for _ in range(n):
    bread.append(input().strip())

for row in bread:
    print(row[::-1])