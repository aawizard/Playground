#include<iostream>
using namespace std;
int joseph(int n,int k){
	if(n==1)
      return 1;
  	 return (joseph(n - 1, k) + k-1) % n + 1;
}
int main()
{
  int n, k;
  cin>>n>>k;
  cout<<joseph(n,k);
  return 0;
}