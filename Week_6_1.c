#include<stdio.h>
int main()
{
    float in[10], out = 0;
    for (int i = 0 ; i <= 9 ; i++)
    {
        scanf(" %f",&in[i]);
    }

    for (int i = 0; i < 10; i++)          
	{
		for (int j = 0; j < 10; j++)         
		{
			if (in[j] < in[i])              
			{
				int temp = in[i];       
				in[i] = in[j];            
				in[j] = temp;             
			}
        }
    }

    for (int i = 0 ; i <= 4 ; i++)
    {
        out += in[i];
    }
    printf("%.2f",out/5);
    return 0;

}