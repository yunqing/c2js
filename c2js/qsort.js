function partition(a, l, h)
{
	var temp = 0;
	var low = l;
	var high = h;
	var pivotkey = a[low];
	while(low < high) {
		while(low < high && a[high] >= pivotkey) {
			high = high - 1;
		}
		temp = a[low];
		a[low] = a[high];
		a[high] = temp;
		while(low < high && a[low] <= pivotkey) {
			low++;
		}
		temp = a[low];
		a[low] = a[high];
		a[high] = temp;
	}
	return low;
}

function qsort(a, low, high)
{
	var pivotloc = 0;
	if(low < high) {
		pivotloc = partition(a, low, high);
		qsort(a, low, pivotloc - 1);
		qsort(a, pivotloc + 1, high);
	}
}

function main()
{
	var a = [1, 4, 7, 2, 8, 10, 3, 6, 5, 9];
	var n = 10;
	qsort(a, 0, n - 1);
	return 0;
}

