package ex_OCP;

public abstract class Animal {
	    abstract void speak();
	}

	class Cat extends Animal { // 상속
	    void speak() {
	        System.out.println("냐옹");
	    }
	}

	class Dog extends Animal { // 상속
	    void speak() {
	        System.out.println("멍멍");
	    }
	}

	class HelloAnimal {
	    void hello(Animal animal) {
	        animal.speak();
	    }
	}


