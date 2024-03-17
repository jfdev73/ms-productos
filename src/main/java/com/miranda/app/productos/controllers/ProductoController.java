package com.miranda.app.productos.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.miranda.app.productos.entity.Producto;
import com.miranda.app.productos.service.IProductoService;

@RestController
public class ProductoController {
	
	private IProductoService iProductoService;
	
	public ProductoController(IProductoService iProductoService) {
		this.iProductoService = iProductoService;
	}
	
	@GetMapping("/listar")
	public List<Producto> listar (){
		return iProductoService.findAll();
	}
	
	
	
	@GetMapping("/ver/{id}")
	public Producto detalle( @PathVariable Long id) {
		return iProductoService.findById(id);
	}

}
