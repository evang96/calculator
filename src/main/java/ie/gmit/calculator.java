//Evan Garvey
//SoftwareEngW/Test
package ie.gmit;

public class calculator {
    private int firstNum;
    private int secondNum;

    public calculator() {
        this.firstNum = 0;
        this.secondNum = 0;
    }

    public calculator(int firstNum, int secondNum) { //Constructor
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int add(int num1, int num2)
    {
      int result = num1 + num2;
      return result;
    }

}
