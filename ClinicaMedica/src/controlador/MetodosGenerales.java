package controlador;

public class MetodosGenerales {
    
   public boolean isNumber(String parString){
       
       try {
           Double.parseDouble(parString);
           return true;
       } catch (NumberFormatException e) {
           return false;
       }
   }
   
   
   
}
