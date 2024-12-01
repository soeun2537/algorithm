def findDecimal(number):
    if (number < 2):
        return False
    for i in range(2, int(number**0.5)+1):
        if (number % i == 0):
            return False
    return True

num = int(input())

testCase = []
for i in range(num):
    testCase.append(int(input()))

for i in testCase:
    while True:
        if (findDecimal(i)):
            print(i)
            break
        i += 1
