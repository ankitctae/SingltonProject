package com.singlton;

public class Singlton {

	static int count = 0;

	public Singlton() throws Exception {
		if (count > 0)
			throw new Exception("Object can not be created second time");
		count++;
	}

	public void printCount() {
		System.out.println(count);
	}

	public Object readResolve() {
		return this;
	}

	public static void main(String[] args) throws Exception {

		Singlton s = new Singlton();
		s = new Singlton();

	}
}
