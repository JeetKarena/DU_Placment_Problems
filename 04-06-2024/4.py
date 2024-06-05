# Input     :   int
# Output    :   index

def n_th_integer(var):
    result="".join([str(i) for i in range(1,var+1)])
    return result[var-1]

print(n_th_integer(int(input("Enter Value : "))))