package comp.Anudip;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher
{
	@Id
	private int  id;
	private String name;
	@OneToMany
	List<Course> list1=new ArrayList<Course>();
	
	public List<Course> getList1() {
		return list1;
	}
	public void setList1(List<Course> list1) {
		this.list1 = list1;
	}
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
	
}
