public class SmartTv {

    public boolean ligada = false;
    public int canal = 1;
    public int volume = 25;


   public void ligar(){
    ligada = true;
   }

   public void desligar(){
    ligada = false;
   }

   public void mudarCanal(int novoCanal){
    canal = novoCanal;
   }

   public void aumentarCanal(){
    canal++;
   }

    public void diminuirCanal(){
 canal--;
}

   public void aumentarVolume(){
    System.out.println("Aumentando volume+++++++++++++");
    volume++;
   }

   public void diminuirVolume(){
    System.out.println("Diminuindo Volume ------------");
    volume--;
   }
}
