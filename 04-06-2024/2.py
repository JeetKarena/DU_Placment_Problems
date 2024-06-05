# Input1 : List Of Str Fun
# Input2 : List Of values

class MinStack:
    
    def __init__(self) -> None:
        self.stack=[]
        self.minstack=[]
    
    def push(self,var:int)->None:
        self.stack.append(var)
        if not self.minstack or var<= self.minstack[-1]:
            self.minstack.append(var)
        else:
            self.minstack.append(self.minstack[-1])
    
    def pop(self)->int:
        if self.stack:   
            result=self.stack.pop()
            self.minstack.pop()
            return result
        else:
            print("Stack is UnderFlow")
    
    def top(self)->int:
        if self.stack:
            return self.stack[-1]
        else:
            print("No Element Present In Stack")
    def get_min(self)->int:
        if self.minstack:
            return self.minstack[-1]
        else:
            print("Stack is UnderFlow")
            
list_of_funcations=list(map(str,input("Enter Funcations Space Seprated : ").split(" ")))
list_of_values=list(map(int,input("Enter Values Space Seprated : ").replace('em',None).split(" ")))

min_Stack_obj=MinStack()

for i,values in zip(list_of_funcations,list_of_values):
    if i.lower() =="push":
        min_Stack_obj.push(values)
    elif i.lower() == "pop":
        print(min_Stack_obj.pop())
    elif i.lower() == "top":
        print(min_Stack_obj.top())
    elif i.lower() == "getmin":
        print(min_Stack_obj.get_min())