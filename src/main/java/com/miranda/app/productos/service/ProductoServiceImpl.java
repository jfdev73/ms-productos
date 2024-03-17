package com.miranda.app.productos.service;

import java.util.List;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miranda.app.productos.entity.Producto;
import com.miranda.app.productos.repository.IProductoRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ProductoServiceImpl  implements IProductoService{
	
	private final IProductoRepository productoRepository;
//	public ProductoServiceImpl(IProductoRepository productoRepository) {
//		this.productoRepository = productoRepository;
//	}

	@Transactional(readOnly = true)
	@Override
	public List<Producto> findAll() {
		return (List<Producto>) productoRepository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Producto findById(Long id) {
		
		return productoRepository.findById(id).orElse(null);
	}

}
