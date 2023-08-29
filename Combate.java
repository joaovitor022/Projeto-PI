import java.util.*;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Combate{
  
public Status batalha(int[] inmg1, int[] inmg2, int[] inmg3, Status stats, int[] array, HashMap<String, Integer> pocoes, String armaEquipada, HashMap<String, Armas> armas, Armas arma){
Scanner input = new Scanner(System.in);
Random rnd = new Random();
Inimigos inimigos = new Inimigos();
Itens mochila = new Itens();
int turno = 1;

int[] inmgsDefesa = {inmg1[2], inmg2[2], inmg3[2]};  
int[] inmgsVida = {inmg1[0], inmg2[0], inmg3[0]};
  
Armas Object = armas.get(armaEquipada);
int danoBonus = Object.getaTKBonus();
  
boolean acerto;
int atk = 0;
int escolha = -1;
  
while(inmgsVida[0] > 0 || inmgsVida[1] > 0 || inmgsVida[2] > 0 && stats.getVida() > 0){
limparTela();
System.out.println("0.desistir do combate");
System.out.println("1.usar item");
System.out.println("2.visualizar items");
System.out.println("3.atacar");
System.out.print("- ");
escolha = input.nextInt();
  limparTela();

  
 if(escolha == 0){
  
  return stats;
  }
  else if(escolha == 1){
   stats = mochila.usarPocao(pocoes, stats, array);
   
   }
   else if(escolha == 2){
   mochila.exibir(pocoes);
     
    }
    else if(escolha == 3){
         
       while(escolha != 0 && stats.getVida() > 0){
         int validMana = 1;
         while(validMana == 1){
         System.out.println();
         System.out.println("turno: "+ turno);
      System.out.println();
       
       System.out.println("0.voltar");
       System.out.println("1.ataque básico");
       System.out.println("2.skill 1");
       System.out.println("3.skill 2");
       System.out.println("4.skill 3");
         System.out.println();
         System.out.println("Sua vida: "+ stats.getVida());
         if(stats.getMana() >= 0){
         System.out.println("Sua Mana: "+ stats.getMana());
         }
         else{
         System.out.println("Sua Mana: "+ 0);  
         }
         System.out.println();
         if (inmgsVida[0] > 0){
         System.out.println("vida do inimigo 1 "+ inmgsVida[0]);
         }
          if (inmgsVida[1] > 0){
         System.out.println("vida do inimigo 2 "+ inmgsVida[1]);
         }
          if (inmgsVida[2] > 0){
         System.out.println("vida do inimigo 3 "+ inmgsVida[2]);
         }
         
         if(escolha != 0){
         System.out.println();
         System.out.println("informe seu ataque: ");
         System.out.print("- ");
         escolha = input.nextInt();
         if(escolha != 0){
         System.out.println("escolha o inimigo que deseja atacar: ");
         System.out.print("- ");
         atk = input.nextInt() - 1;
         atk = inimigos.verificar(atk, inmgsVida);
         }
         }           


         int manaAtual = stats.getMana();
         
           if(escolha == 2){
          stats.setMana(stats.getMana() - stats.getGastoDeMana());
           }
           else if(escolha == 3){
           stats.setMana(stats.getMana() - stats.getGastoDeMana() * 2);
           }

           else if(escolha == 4){
           stats.setMana(stats.getMana() - stats.getGastoDeMana() * 3);
           }

           validMana = 0;
           if(stats.getMana() < 0){
           stats.setMana(manaAtual);
           
           limparTela();
           System.out.println("não tem mana para usar este ataque");
           validMana = 1;
           }
         }
        
         
        
            // calculo de dano
         int random = rnd.nextInt(0, stats.getNivel());

         acerto = verificarAtaque(stats);
         if(escolha == 1 && acerto == true){
         inmgsVida[atk] =inmgsVida[atk] - (stats.getBasicATK() + random + danoBonus) -inmgsDefesa[atk];
        
         limparTela();
         }

          else if(escolha == 2 && acerto == true){
          inmgsVida[atk] =inmgsVida[atk] - (stats.getSk1() + random + danoBonus) - inmgsDefesa[atk];
            
            limparTela();
           }
           
            else if(escolha == 3 && acerto == true){
            inmgsVida[atk] =inmgsVida[atk] - (stats.getSk2() + random + danoBonus) - inmgsDefesa[atk];
              
              limparTela();
             }
             
              else if(escolha == 4 && acerto == true){
              inmgsVida[atk] =inmgsVida[atk] - (stats.getSk3() + random + danoBonus) - inmgsDefesa[atk];
                 
                limparTela();
               }
         else{
           limparTela();
           System.out.println("errou o ataque");
         }

         acerto = esquiva(stats);
         if(acerto == true){
         stats = inimigos.atacar(inmg1[1], stats);
         }
         else{
         System.out.println("se esquivou do ataque inimigo");
         }
         acerto = esquiva(stats);
         if(acerto == true){
         stats = inimigos.atacar(inmg2[1], stats);
         }
         else{
         System.out.println("se esquivou do ataque inimigo");
         }
         acerto = esquiva(stats);
         if(acerto == true){
         stats = inimigos.atacar(inmg3[1], stats);
         }
         else{
         System.out.println("se esquivou do ataque inimigo");
         }
         
               
         if(inmgsVida[0] < 0 && inmgsVida[1] < 0 && inmgsVida[2] < 0){
           System.out.println("parabéns derrotou seu inimigo");
          escolha = 0; 
         }
         turno++;
       }




       
     }
}
  if(stats.getVida() <= 0){
   System.out.println("você morreu");
    return stats;
    
  }
return stats;
 }

  public static boolean verificarAtaque(Status stats){
    Random rnd = new Random(); 
    boolean acerto;
    int random = rnd.nextInt(0, 100);
    if((stats.getChanceDeAcerto() * 10) >= random){
    acerto = true;
    } 
    else{ 
      acerto = false;
      }
    return acerto;
  }

  public static boolean esquiva(Status stats){
  Random rnd = new Random(); 
  boolean acerto;
  int random = rnd.nextInt(0, 100);
  if((stats.getEvasao() * 10) <= random){
  acerto = false;  
  }
  else{
  acerto = true;
  }
    return acerto;
  }
  
  public static void limparTela(){
System.out.println("precione enter para continuar");
new Scanner(System.in).nextLine();
System.out.println("\033[H\033[2J");
System.out.flush();
  }
}