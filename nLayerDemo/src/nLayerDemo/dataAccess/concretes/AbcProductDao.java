package nLayerDemo.dataAccess.concretes;

import java.util.List;

import nLayerDemo.dataAccess.abstracts.ProductDao;
import nLayerDemo.entities.concretes.Product;

public class AbcProductDao  implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println("Abc ile elave edildi"+product.getName());
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
