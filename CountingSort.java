import java.util.*;


class CountingSort
{
void  sort(int[] arr)
{
int count[] =new int[10];
int output[] = new int[arr.length];

for(int i=0;i<arr.length;i++)
{
count[arr[i]%10]++;
}
for(int j=1;j<10;j++)
{
count[j]=count[j-1]+count[j];
}
for(int i=0;i<arr.length;i++)
{
output[count[arr[i]%10]-1]=arr[i];
count[arr[i]%10]--;
}
for(int i=0;i<arr.length;i++)
{
System.out.print(output[i]+" ");
}
}


public static void main(String[] args)
{
int[] arr={10,13,13,11,12,10,19};                    
CountingSort ss = new CountingSort();
ss.sort(arr);

}
}
