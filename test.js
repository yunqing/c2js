function partition_3(a ,l ,h)
{
	var temp;
	var low=l;
	var high=h;
	var pivotkey=a[low];
	while(low<high) {
		while(low<high&&a[high]>=pivotkey) {
		high=high-1;
	}
	temp=a[low];
	a[low]=a[high];
	a[high]=temp;
	while(low<high&&a[low]<=pivotkey) {
		low++;
	}
	temp=a[low];
	a[low]=a[high];
	a[high]=temp;
	}
	return low;
}

function qsort_3(a ,low ,high)
{
	var pivotloc;
	if(low<high) {
		pivotloc=partition_3(a,low,high);
	qsort_3(a,low,pivotloc-1);
	qsort_3(a,pivotloc+1,high);
	}
}

 function main_0()
{
	var a=[1,4,7,2,8,10,3,6,5,9];
	var n=10;
	qsort_3(a,0,9);
	return 0;
}

 
