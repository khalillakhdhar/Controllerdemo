package com.elitech.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.elitech.logique.Indice;

@RestController
@RequestMapping("imc")
public class IndiceController {
	
	@PostMapping()
	public String calculeImc(@RequestParam double poid,@RequestParam double taille)
	{
		Indice i=new Indice();
		return i.calculeImc(poid, taille);
	}

}
