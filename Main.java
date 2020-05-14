import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    //Istanzio l'oggetto scanner per la lettura in input
    Scanner sc = new Scanner (System.in);
    //Numero di richiami
    System.out.print("\nInserisci quante volte richiamare i nipotini:\n[>] ");
    int n = sc.nextInt();
    System.out.print("Oggi si mangia pizza? (y/n):\n[>] ");
    char ctrl = sc.next().charAt(0);
    //Chiamare una volta in meno se si mangia pizza
    if(ctrl=='y'||ctrl=='Y')
    {
      n=n-1;
    }
    //Istanzio i 3 thread passando come parametri nome e numeri di richiami
    //e utilizzo il metodo start() che richiama il metodo run()
    new Thread(new Nipotino("Qui", n)).start();
    new Thread(new Nipotino("Quo", n)).start();
    new Thread(new Nipotino("Qua", n)).start();
  }
}