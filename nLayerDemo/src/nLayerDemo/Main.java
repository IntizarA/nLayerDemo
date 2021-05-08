package nLayerDemo;

import nLayerDemo.business.abstracts.ProductService;
import nLayerDemo.business.concretes.ProductManager;
import nLayerDemo.core.jLoggerManagerAdapter;
import nLayerDemo.dataAccess.concretes.AbcProductDao;
import nLayerDemo.entities.concretes.Product;
import nLayerDemo.*;
public class Main {

	public static void main(String[] args) {
	ProductService productService=new ProductManager(new AbcProductDao(),new jLoggerManagerAdapter());
	Product product=new Product(1,2,"alma",200,300);
productService.add(product);

	}

}
