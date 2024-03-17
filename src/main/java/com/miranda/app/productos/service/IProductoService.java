package com.miranda.app.productos.service;

import java.util.List;

import com.miranda.app.productos.entity.Producto;

public interface IProductoService {
	
	 List<Producto> findAll();
	 Producto findById(Long id);

}
