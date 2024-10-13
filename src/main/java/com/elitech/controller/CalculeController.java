package com.elitech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elitech.logique.Calcule;

@RestController

public class CalculeController {
Calcule c=new Calcule();
@PostMapping("/somme")
// http://localhost:4200/somme?a=12&b=3
public String getSomme(@RequestParam int a,@RequestParam int b)
{
int somme=c.somme(a, b);
return "la somme de "+a+" et "+b+" est: "+somme;
}
@PostMapping("/prod")
public String getProduit(@RequestParam int a,@RequestParam int b)
{
	int prod=c.produit(a, b);
	return "le produit de "+a+" et "+b+" est: "+prod;	

}
@GetMapping("fact")
public String getFacto(@RequestParam int f)
{
double fact=c.fact(f);
return "la factoriel de "+f+" est: "+fact;
}
@PostMapping("pgcd")
public String getPgcd(@RequestParam int x,@RequestParam int y)
{
int pgcd=c.pgcd(x, y);
return "le pgcd de "+x+" et "+y+" est: "+pgcd;
}

}
