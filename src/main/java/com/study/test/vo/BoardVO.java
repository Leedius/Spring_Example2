package com.study.test.vo;

public class BoardVO {
	private String title;
	private String content;
	private int age;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "BoardVO [title=" + title + ", content=" + content + ", age=" + age + "]";
	}
	
}
