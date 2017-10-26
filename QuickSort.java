import java.util.*;


class QuickSort
{
void swap(int[] arr,int a,int b)
{
int temp=arr[a];
arr[a]=arr[b];
arr[b]= temp;
}

int partition(int[]  arr,int low,int high)
{
int pivot=arr[high];
int i=low-1;

for(int j=low;j<high;j++)
{
if(arr[j]<=pivot)
{
i++;
swap(arr,i,j);
}
}
swap(arr,i+1,high);
return i+1;
}


void sort(int[] arr,int low,int high)
{
if(low>=high)
return;
int mid=partition(arr,low,high);
sort(arr,low,mid-1);
sort(arr,mid+1,high);
}

public static void main(String[] args)
{
int[] arr={64,25,12,22,11};
QuickSort ss = new QuickSort();
ss.sort(arr,0,arr.length-1);
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" " );
}
}
}

