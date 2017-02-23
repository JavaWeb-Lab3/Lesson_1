package br.ucb.classes;

public class Person {

	private String name;
	private int age;
	private char sex;

	public Person(String name){
		switch(name){
		case "Ana": {
				this.name = "Ana";
				this.age = 18;
				this.sex = 'F';
			} break;
		case "Beatriz":{
				this.name = "Beatriz";
				this.age = 19;
				this.sex = 'F';
			} break;
		case "Carol": {
				this.name = "Carol";
				this.age = 22;
				this.sex = 'F';
			}
		}
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
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

}
