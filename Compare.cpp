#include<stdio.h>
#include<windows.h>
#pragma warning(disable:4996)
int NumCompare(int x, int y){
	int num = 0;//����һ���������ڱ�ʾ�ȽϽ��
	if (x > y){
		num = x;}
	else if (x<y){
		num = y;}
	else
		return num;//��num��ֵ����
}

int main(){
	int x, y;//������������
	printf("����������Ƚϵ�������(�м��ÿո����)\n");
	scanf("%d,%d",&x,&y);
	if (0== NumCompare(x, y))//�ж��Ƿ����
	{
		printf("����һ����");
	}
	else{
		printf("�����нϴ�ֵΪ��%d", NumCompare(x, y));
	}
	system("pause");
	return 0;
}