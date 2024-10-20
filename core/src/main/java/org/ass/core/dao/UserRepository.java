package org.ass.core.dao;

import org.ass.core.dto.UserDto;
import org.ass.core.entity.UserEntity;
import org.ass.core.util.ConnectionPropertiesUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserRepository {

	public void saveOrupdateuserDetails(UserEntity userEntity) {
		/*
		 * Configuration cfg = new Configuration();
		 * cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		 * cfg.addAnnotatedClass(UserEntity.class);// metadata extra peace of
		 * information SessionFactory sessionFactory = cfg.buildSessionFactory();
		 */
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(userEntity);
		transaction.commit();
	}

	public UserEntity findById(long id) {
		/*
		 * Configuration cfg = new Configuration();
		 * cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		 * cfg.addAnnotatedClass(UserEntity.class); SessionFactory sessionFactory =
		 * cfg.buildSessionFactory();
		 */
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		return session.get(UserEntity.class, id);

	}

	public void update(UserDto userDto) {
		UserEntity userEntity = findById(userDto.getAltKey());
		if (userEntity != null) {
			userEntity.setName(userDto.getName());
			userEntity.setCity(userDto.getCity());
			userEntity.setCountry(userDto.getCountry());
			userEntity.setPinCode(userDto.getPinCode());
			saveOrupdateuserDetails(userEntity);
			/*
			 * Configuration configuration = new Configuration();
			 * configuration.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
			 * configuration.addAnnotatedClass(UserEntity.class); SessionFactory
			 * sessionFactory = configuration.buildSessionFactory(); Session session =
			 * sessionFactory.openSession(); Transaction transaction =
			 * session.beginTransaction(); session.merge(userEntity); transaction.commit();
			 */
		}
	}

	private void delete() {
		// delete db logic
	}
}