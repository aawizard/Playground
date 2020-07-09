#include<iostream>
using namespace std;
int maxloot(int a[],int n){
if (n==0)
  return 0;
  
 int value1=a[0]; 
if(n==1)
  return a[0];
  int value2= max(a[0],a[1]);
if(n==2)
  return value2;
  
  
 int maxv;
  for(int i=2;i<n;i++){
  maxv=max(a[i]+value1,value2);
    value1 = value2; 
        value2 = maxv;
  
  }
  return maxv;
}
int main()
{
  int n;
  cin>>n;
  int a[n];
  int sum1=0,sum2=0;
  for(int i=0;i<n;i++){
  cin>>a[i];
  }
  cout<<maxloot(a,n);
  return 0;
  
  
}