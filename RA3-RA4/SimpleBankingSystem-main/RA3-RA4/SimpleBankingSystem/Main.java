package SimpleBankingSystem;
/**
*
* @author Flor Martinez
*/
public class Main {
	 public static void main(String[] args) {
		Account myAccount;
	        
	    myAccount = new Account("Flor Martinez", "1000-1234-56-123456789", 2500);
	     
	    try {
	    	myAccount.withdrawAmount(2300);
	    } catch(Exception e){
        	System.err.println(e.getMessage());
            System.out.println("Error al retirar");
	    }
	     
	    try {
	    	 System.out.println("Ingrés al compte");
	    	 myAccount.depositAmount(1695);
	    } catch(Exception e){
	    	 System.err.println(e.getMessage());
	         System.out.println("Error en l'ingrés");
	    }

	     System.out.println("El saldo actual es " + myAccount.getBalance());   
	 }
}
