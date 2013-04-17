#include<iostream>
using namespace std;

void main()
{
  int *a,n,m;
	cout<<"请输入两个数，一个为总人数，一个为每次出圈人编号：\n";
	cin>>n>>m;//表示可以动态输入
	a=new int[n+1];
	for(int i=0;i<n;i++) //给每个人一个编号
		a[i]=i+1;
	int k=1; //标识处理第k个出圈的人
	i=-1; //下标初值为-1,下一个值0就是第1个人的下标
	cout<<"离开圈子的人依次是：";
	while(1)
	{
		for(int j=0;j<m;) //在圈中数m个人
		{
			i=(i+1)%n;
			if(a[i]!=0) //如果该人在圈中，则数数有效
				j++;
		}
		if(k==n)break;
		cout<<a[i]<<" "; //输出离开圈子的人编号
		a[i]=0;   //标识该人已离开
		k++;
	}
	cout<<endl<<"胜利者是："<<a[i]<<"号"<<endl; //输出胜利者编号
}
