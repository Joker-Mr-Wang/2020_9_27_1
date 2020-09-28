#include<stdio.h>
#include<windows.h>
#pragma warning(disable:4996)
int NumCompare(int x, int y){
	int num = 0;//设立一个变量用于表示比较结果
	if (x > y){
		num = x;}
	else if (x<y){
		num = y;}
	else
		return num;//将num的值返回
}

int main(){
	int x, y;//定义两个变量
	printf("请输入你想比较的两个数(中间用空格隔开)\n");
	scanf("%d,%d",&x,&y);
	if (0== NumCompare(x, y))//判断是否相等
	{
		printf("二者一样大");
	}
	else{
		printf("二者中较大值为：%d", NumCompare(x, y));
	}
	system("pause");
	return 0;
}