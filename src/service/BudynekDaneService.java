package service;

import java.util.List;

import model.BudynekDane;

public interface BudynekDaneService {
	
	public void addBudynekDane (BudynekDane budynekDane);
	public List<BudynekDane> listaBudynekDane();
	public BudynekDane getBudynekDane(Long budynekDaneId);
	public void deleteBudynekDane(BudynekDane budynekDane);

}
