package com.elitech.logique;

public class Calcule {
public int somme(int a,int b)
{
return a+b;	
}
public int produit(int a,int b)
{
return a*b;	
}
public double fact(int f)
{
double fac=1;
for(int i=2;i<=f;i++)
{
	fac*=i;
	
}
return fac;
}
public int pgcd(int x,int y)
{
while(x!=y)
{
	if(x>y)
		x=x-y;
	else
		y=y-x;
	
}
return x;

}
}
