package com.ecommerce.Ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.Ecommerce.model.Producto;
@Service
public interface ProductoService {
	public Producto save( Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);

}