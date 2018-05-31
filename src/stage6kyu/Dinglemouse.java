package stage6kyu;

public class Dinglemouse {
	
	static String priority;
	String name;
	int age;
	char sex;

	public Dinglemouse() {
		priority = "";
	}

	public Dinglemouse setAge(int age) {
		this.age = age;
		if(!priority.contains("a"))
			priority += "a";
		return this;
	}

	public Dinglemouse setSex(char sex) {
		this.sex = sex;
		if(!priority.contains("s"))
			priority += "s";
		return this;
	}

	public Dinglemouse setName(String name) {
		this.name = name;
		if(!priority.contains("n"))
			priority += "n";
		return this;
	}

	public String hello() {
		
		String hello = "Hello.";
		
		for(int i = 0; i < priority.length(); i++) {
			if (priority.charAt(i) == 'a')
				hello += " I am " + age + ".";
			if (priority.charAt(i) == 'n')
				hello += " My name is " + name + ".";
			if (priority.charAt(i) == 's') {
				if (sex == 'M')
					hello += " I am male.";
				else
					hello += " I am female.";
			}
		}
		return hello;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dinglemouse dm = new Dinglemouse().setName("Max").setAge(27).setName("Bob").setSex('M');
		
		System.out.println(dm.hello());
	}

}
