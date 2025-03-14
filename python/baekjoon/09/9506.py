while (True):
    num = int(input())

    if (num == -1):
        break

    factor = []
    for i in range(1, num):
        if (num % i == 0):
            factor.append(i)
    
    if (sum(factor) != num):
        print(num, "is NOT perfect.")
    else:
        print(num, "= ", end="")
        for j in range(len(factor)):
            if (factor[j] == factor[-1]):
                print(factor[j])
                break
            print(factor[j], "+ ", end="")