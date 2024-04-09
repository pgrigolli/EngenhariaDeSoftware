class Project{
//alo grigo
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

    public int validateAndWithdraw(int id, int amount){

        if(id == this.id){
            balance -= amount;
            return 1;
        }else{
            return 0;
        }

    }

    public int validateAndDeposit(int id, int amount){

        if(id == this.id){
            balance += amount;
            return 1;
        }else{
            return 0;
        }



    }




}