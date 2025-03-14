aCount, bCount = map(int, input().split())
a = set(map(int, input().split()))
b = set(map(int, input().split()))

aMinusB = len(a-b)
bMinusA = len(b-a)

print(aMinusB + bMinusA)