package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="db")
public class Db implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=55)
	private String name;
	@Column(length=255)
	private String fullName;
	@Column(length=255)
	private String dataType;
	@Column(length=255)
	private String genericUrl;
	@Column(length=255)
	private String urlSyntax;
	@Column(length=255)
	private String urlExample;
	@Column(length=255)
	private String urlPrefix;
	
	public Db(String name, String fullName,String dataType, 
			String genericUrl, String  urlSyntax, 
			String urlExample, String urlPrefix){
		super();
		this.name = name;
		this.fullName = fullName;
		this.dataType = dataType;
		this.genericUrl = genericUrl;
		this.urlSyntax = urlSyntax;
		this.urlExample = urlExample;
		this.urlPrefix = urlPrefix;		
		
	}
	public Db() {
	this("","","","","","","");
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

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getGenericUrl() {
		return genericUrl;
	}

	public void setGenericUrl(String genericUrl) {
		this.genericUrl = genericUrl;
	}

	public String getUrlSyntax() {
		return urlSyntax;
	}

	public void setUrlSyntax(String urlSyntax) {
		this.urlSyntax = urlSyntax;
	}

	public String getUrlExample() {
		return urlExample;
	}

	public void setUrlExample(String urlExample) {
		this.urlExample = urlExample;
	}

	public String getUrlPrefix() {
		return urlPrefix;
	}

	public void setUrlPrefix(String urlPrefix) {
		this.urlPrefix = urlPrefix;
	}

	@Override
	public String toString() {
		return "Db [id=" + id + ", name=" + name + ", fullName=" + fullName + ", dataType=" + dataType + ", genericUrl="
				+ genericUrl + ", urlSyntax=" + urlSyntax + ", urlExample=" + urlExample + ", urlPrefix=" + urlPrefix
				+ "]";
	}
}
