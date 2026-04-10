# Program to check if a number is prime
num = int(input("Enter a number: "))

# Prime numbers must be greater than 1
if num > 1:
    flag = False  # Assume it's prime
    
    # Check for factors from 2 to num-1
    for i in range(2, num):
        if (num % i) == 0:
            flag = True  # Factor found
            break

    if flag:
        print(f"{num} is not a prime number")
    else:
        print(f"{num} is a prime number")
else:
    print(f"{num} is not a prime number")

