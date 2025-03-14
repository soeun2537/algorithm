def findDecimal(number):
    if (number < 2):
        return False
    for i in range(2, int(number**0.5)+1):
        if (number % i == 0):
            return False
    return True

while(True):
    num = int(input())
    if (num == 0):
        break
    count = 0
    for i in range(num+1, num*2+1):
        if (findDecimal(i)):
            count +=1
    print(count)