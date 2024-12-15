L, P = map(int, input().split())
newspaper = list(map(int, input().split()))

people = L * P
difference = []
for i in range(5):
    difference.append(newspaper[i] - people)
print(" ".join(map(str, difference)))