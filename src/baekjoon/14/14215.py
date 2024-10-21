a, b, c = map(int, input().split())

maxNum = max(a, b, c)
totalSum = a + b + c
if (maxNum >= totalSum - maxNum):
    print(2 * (totalSum - maxNum) - 1)
else:
    print(totalSum)