 public class BankAccount { 
private long balance;
 public BankAccount(long balance) {
 this.balance = balance;
 }
 static void transferFrom(BankAccount source, 
BankAccount dest, long amount) {
 source.balance -= amount;
 dest.balance += amount;
 }
 public long balance() {
 return balance;
 }
 }
class Thread_Bank {
 public static void main(String[] args) 
throws InterruptedException {
 BankAccount a = new BankAccount(100); 
BankAccount b = new BankAccount(100); 
Thread aThread = new Thread(() -> {
 for (int i = 0; i < 10000; i++) 
BankAccount.transferFrom(b, a,
 100);
 });
 Thread bThread = new Thread(() -> { 
for (int i = 0; i < 10000; i++)
 BankAccount.transferFrom(a, b,
 100);
 });
 aThread.start(); 
bThread.start(); 
aThread.join(); 
bThread.join();
 System.out.println(a.balance() ); 
System.out.println(b.balance());
 }
 }