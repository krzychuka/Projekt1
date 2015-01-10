package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.BudynekDane;

@Transactional
@Repository("budynekDaneDao")
public class BudynekDaoImpl implements BudynekDaneDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addBudynekDane(BudynekDane budynekDane) {
		sessionFactory.getCurrentSession().saveOrUpdate(budynekDane);	
	}

	@SuppressWarnings("unchecked")
	public List<BudynekDane> listaBudynekDane() {
		return (List<BudynekDane>) sessionFactory.getCurrentSession().createCriteria(BudynekDane.class).list();
	}

	@Override
	public BudynekDane getBudynekDane(Long budynekDaneId) {
		return (BudynekDane) sessionFactory.getCurrentSession().get(BudynekDane.class, budynekDaneId);
	}

	@Override
	public void deleteBudynekDane(BudynekDane budynekDane) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Obiekt WHERE obiektId = "+ budynekDane.getBudynekDaneId()).executeUpdate();
	}

}
