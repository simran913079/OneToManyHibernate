package comp.Anudip;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course
{
	@Id

	private int cid;
	private String coursename;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
}
