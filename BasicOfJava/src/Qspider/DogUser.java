package Qspider;

 class Animal {

	void eating() {
		System.out.println("Animal eats food");
	}
	
	void makeSound() {
		System.out.println("Animals make souds");
	}
 }
	class Dog  extends Animal{
		protected void eating() {
			System.out.println("Dogs eats bones");
		}

		void makeSound() {
			System.out.println("Dogs is barking");
		}
}
	
public  class DogUser{
		public static void main(String[] args) {
			Dog k = new Dog();
			k.eating();
			k.makeSound();
		}
	}

 
 
 
 
 
 
 
 
 