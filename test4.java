class Customer {
    int amount = 10000;
    synchronized void withdraw(int amount) {
        System.out.println("going to withdraw....");
        if (this.amount < amount) {
            System.out.println("Less balance: waiting for deposit...");
            try {
                wait();
            } catch (Exception e) {
            }
            this.amount -= amount;
            System.out.println("withraw complated...");
        }
}
        synchronized void deposit(int amount){
            System.out.println("going to deposit....");
            this.amount+=amount;
             System.out.println("deposit complated....");
             notify();
        }
    }

    class test4 {
        public static void main(String[] args) {
            final Customer c = new Customer();
            new Thread() {
                public void run() {
                    c.withdraw(15000);
                }
            }.start();
            new Thread() {
                public void run() {
                    c.deposit(10000);
                }
            }.start();
        }
    }