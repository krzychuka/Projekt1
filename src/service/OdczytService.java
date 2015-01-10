package service;

import java.util.List;

import model.Odczyt;

public interface OdczytService {

	public void addOdczyt(Odczyt odczyt);

	public List<Odczyt> odczytList();
	
	public Odczyt getOdczyt(Long odczytId);
	
	public void deleteOdczyt(Odczyt odczyt);
}
