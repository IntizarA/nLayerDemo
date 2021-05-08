package nLayerDemo.dataAccess.abstracts;

import java.util.List;

import nLayerDemo.entities.concretes.Product;

public interface ProductDao {
void add(Product product);
void delete(Product product);
void update(Product product);
Product get();
List<Product> getAll();
}
