participation = list(map(int, input().split()))

if (sum(participation) < 100):
    lowest = participation.index(min(participation))
    if (lowest == 0):
        print("Soongsil")
    elif (lowest == 1):
        print("Korea")
    else:
        print("Hanyang")
else:
    print("OK")