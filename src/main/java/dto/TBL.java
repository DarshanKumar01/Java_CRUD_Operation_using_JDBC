package dto;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;


@Entity(name="a1")
public class TBL {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable=false,length=50)
	private String name;
	
	@Column(unique=false)
	private String pass;
	private long phno;
	
	@Lob
	private byte[] vid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public byte[] getVid() {
		return vid;
	}

	public void setVid(byte[] vid) {
		this.vid = vid;
	}

	@Override
	public String toString() {
		return "TBL [id=" + id + ", name=" + name + ", pass=" + pass + ", phno=" + phno + ", vid="
				+ Arrays.toString(vid) + "]";
	}
	
	  

	
	
}
