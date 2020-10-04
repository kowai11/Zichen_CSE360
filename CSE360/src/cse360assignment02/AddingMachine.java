package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;
  
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  history = history + " + " + Integer.toString(value);
  }

  public void subtract (int value) {
	  total = total - value;
	  history = history + " - " + Integer.toString(value);
  }

  public String toString () {
	  
    return "0" + history;
  }

  public void clear() {
	  total = 0;
	  history = "";
  }
}