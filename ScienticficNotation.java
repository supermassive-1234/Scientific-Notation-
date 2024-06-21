package Projects;
import java.net.URI;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.awt.Desktop;

//free to copy nothing matters
public class ScienticficNotation {
//main method to display console
public static void main(String[] args) {
  //For input
  Scanner scanner = new Scanner(System.in);
  String input; 
  //description
  System.out.println("This programme created by Sonja Lang and the purpose of this programme is to convert a non-negative integer into Scientific Notation.");
  //input
  System.out.println("Enter the value: \nValue must be non-negative and above 1");
  input = scanner.nextLine();
  //Class declarartion
  Compute Zeta = new Compute(input);
  //Exception handling
  try{ 
   Zeta.calculateNumbers();
  }catch(Exception e){ 
  if(Integer.parseInt(input)<=0){
    System.out.println("Negative Numbers and 0 aren't valid");
    e.getMessage();
  }else{
    System.err.println("Invalid Input.You must enter a decimal or an positive integer");
    e.getMessage();
  }
  }
  //for additional information
  try{
  //stop the programme for 5secs to prevent displaying other info
  Thread.sleep(5000);
  //for other information
  System.out.println("\nNot too much interesting?\nNot understanding what this thing does\nWell,We are here and Suggest you to enter \"MORE\" for more information about this topic\nOR enter \"EXIT\" to exit");
  //asking user to skip or find more info
  String helpOrExit = scanner.next().toUpperCase();
  //switch
  switch (helpOrExit.toUpperCase()) {
  case "MORE":
    Zeta.info();
    break;
  case "EXIT":
    System.out.println("Exited successfully.Thanks for using our programme");
  break;
  default:
    System.out.println("Exited successfully.Thanks for using our programme");
  break;
  }
  }catch(Exception e){
    //Closing the scanner
    scanner.close();
    System.out.println("Exited successfully.Thanks for using our programme");  
  }
  }
  }
  //Common Structure for Abstraction
  abstract class Structure {
   //to calculate positive integers
   public abstract void calculateNumbers();  
  }
  //Interface
  interface StructureWorks {
    //to convey information
    public abstract void info();
  }
//OOP concepts covered via this code
//for calculating
class Compute extends Structure implements StructureWorks{
  //Encapsulation 
  private String[] inputArray,arrayForCharactersBeforeDecimalPoints;
  private double inputAsInteger,division,toPowerOf,inputAsDouble;
  private String input,UniformResourceLocator;
  private int exponenet;
   DecimalFormat decimalFormat = new DecimalFormat("##.#");
  //Constructor
  Compute(String input){
   this.input = input;
  }
  //Overriding abstract methods
  @Override
  public void calculateNumbers() {
  //for numbers between 0 and 1
  if(Double.parseDouble(input)<1){
    //converting to double
    inputAsDouble = Double.parseDouble(input);
    //for counting 
    int count = 0;
  while(inputAsDouble<1.0){
    //multiplying by 10
    inputAsDouble*=10;
    //increases the count
    count++;
  }
    System.out.println(decimalFormat.format(inputAsDouble)+" * "+10+" ^ -"+count);
  //for decimals greater than 1
  }else if(input.contains(".")) {
    //create an array spliting into two characters by '.'
    inputArray = input.split("\\.");
    String regex = inputArray[0];
    //create an array splitting each character into seperate one
    arrayForCharactersBeforeDecimalPoints = regex.split("");
    //for exponenent
    exponenet = arrayForCharactersBeforeDecimalPoints.length-1;
    inputAsInteger = Double.parseDouble(input);
    toPowerOf = (int)Math.pow(10, exponenet);
    division = (double)inputAsInteger/(double)toPowerOf;
    System.out.println("When written as a scientific notation:");
    System.out.printf("%.20f",division);
    System.out.print(" * "+10+" ^ "+exponenet);
  //for natural positive ordinary integers
  }else{
    exponenet = input.length()-1;
    inputAsInteger = Double.parseDouble(input);
    toPowerOf = (int)Math.pow(10, exponenet);
    division = (double)inputAsInteger/(double)toPowerOf;
    System.out.println("When written as a scientific notation:");
    System.out.printf("%.5f",division);
    System.out.print(" * "+10+" ^ "+exponenet);
  }
  }
  @Override
  public void info(){
  //Error-handling for try-catch for package URI
  try{
    //Wikipedia reference
    UniformResourceLocator = "https://en.wikipedia.org/wiki/Scientific_notation";
    URI link = new URI(UniformResourceLocator);
  if(Desktop.isDesktopSupported()){
    Desktop desktop = Desktop.getDesktop();
    desktop.browse(link);
  }else{
    System.out.println("Your Browser doesn't support to this!");
  }
  }catch(Exception e){
    e.printStackTrace();
  }
  }
  }
//total lines of codes(including comments and space):139