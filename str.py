import math

def is_strong_number(num):
    # Calculate the sum of factorials of digits
    sum_of_factorials = sum(math.factorial(int(digit)) for digit in str(num))
    return sum_of_factorials == num

# Print all Strong Numbers between 1 and 5000
print("Strong Numbers between 1 and 5000:")
for number in range(1, 5001):
    if is_strong_number(number):
        print(number)
