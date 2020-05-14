public class Nipotino implements Runnable
{
  //Attributi
  private String nome;
  private int volte;
  //Costruttore
  public Nipotino(String nome, int volte)
  {
    this.nome = nome;
    this.volte = volte;
  }
  //Metodo run() che viene invocato dal main con il metodo start()
  public void run()
  {
    for(int k=0; k<volte; k++)
    {
      //Stampo ad ogni ciclo il numero del richiamo e il nome del nipotino
      System.out.println((k+1) + "* richiamo per " + nome);
    }
  }
}