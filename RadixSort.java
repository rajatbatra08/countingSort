import java.util.*;


class RadixSort
{
void sort(int[] arr)
{
int m=802;
  

for(int exp=1;m/exp>0;exp*=10)
{
countingsort(arr,exp);
}
}

void countingsort(int[] arr,int exp)
{
int count[] =new int[10];
int output[] = new int[arr.length];
Arrays.fill(count,0);
for(int i=0;i<arr.length;i++)
{
count[(arr[i]/exp)%10]++;
}
for(int j=1;j<10;j++)
{
count[j]=count[j-1]+count[j];
}
for(int i=arr.length-1;i>=0;i--)

{
output[count[(arr[i]/exp)%10]-1]=arr[i];
count[(arr[i]/exp)%10]--;
}
for(int i=0;i<arr.length;i++)
{
arr[i]=output[i];
}
}


public static void main(String[] args)
{
int[] arr={170, 45, 75, 90, 802, 24, 2, 66};                    
RadixSort ss = new RadixSort();
ss.sort(arr);
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" " );
}

}
}
