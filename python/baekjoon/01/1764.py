noHearCount, noSeeCount = map(int, input().split())

noHearNoSee = {}
noHearNoSeeCount = 0
for i in range(noHearCount):
    noHearNoSee[input()] = 1

for i in range(noSeeCount):
    inputString = input()
    if inputString in noHearNoSee:
        noHearNoSeeCount += 1
        noHearNoSee[inputString] += 1

sortedNoHearNoSee = sorted(noHearNoSee.items())
print(noHearNoSeeCount)
for i in range(len(sortedNoHearNoSee)):
    if (sortedNoHearNoSee[i][1] == 2):
        print(sortedNoHearNoSee[i][0])