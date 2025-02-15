package org.jsp.productservice.repository;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.jsp.productservice.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ProductRepositoryImp implements ProductRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	

	@Override
	public void saveProduct(ProductEntity productEntity) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(productEntity);
			transaction.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public ProductEntity findProductById(Long id) {
		ProductEntity productEntity=null;
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			productEntity= session.get(ProductEntity.class, id);
			
			
			return productEntity;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<ProductEntity> findAllProduct() {
		List<ProductEntity> entity=null;
		try {
			
//			String sqlQuery=" from RegisterEntiy";
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			entity= session.createQuery("from ProductEntity").list();;
			transaction.commit();
			
		return entity;	
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<ProductEntity> findProductQuantityById(Long id) {
		try {
			String hqlquery="select quantity from ProductEntity where id=:n";
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Query query = session.createQuery(hqlquery);
			query.setParameter("n", id);
			return query.getResultList();
				
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public void deleteProductById(Long id) {
		try {
//			String sqlquery="delete from ProductEntity where id=:n";
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			ProductEntity p = session.get(ProductEntity.class, id);
			session.remove(p);
			transaction.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public List<ProductEntity> findProductByName(String name) {
		try {
			String hqlquery="  from ProductEntity where name= :n";
			Session session = sessionFactory.openSession();
			Transaction beginTransaction = session.beginTransaction();
			Query query = session.createQuery(hqlquery);
			query.setParameter("n", name);
			return query.getResultList();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List<ProductEntity> findAllProductSortByName() {
		try {
			String hqlquery="from ProductEntity order by name asc";
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Query query = session.createQuery(hqlquery);
			return query.getResultList();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public Double findProductPriceByProductId(long productId) {
		try {
			StringBuilder builder = new StringBuilder();
			builder.append("select price from ProductEntity where altkey=:n");
			
			Session session = sessionFactory.openSession();
			Query query = session.createQuery(builder.toString());
			query.setParameter("n", productId);
			return (Double) query.uniqueResult();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
}
