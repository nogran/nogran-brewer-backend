package com.nogran.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nogran.brewer.model.Cerveja;

@Controller
public class CervejasController {
	
	@RequestMapping("/cervejas/novo")
	public String novo() {
		return "cerveja/CadastroCerveja";
	}

	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes ) {
		if (result.hasErrors()) {
			model.addAttribute("mensagem", "Erro no formulario!");
			return "cerveja/CadastroCerveja";
		}
		
		System.out.println(">>> sku: " + cerveja.getSku());
		System.out.println(">>> nome: " + cerveja.getNome());
		System.out.println(">>> descricao: " + cerveja.getDescricao());
		System.out.println(">>> quantidade: " + cerveja.getQuantidade());
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
		return "redirect:/cervejas/novo";
		
	}
}
