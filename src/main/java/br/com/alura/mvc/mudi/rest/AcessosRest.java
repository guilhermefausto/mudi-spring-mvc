package br.com.alura.mvc.mudi.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.mvc.mudi.interceptor.InterceptadordeAcessos;
import br.com.alura.mvc.mudi.interceptor.InterceptadordeAcessos.Acesso;

@RestController
@RequestMapping("acessos")
public class AcessosRest {

	@GetMapping
	public List<Acesso> getAcessos(){
		return InterceptadordeAcessos.acessos;
	}
	
}
