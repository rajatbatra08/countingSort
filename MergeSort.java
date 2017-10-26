import java.util.Scanner;

class MergeSort
{
static int count=0;
void merge(int[] arr,int low,int mid,int high)
{
int n1=mid-low+1;
int n2=high-mid;
int[] l = new int[n1];
int[] r = new int[n2];
for(int i=0;i<n1;i++)
{
l[i]=arr[low+i];
}
for(int i=0;i<n2;i++)
{
r[i]=arr[mid+1+i];
}
int i=0;
int j=0;
int k=low;
//int[] ans = new int[n1+n2];
while(i<n1 && j<n2)
{
if(l[i]<=r[j])
{
arr[k]=l[i];
i++;
k++;
}
else{
count+=n1-i;
arr[k]=r[j];
j++;
k++;
}
}
if(i<n1)
{
while(i<n1)
{
arr[k]=l[i];
i++;
k++;
}
}
else if(j<n2)
{
while(j<n2)
{
arr[k]=r[j];
j++;
k++;
}
}

}



void mergesort(int[] arr,int low,int high)
{
if(low>=high)
return;
int mid=(low+high)/2;
mergesort(arr,low,mid);
mergesort(arr,mid+1,high);
merge(arr,low,mid,high);
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int[]  arr = {1,20,6,4,5};
MergeSort ms = new MergeSort();
ms.mergesort(arr,0,arr.length-1);

for(int i=0;i<arr.length;i++)
System.out.print(arr[i]+ " " );
System.out.println(count);

}
}



 



