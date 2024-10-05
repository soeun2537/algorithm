num = int(input())
prime = 2
for i in range(num):
    if (num % prime == 0):
        print(prime)
        num = num / prime
        if (num == 1):
            break
    else:
        prime += 1