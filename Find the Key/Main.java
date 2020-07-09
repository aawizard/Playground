#include<iostream>
using namespace std;
int small(int a,int b,int c){
 int s=a>b?b:a;
  s=s>c?c:s;
  return s;
}
int large(int a,int b,int c){
 int l=a<b?b:a;
  l=l<c?c:l;
  return l;
}
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  int a1[4],b1[4],c1[4];
  for(int i=0;i<4;i++){
  a1[i]=a%10;
    b1[i]=b%10;
    c1[i]=c%10;
    a=a/10;
    b=b/10;
    c=c/10;
  }
  int k=small(a1[3],b1[3],c1[3]);
  k=k*10+large(a1[2],b1[2],c1[2]);
  k=k*10+small(a1[1],b1[1],c1[1]);
    k=k*10+large(a1[0],b1[0],c1[0]);
  cout<<k;
  return 0;
}