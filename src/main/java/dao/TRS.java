package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.TBL;

public class TRS {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	
	EntityManager em=emf.createEntityManager();
	
	EntityTransaction et=em.getTransaction();
	
	TBL t=new TBL();
	
	public void insert(String name,String pass,long phno,byte[] vid)
	{
//		t.setId(id);
		t.setName(name);
		t.setPass(pass);
		t.setPhno(phno);
		t.setVid(vid);
		
		et.begin();
		em.persist(t);
		et.commit();
		
		System.out.println("data inserted");
		
	}
	
	public void update(int id,String name)
	{
		TBL p=em.find(TBL.class, id);
		
		et.begin();
		p.setName(name);
		em.persist(p);
		et.commit();
		
		System.out.println("name updted");
		
		
	}
	
	public void fetch(int id){
		TBL f=em.find(TBL.class, id);
		System.out.println("name:- "+f.getName());
		System.out.println("phoneno:- "+f.getPhno());
		
		System.out.println("information from database using id");
	}
	
	public void remove(int id){
		TBL r=em.find(TBL.class, id);
		
		System.out.println("onr id data removed");
	}

}
