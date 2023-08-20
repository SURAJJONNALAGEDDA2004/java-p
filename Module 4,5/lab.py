a=input("enter the reference string :")
r = list(map(int, a.split()))
list1=[]
n=int(input("enter no of frames"))
hits=0
fault=0
k=0
for i in range(len(r)):
    if r[i] in list1:
        hits+=1
    else:
        fault+=1
if(len(list1)!=n):
    list1.append(r[i])
else:
    list1[k]=r[i]
    k+=1
if(k>(n-1)):
    k=0
print(f"at t{i+1} frame contains :{list1}")
print("no of hits :",hits)
print("no of faults :",fault)
ratio =(hits)/len(r)
rr=ratio*100
print(f"hit ratio :{rr}%")