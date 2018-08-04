/**
 * 
 */
package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author HimanshuArora
 *
 */
@Component
public class Alien {
	private int add;
	private String aName;
	private String tech;
	private Laptop laptop;
	
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Alien() {
		super();
		System.out.println("object created");
	}
	public int getAdd() {
		return add;
	}
	public void setAdd(int add) {
		this.add = add;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public void show() {
		System.out.println("show");
		laptop.compile();
	}

}
