
public class TestThrow {
   static void validate(int age){  
     if(age<18) 
      try{
      throw new ArithmeticException("not valid");  
      }catch(Exception e){
      System.out.println("welcome to vote");  
   }  
   }
   public static void main(String args[]){  
      validate(13);  
      System.out.println("rest of the code...");  
  }
    
}
