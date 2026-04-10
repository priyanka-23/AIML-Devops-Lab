# Fixed range: find primes between 1 and 50
lower = 1
upper = 50

print(f"Prime numbers between {lower} and {upper} are:")

for num in range(lower, upper + 1):
    # Prime numbers must be greater than 1
    if num > 1:
        for i in range(2, num):
            if (num % i) == 0:
                break
        else:
            print(num, end=" ")

