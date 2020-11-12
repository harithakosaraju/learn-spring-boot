package javaquickstart;

public final class Contact {
	private final String name;
	private final String mobile;
	
	public Contact(String name, String mobile) {
		this.name = name;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}
	
	@Override
	public String toString() {
		return this.name+this.mobile;
	}
	public static void main(String args[]) {
		Contact c1= new Contact("Haritha","9084208739");
		System.out.println(c1);
		c1 = new Contact("Venkat","9084208739");
		System.out.println(c1);
		
	}

}
