num = int(input())

for i in range(1, num + 1):
    a, b = map(int, input().split())
    total = a + b
    print(f"Case {i}: {total}")