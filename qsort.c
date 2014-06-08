int partition(int* a, int l, int h) {  
	int temp;
	int low = l;
	int high = h;
	int pivotkey = a[low];
	while(low < high){      
		while(low < high && a[high] >= pivotkey) {          
			high = high - 1;      
		}
		temp = a[low];        
		a[low] = a[high];        
		a[high] = temp;        
		while(low < high && a[low] <= pivotkey){	
			low++;
		}          
		temp = a[low];      
		a[low] = a[high];        
		a[high] = temp;  
	}
	return low;
}

void qsort(int* a, int low, int high) {
	int pivotloc;
	if (low < high){
		pivotloc = partition(a, low, high);
		qsort(a, low, pivotloc - 1);
		qsort(a, pivotloc + 1, high);
	}
}

int main(){
	int a[] = {1,4,7,2,8,10,3,6,5,9};
	int n = 10;   
	qsort(a, 0, 9);
	return 0;
}