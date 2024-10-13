package com.elitech.logique;

public class Indice {
public String calculeImc(double poid,double taille)
{
long indice=Math.round(poid/(taille*taille));
String remarque="";
if(indice<20)
	remarque="maigre";
else if(indice<=25)
	remarque="idéale";
else
	remarque="surpoids";
	


return "L'imc de "+poid+" "+taille+" est:"+ indice+ " interprétation: "+remarque;
	

}
}
