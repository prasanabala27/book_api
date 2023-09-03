package com.bala.bookstoreapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
  	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sno;
	private String name;
	@Column(name = "description")
	private String desc;
	
	
	public Book() {
		
	}
	



	



	
	
	public Book(Integer id, Integer sno, String name, String desc) {
		super();
		this.id = id;
		this.sno = sno;
		this.name = name;
		this.desc = desc;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	 public Integer getSno() {
			return sno;
		}
		public void setSno(Integer sno) {
			this.sno = sno;
		}
	
}
