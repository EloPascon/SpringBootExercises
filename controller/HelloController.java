package com.helloword.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	    @GetMapping
        public String HelloWord () {
        	
        	return "Hello word";
        	
	    }
	    
	    @GetMapping("/bsm")  
        	public String bsm() {
	    	
	    	return "<b /> Comunicação <b> <b /> Orientação ao detalhe <b> <b /> Orientação ao Futuro <b> <b /> Trabalho em grupo <b>"
	    			+ "<b /> Persistencia <b> <b /> Proatividade <b> <b /> Gestão de tempo <b> <b /> Responsabilidade pessoal <b>"; 
        
	    }

	    
	    @GetMapping("/objetivo")  
    	public String objetivo() {
    	
    	return "Meus objetivos de aprendizagem são :"
    			+ "compreender todos os conceitos de MySQL"
    			+"compreender todos os conceitos Spring boot ";
    		
    
    
}
}