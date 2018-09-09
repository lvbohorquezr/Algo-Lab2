"""

@author: Juanito Banana

"""
import pylab as pl
import itertools

def insertionSortSt(arr):
    steps=0
    compa=0
    swaps=0
    for i in range(1,len(arr)):
        cv=arr[i]
        index=i
        steps+=3
        while index > 0 and arr[index-1]> cv:
            compa+=1
            arr[index]= arr[index-1]
            swaps += 1
            index -=1
            steps+=3
        arr[index]=cv
        steps+=1
    nadeshiko=[steps,compa,swaps]
    return nadeshiko


n= int(raw_input())
lista=[]
arr_steps=[]
arr_compa=[]
arr_swaps=[]
for i in range(n):
    lista.append(i)
permutations=(list(itertools.permutations(lista)))

for sorting in permutations:
    arr=list(sorting)
    analisis=insertionSortSt(arr)
    arr_steps.append(analisis[0])
    arr_compa.append(analisis[1])
    arr_swaps.append(analisis[2])


pl.hist(arr_steps, bins='auto')
pl.title("Histograma con todas las permutaciones de n steps")
pl.show()

pl.hist(arr_compa, bins='auto')
pl.title("Histograma con todas las permutaciones de n comparisons")
pl.show()

pl.hist(arr_swaps, bins='auto')
pl.title("Histograma con todas las permutaciones de n swaps")
pl.show()

