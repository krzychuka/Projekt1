package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dao.BudynekDaneDao;
import model.BudynekDane;

@Service("budynekDaneService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class BudynekDaneServiceImpl implements BudynekDaneService{
	
	@Autowired
	private BudynekDaneDao budynekDaneDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addBudynekDane(BudynekDane budynekDane) {
		budynekDaneDao.addBudynekDane(budynekDane);
	}

	public List<BudynekDane> listaBudynekDane() {
		return budynekDaneDao.listaBudynekDane();
	}

	public BudynekDane getBudynekDane(Long budynekDaneId) {
		return budynekDaneDao.getBudynekDane(budynekDaneId);
	}

	public void deleteBudynekDane(BudynekDane budynekDane) {
		budynekDaneDao.deleteBudynekDane(budynekDane);
	}
	
}
