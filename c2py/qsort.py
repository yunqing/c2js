def partition(a, l, h):
	temp = 0
	low = l
	high = h
	pivotkey = a[low]
	while low < high:
		while low < high and a[high] >= pivotkey:
			high = high - 1
		temp = a[low]
		a[low] = a[high]
		a[high] = temp
		while low < high and a[low] <= pivotkey:
			low+= 1
		temp = a[low]
		a[low] = a[high]
		a[high] = temp
	return low

def qsort(a, low, high):
	pivotloc = 0
	if low < high:
		pivotloc = partition(a, low, high)
		qsort(a, low, pivotloc - 1)
		qsort(a, pivotloc + 1, high)

def main():
	a = [1, 4, 7, 2, 8, 10, 3, 6, 5, 9]
	n = 10
	qsort(a, 0, n - 1)
	return 0

