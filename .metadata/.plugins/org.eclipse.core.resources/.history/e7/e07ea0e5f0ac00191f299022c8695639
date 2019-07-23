package school;

public abstract class Person {
	
	// 1. 맴버변수
	

	private String id;
	private String name;
	private int age;
	
	// 2. 생성자
	public Person () {
	}
	
	public Person (String id) {
		this.id = id;
	}
	
	public Person (String id, String name) {
		this(id); 
	    this.name = name;
	}
		
	public Person (String id, String name, int age) {
		this(id, name); 
		this.age = age;
		
	}
	
	// 3. 메소드

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age =age;
	}
	
	public String toString() {
		return String.format("%s, %s, %d",id, name, age);
	}
	
	public void print() {
		System.out.println(toString());
		
	}
	
}
