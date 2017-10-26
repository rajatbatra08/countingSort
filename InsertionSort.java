import java.util.*;


class InsertionSort
{
void  sort(int[] arr)
{
int i=0,j=1;
int n=arr.length;

while(j<n)
{
i=0;
while(i<j)
{
if(arr[i]>arr[j])
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
i++;
}
j++;
}









}

public static void main(String[] args)
{
int[] arr={64,25,12,22,11};
InsertionSort ss = new InsertionSort();
ss.sort(arr);
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" " );
}
}
}
