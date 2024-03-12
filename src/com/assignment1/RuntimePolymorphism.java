package com.assignment1;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.makeSound();
		cat.makeSound();

	}

}

class Animal
{
	public void makeSound()
	{
		System.out.println("Animal makes Sound");
	}
}

class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("Dog barks");
	}
}

class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("Cat meows");
	}
}