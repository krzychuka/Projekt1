package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.Obiekt;


@Transactional
@Repository("obiektDao")
public class ObiektDaoImpl implements ObiektDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addObiekt(Obiekt obiekt) {
		sessionFactory.getCurrentSession().saveOrUpdate(obiekt);
	}

	@SuppressWarnings("unchecked")
	public List<Obiekt> listaObiektow() {
		return (List<Obiekt>) sessionFactory.getCurrentSession().createCriteria(Obiekt.class).list();
	}

	public Obiekt getObiekt(Long obiektId) {
		return (Obiekt) sessionFactory.getCurrentSession().get(Obiekt.class, obiektId);
	}

	public void usunObiekt(Obiekt obiekt) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Obiekt WHERE obiektId = "+ obiekt.getObiektId()).executeUpdate();
	}

}
