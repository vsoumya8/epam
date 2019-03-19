/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package house;

/**
 *
 * @author Soumya
 */
public class Construction_cost {
    /*
    standard can be (1,2,3) for (standard, above standard,high standard) respectively.
    area must be in terms of square feets
    automate accepts boolean values (true,false) for automation (required, not required) respectively.
    */
  private final int standard;
  private final int area;
  private final boolean automate;

  //this constructor initialize the values of standard,area and automate.
  Construction_cost(Standard standard,int area,boolean automate){

    this.standard=standard.getValue();
    this.area=area;
    this.automate=automate;

  }
  /*
    this method cost() calculates the cost according to the given requirements and returns it.
  */
  public long cost(){

    int c=costPerSquareFeet();
    // if the requirements doesnt meet the available service requirements the cost is not calculated and returns -1
    if(c==-1){

      System.out.println("Sorry! Service not available");
      return -1;

    }
    //returns the cost
    return area*c;

  }
  /*
  this method costPerSquareFeet() returns the cost per one square feet as per the requirements
  (standard,area,automate)
  */
  public int costPerSquareFeet(){

    if(standard==1 && !automate){
      return 1200;
    }
    else if(standard==2 && !automate){
      return 1500;
    }
    else if(standard==3 && !automate){
      return 1800;
    }
    else if(standard==3 && automate){
      return 2500;
    }
    else{
      return -1;
    }
  }
}
/*
This class standard is used to assign a value to the standard levels(standard,above standard and hight standard) as (1,2 and 3)
*/
class Standard{
  private int standard;
  Standard(String str){
    if(str.equalsIgnoreCase("standard")){
      standard=1;
    }
    else if(str.equalsIgnoreCase("above standard")){
      standard=2;
    }
    else if(str.equalsIgnoreCase("high standard")){
      standard=3;
    }
  }
  public int getValue(){
    return standard;
  }
}
