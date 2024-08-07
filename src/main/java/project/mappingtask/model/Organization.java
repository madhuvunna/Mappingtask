package project.mappingtask.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="organization2")
public class Organization {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private String Id;
	
	@Column(name="title")
	private String Title;
	
	@ManyToMany
	@JoinTable(name="org_stu",joinColumns = @JoinColumn(name="org_id",referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name="organization2_id ",referencedColumnName = "id"))
	
	private Collection<Student> stu;

	public Organization() {
		
	}

	public Organization(String id, String title, Collection<Student> stu) {
		super();
		Id = id;
		Title = title;
		this.stu = stu;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Collection<Student> getStu() {
		return stu;
	}

	public void setStu(Collection<Student> stu) {
		this.stu = stu;
	}

	@Override
	public String toString() {
		return "Organization [Id=" + Id + ", Title=" + Title + ", stu=" + stu + "]";
	}
	
	

}
