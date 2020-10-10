package com.example.beans;

public class Value {

	private long id;
	private String quote;
	public Value(long id, String quote) {
		super();
		this.id = id;
		this.quote = quote;
	}
	public Value() {
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	@Override
	public String toString() {
		return "Value [id=" + id + ", quote=" + quote + "]";
	}
}
