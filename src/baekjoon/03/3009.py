first = []
second = []

for _ in range(3):
    a, b = map(int, input().split())
    first.append(a)
    second.append(b)

ans1 = 0
for i in first:
    if (first.count(i) == 1):
        ans1 = i

ans2 = 0
for i in second:
    if (second.count(i) == 1):
        ans2 = i

print(ans1, ans2)