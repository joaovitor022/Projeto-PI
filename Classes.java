import java.util.*;

public class Classes{
Status stats = new Status();
Scanner input = new Scanner(System.in); 

public int confirmar(int escolha){
  
while(escolha != 1 && escolha != 2 && escolha != 3  && escolha != 4  && escolha != 5){
System.out.println("escolha inválida"); 
     System.out.println("1. Lutador");
     System.out.println("2. Mago");
     System.out.println("3. Ladino");
     System.out.println("4. Paladino");
     System.out.println("5. Mago de sangue");
     System.out.print("- ");
     escolha = input.nextInt();
} 
  return escolha;
}
  
public Status classe(int escolha){
  
if (escolha == 1){
  //LUTADOR
    //status
stats.setVida(100);
stats.setPoderDeAtaque(8);
stats.setMana(15);
stats.setDefesa(3);
stats.setEvasao(8);
stats.setChanceDeAcerto(5);
stats.setGastoDeMana(3);
  //habilidades
stats.setBasicATK(stats.getPoderDeAtaque());
stats.setSk1(10 + stats.getPoderDeAtaque());
stats.setSk2(15 + stats.getPoderDeAtaque());
stats.setSk3(20 + stats.getPoderDeAtaque());
   //nomes
stats.setNomeBasicATK("");
stats.setNomeSk1("");
stats.setNomeSk2("");
stats.setNomeSk3("");
}
  
  else if(escolha == 2){
    //MAGO
  stats.setVida(65);
  stats.setPoderDeAtaque(2);
  stats.setMana(30);
  stats.setDefesa(3);
  stats.setEvasao(2);
  stats.setChanceDeAcerto(9);
  stats.setGastoDeMana(3);
     //habilidades
  stats.setSk1(15 + stats.getPoderDeAtaque());
  stats.setSk2(20 + stats.getPoderDeAtaque());
  stats.setSk3(25 + stats.getPoderDeAtaque());
       //nomes
  stats.setNomeBasicATK("");
  stats.setNomeSk1("");
  stats.setNomeSk2("");
  stats.setNomeSk3("");
  }
    
    else if(escolha == 3){
      //LADINO
    stats.setVida(75);
    stats.setPoderDeAtaque(5);     
    stats.setMana(15);
    stats.setDefesa(4);
    stats.setEvasao(7);
    stats.setChanceDeAcerto(8);
    stats.setGastoDeMana(3);
       //habilidades
    stats.setSk1(30+ stats.getPoderDeAtaque());
    stats.setSk2(25 + stats.getEvasao());
    stats.setSk3(50 + stats.getPoderDeAtaque());
         //nomes
    stats.setNomeBasicATK("");
    stats.setNomeSk1("");
    stats.setNomeSk2("");
    stats.setNomeSk3("");
    }
      
      else if(escolha == 4){
        //PALADINO
      stats.setVida(85);
      stats.setPoderDeAtaque(7);
      stats.setMana(20);
      stats.setDefesa(6);
      stats.setEvasao(4);
      stats.setChanceDeAcerto(8);
      stats.setGastoDeMana(3);
        //habilidades
      stats.setSk1(7 + stats.getPoderDeAtaque() + stats.getDefesa());
      stats.setSk2(7 + stats.getPoderDeAtaque());
      stats.setSk3(  stats.getMana());
           //nomes
      stats.setNomeBasicATK("");
      stats.setNomeSk1("");
      stats.setNomeSk2("");
      stats.setNomeSk3("");
      }
        
        else if(escolha == 5){
          //MAGO DE SANGUE
        stats.setVida(60);
        stats.setPoderDeAtaque(3);
        stats.setMana(25);
        stats.setDefesa(4);
        stats.setEvasao(3);
        stats.setChanceDeAcerto(7);
        stats.setGastoDeMana(3);
          //habilidades
        stats.setSk1( stats.getPoderDeAtaque());
        stats.setSk2(  stats.getEvasao());
        stats.setSk3(50 + stats.getPoderDeAtaque());
          //nomes
        stats.setNomeBasicATK("");
        stats.setNomeSk1("");
        stats.setNomeSk2("");
        stats.setNomeSk3("");
        }
  
return stats;
 }    
}