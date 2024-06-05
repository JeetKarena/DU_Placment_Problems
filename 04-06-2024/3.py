# Input     : Number
# Output    : Number

import math

def count_traling_zero(number):
    number=math.factorial(number)
    return len(str(number))-len(str(number).rstrip('0'))

print(count_traling_zero(int(input("Enter Number : "))))

