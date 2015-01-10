package dao;

import java.util.List;

import model.BudynekDane;

public interface BudynekDaneDao {
	
	public void addBudynekDane (BudynekDane budynekDane);
	public List<BudynekDane> listaBudynekDane();
	public BudynekDane getBudynekDane(Long budynekDaneId);
	public void deleteBudynekDane(BudynekDane budynekDane);

}
