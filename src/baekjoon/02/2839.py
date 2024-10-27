kilogram = int(input())

box = []
for i in range((kilogram // 3) + 1):
    restThree = kilogram - (3 * i)
    divideFive = restThree // 5
    restFive = restThree % 5
    if (restFive == 0):
        box.append(i + divideFive)

if (len(box) == 0):
    print(-1)
else:
    print(min(box))
