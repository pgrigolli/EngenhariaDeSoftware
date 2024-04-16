class Project{
public static void main(String args[]){
}


}

class Account{

    private int id;
    private int balance;

    public Account(Integer id, Integer balance) {
        this.id = id;
        this.balance = balance;
    }


    public boolean validate(int id){
        if (id == this.id){
            return true;
        }return false;
    }

    public int Withdraw(int id, int amount){

        if(validate(id)){
            balance -= amount;
            return 1;
        }else{
            return 0;
        }

    }

    public int Deposit(int id, int amount){

        if(validate(id)){
            balance += amount;
            return 1;
        }else{
            return 0;
        }


    }




}