package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="hat")
public class Hat implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=20)
	private String name;
	@Column(length=20)
	private String color;
	@Column(length=20)
	private String size;
	@Column(length=20)
	private String description;
	
	public Hat(String name, String color,String size, 
			String description){
		super();
		this.name = name;
		this.color = color;
		this.size = size;
		this.description = description;
		
	}
	
	public Hat(){
		this("", "", "", "");
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Hat [id=" + id + ", name=" + name + ", color=" + color + ", size=" + size + ", description="
				+ description + "]";
	}
	
}
