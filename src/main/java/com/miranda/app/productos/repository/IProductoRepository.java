package com.miranda.app.productos.repository;

import org.springframework.data.repository.CrudRepository;

import com.miranda.app.productos.entity.Producto;

public interface IProductoRepository extends CrudRepository<Producto, Long> {

}
