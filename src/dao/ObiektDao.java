package dao;

import java.util.List;

import model.Obiekt;

public interface ObiektDao {
	
	public void addObiekt(Obiekt obiekt);
	public List<Obiekt> listaObiektow();
	public Obiekt getObiekt(Long obiektId);
	public void usunObiekt(Obiekt obiekt);

}
