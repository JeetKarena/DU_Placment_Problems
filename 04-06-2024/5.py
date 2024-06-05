# input     : binary string
# output    : number

def convert_bin_to_number(binstring:str):
    left_sub_string     = binstring.split(".")[0]
    right_sub_string    = binstring.split(".")[-1]
    # right_pwr=len(right_sub_string)
    real_number=0
    fac_number=0
    for index,value in enumerate(left_sub_string[::-1]):
        real_number+=int(value)*2**index
    
    for index,value in enumerate(right_sub_string):
        print(index)
        fac_number+=int(value)*2**(-(index+1))
    return real_number+fac_number

print(convert_bin_to_number(input("Enter Binary Number : ")))