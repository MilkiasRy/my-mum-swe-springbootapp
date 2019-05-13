package edu.mum.cs.cs425.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.model.Product;
import edu.mum.cs.cs425.repository.IProductRepository;
import edu.mum.cs.cs425.service.IProductService;



@Service("productService")
public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	/*@Override
	public Product findOne(Long id) {
		return productRepository.findOne(id);
	}*/

	@Override
	public void delete(Long id) {
		productRepository.deleteById(id);
	}

	@Override
	public Product findOne(Long id) {
		return productRepository.getOne(id);
	}

}
