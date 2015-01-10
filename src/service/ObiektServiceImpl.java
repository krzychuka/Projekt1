package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dao.ObiektDao;
import model.Obiekt;

@Service("obiektService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ObiektServiceImpl implements ObiektService{
	
	@Autowired
	private ObiektDao obiektDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addObiekt(Obiekt obiekt) {
		obiektDao.addObiekt(obiekt);	
	}


	public List<Obiekt> listaObiektow() {
		return obiektDao.listaObiektow();
	}

	public Obiekt getObiekt(Long obiektId) {
		return obiektDao.getObiekt(obiektId);
	}

	public void usunObiekt(Obiekt obiekt) {
		obiektDao.usunObiekt(obiekt);	
	}

}
