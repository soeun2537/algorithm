def sieveOfEratosthenes(number):
    isPrime = [True] * (number + 1)
    isPrime[0] = isPrime[1] = False
    for i in range(2, int(number**0.5)+1):
        if (isPrime[i]):
            for j in range(i*i, number+1, i):
                isPrime[j] = False
    return [num for num, prime in enumerate(isPrime) if prime]

testCaseCount = int(input())
testCaseList = [int(input()) for _ in range(testCaseCount)]

decimalList = sieveOfEratosthenes(max(testCaseList))

for case in testCaseList:
    count = 0
    left, right = 0, len(decimalList) - 1
    while left <= right:
        total = decimalList[left] + decimalList[right]
        if (total == case):
            count += 1
            left += 1
            right -= 1
        elif total < case:
            left += 1
        else:
            right -= 1
    print(count)