/**
 * create a car and a getGas method
 */
public class Car {

  private int gas = 10;
  // private/public/protected
  // private only accessible in car class
  //public accessible anywhere
  // protected accessible by children

  public int getGas() {
    return this.gas;
  }

  public void setGas(int gas) {
    this.gas = gas;
  }

  public void decreaseGas(){
    this.gas --;
  }
  
  public void increaseGas(){
    this.gas ++;
  }

}