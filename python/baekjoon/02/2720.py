num = int(input())

for i in range(num):
    change = int(input())

    quarter = change // 25
    change %= 25

    dime = change // 10
    change %= 10
    
    nickel = change // 5
    change %= 5

    penny = change // 1

    print(quarter, end=" ")
    print(dime, end=" ")
    print(nickel, end=" ")
    print(penny, end="\n")