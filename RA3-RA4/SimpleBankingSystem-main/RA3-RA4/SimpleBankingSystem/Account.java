package SimpleBankingSystem;
/**
*
* @author Flor Martinez
*/
public class Account {
	
	// propietats de la Clase Account
    private String name;
    private String account;
    private double balance;
    
    // constructor buit
	public Account() {
		super();
	}

	//constructor amb arguments
	public Account(String name, String account, double balance) {
		super();
		this.name = name;
		this.account = account;
		this.balance = balance;
	}

	//mètode per tornar el nom del titular del compte
	public String getName() {
		return name;
	}

	//mètode per actualizar el nom del titular del compte
	public void setName(String name) {
		this.name = name;
	}

	//mètode per tornar el numero de compte
	public String getAccount() {
		return account;
	}

	//mètode per tornar el saldo disponible del compte
	public double getBalance() {
		return balance;
	}
	
	/* màtode per ingressar quantitats al compte
	 * modifica el saldo
     */
    public void depositAmount(double amount) throws Exception
    {
        if (amount<0)
            throw new Exception("No es pot ingressar una quantitat negativa.");
        balance += amount;
    }
    
    /* màtode per treure quantitats del compte
	 * modifica el saldo
     */
    public void withdrawAmount(double amount) throws Exception
    {
    	if (amount < 0)
    		throw new Exception ("No es pot retirar una quantitat negativa.");
    	if (getBalance()< amount)
    		throw new Exception ("No hi ha suficient saldo");
    	balance -= amount;
    }
   
}
