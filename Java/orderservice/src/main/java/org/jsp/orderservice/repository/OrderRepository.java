 package org.jsp.orderservice.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.jsp.orderservice.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class OrderRepository {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void processOrder(OrderEntity orderEntity)
	{
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(orderEntity);
	//		session.get(ProductEntity.class, orderEntity.getAltkey());
			transaction.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
