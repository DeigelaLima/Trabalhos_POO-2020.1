package parquinho;

public class Kid {
 
		private String name;
		private int age;
		
		public Kid(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		@Override
		public String toString() {
			return this.name + ":" + this.age;
		}

		String getName() {
			return name;
		}

		int getAge() {
			return age;
		}
		
}