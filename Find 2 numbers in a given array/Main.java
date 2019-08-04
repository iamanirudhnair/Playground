#include<stdio.h>
int main()
{
  int n,ele_1,ele_2,ele1_index=-1,ele2_index=-1;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
      scanf("%d",&a[i]);
  }
  scanf("%d%d",&ele_1,&ele_2);
  for(int i=0;i<n;i++)
  {
      if(a[i]==ele_1&&ele1_index==-1)
      {
          ele1_index=i;
          break;
      }
      
  }
   for(int i=0;i<n;i++)
  {
      if(a[i]==ele_2&&ele2_index==-1)
      {
          ele2_index=i;
          break;
      }
      
  }
  
  printf("Element 1 index = %d\nElement 2 index = %d",ele1_index,ele2_index);
  	//type your code here
  	return 0;
}