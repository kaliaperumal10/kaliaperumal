package com.example.demo;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class ClientServices {
	
	@Autowired
	private ClientDao dao;
	public ClientDao getDao() {
		return dao;
	}
	public void setDao(ClientDao dao) {
		this.dao = dao;
	}
	
	public void saveData(Client c) {
		
		getDao().save(c);
		
	}
	
	public List<Client> checkUser(String name,String pass){
		
		return getDao().CheckUser(name, pass);
		
	}
	
	public List<Client> checkCID(Client d) {
		
		return getDao().checkCID(d);
		
	}
}
 






