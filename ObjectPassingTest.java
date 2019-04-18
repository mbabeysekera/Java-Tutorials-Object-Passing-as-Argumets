/*
 * Author: @ BUDDHIKA ABEYSEKERA
 * 
 * This tutorial is to give a brief introduction about JAVA object passing techniques.
 * In Java you can even pass an object as an argument to a method.
 * This tutorial will helps you to understand it properly.
 * 
 * Check out me on: LinkedIn: https://www.linkedin.com/in/babey/ 
 * 					GitHub: https://github.com/mbabeysekera/
 */

public class ObjectPassingTest {

	public static void main(String[] args) {
		/*
		 * Here at the beginning Input method is called and then the Display class object is 
		 * used to change the object
		 */
		Input startStr = new Input("Hi Hello ...");
		Display changeStr = new Display();
		//The following code will access the Input class object but it is not going to recreate
		//a new object. Instead it just access it and will do the necessary process.
		changeStr.strChanger(startStr);
		//This will change the String which was set by the Input Object constructor.
	}

}
//Let's create two classes as Display class and Input Class
class Input {
	//This will give the output as exact as you set in the constructor.
	private String inputString = new String();
	Input(String str) {
		inputString = str;
		System.out.println(inputString);
	}
	//This method is used to change the string through Display class because 
	//Default constructor cannot be called again.
	public String setInputAgain(String changeStr) {
		inputString = changeStr;
		return inputString;
	}
}
//Here you can pass the Input Objects into Display Class to change the default string given at 
//the beginning.
class Display {
	public void strChanger(Input strObj) {
		System.out.println(strObj.setInputAgain("INPUT CHANGED BY DISPLAY CLASS"));
	}
}