package org.ass.core.dao;

import org.ass.core.assosiation.types.AirHosters;
import org.ass.core.assosiation.types.Flight;
import org.ass.core.entity.Captian;
import org.ass.core.entity.Team;
import org.ass.core.entity.UserEntity;
import org.ass.core.util.ConnectionPropertiesUtil;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
// its is a singleton class

public class SessionFactoryUtil {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
			cfg.addAnnotatedClass(UserEntity.class);
			cfg.addAnnotatedClass(Team.class);
			cfg.addAnnotatedClass(Captian.class);
			cfg.addAnnotatedClass(Flight.class);
			cfg.addAnnotatedClass(AirHosters.class);
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;

	}

}
