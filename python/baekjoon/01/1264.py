vowels = ['A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u']

while(True):
    string = input()
    if (string == '#'):
        break
    count = 0
    for vowel in vowels:
        count += string.count(vowel)
    print(count)