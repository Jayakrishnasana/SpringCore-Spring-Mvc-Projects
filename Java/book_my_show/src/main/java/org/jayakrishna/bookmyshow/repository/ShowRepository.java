package org.jayakrishna.bookmyshow.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jayakrishna.bookmyshow.DTO.ShowDTO;
import org.jayakrishna.bookmyshow.showentity.ShowEntity;
import org.jayakrishna.bookmyshow.util.MysqlConnectionProperties;

import com.ass.appservice.util.SessionFactoryUtil;

public class ShowRepository {
	
	public void saveOrUpdate(ShowEntity showEntity) {
		Configuration cfg = new Configuration();
		cfg.setProperties(MysqlConnectionProperties.getConnectionProperties());
		cfg.addAnnotatedClass(ShowEntity.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
//		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(showEntity);
		transaction.commit();
	}
	
	public ShowEntity findMovieById(long id) {

		Configuration cfg = new Configuration();
		cfg.setProperties(MysqlConnectionProperties.getConnectionProperties());
		cfg.addAnnotatedClass(ShowEntity.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
//		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		return session.get(ShowEntity.class, id);
	
	}
	
	public void updateMovieDetails(ShowDTO showDto) {
	ShowEntity showEntity = findMovieById(showDto.getAltkey());
	
	if(showEntity!=null) {
		showEntity.setMovieName(showDto.getMovieName());
		showEntity.setReleaseDate(showDto.getReleasedate());
		saveOrUpdate(showEntity);
	}
	}

}
