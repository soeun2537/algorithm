string = input()

isPalindrome = True
for i in range(len(string)//2+1):
    if (string[i] != string[len(string) - 1 -i]):
        isPalindrome = False

if (isPalindrome == True):
    print(1)
else:
    print(0)