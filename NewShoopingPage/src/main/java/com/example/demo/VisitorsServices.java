package com.example.demo;
import java.util.Iterator;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class VisitorsServices {
	
	@Autowired
	private VisitorsDao dao;

	public VisitorsDao getDao() {
		return dao;
	}

	public void setDao(VisitorsDao dao) {
		this.dao = dao;
	}
	
	public void saveData(Visitors c) {	getDao().save(c);}
	
	public List<Visitors> checkUser(String name,String pass){	return getDao().CheckUser(name, pass);	}
	
	public List<Visitors> checkVID(Visitors d) {	return getDao().checkVID(d);	}
	
	public void updateFlag(int a,String name,String pass) { 
		
		List<Visitors> c=getDao().CheckUser(name, pass);  Iterator<Visitors> itr=c.iterator();
			
		Visitors cd=itr.next();	cd.setFlag(a);	getDao().save(cd); }

}
