package day3;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		        Student student = new Student();

		        student.setId(101);
		        student.setName("Chandru");
		        student.setAge(22);

		        System.out.println("Student ID: " + student.getId());
		        System.out.println("Student Name: " + student.getName());
		        System.out.println("Student Age: " + student.getAge());
		    }
		}

		class Student {
		    private int id;
		    private String name;
		    private int age;

		    public int getId() {
		        return id;
		    }

		    public void setId(int id) {
		        if (id > 0) {
		            this.id = id;
		        }
		    }

		    public String getName() {
		        return name;
		    }

		    public void setName(String name) {
		        if (name != null && !name.isEmpty()) {
		            this.name = name;
		        }
		    }

		    public int getAge() {
		        return age;
		    }

		    public void setAge(int age) {
		        if (age > 0) {
		            this.age = age;
		        }
		    }
		

	

}
