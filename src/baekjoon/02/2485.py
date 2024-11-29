num = int(input())

colonnade = []
for _ in range(num):
    colonnade.append(int(input()))

difference = []
for i in range(num - 1):
    difference.append(colonnade[i + 1] - colonnade[i])

commonDivisor = difference[0]
for i in range(1, len(difference)):
    a, b = commonDivisor, difference[i]
    while b: 
        a, b = b, a % b
    commonDivisor = a
    if commonDivisor == 1:
        break

print(int(((max(colonnade) - min(colonnade)) / commonDivisor) - num + 1)) 