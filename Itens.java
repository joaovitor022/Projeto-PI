import java.util.*;
public class Itens {
public void exibir(HashMap<String, Integer> pocoes){
   for(String item :  pocoes.keySet()){
      System.out.println(item+" : "+pocoes.get(item));
     }
}
  
  public Status usarPocao(HashMap<String, Integer> pocoes, Status stats, int[] array){
    Scanner input = new Scanner(System.in); 
    int opcao = -1;
     while(opcao != 0){
    int cont = 1;
             for(String item :  pocoes.keySet()){
      System.out.println(cont+". "+item+" : "+pocoes.get(item));
      cont++;
     }
       
       System.out.println("0.voltar");
      System.out.print("informe o item que deseja usar: ");
    opcao = input.nextInt();
       if(opcao == 0){
         //voltar
       }
         
      else if(opcao == 1 && pocoes.get("Poção de vida Grande") > 0){
        stats.setVida(20 + stats.getVida());
        pocoes.put("Poção de vida Grande", pocoes.get("Poção de vida Grande") - 1);
      }
        
       else if(opcao == 2 && pocoes.get("Poção de vida Media") > 0){
        stats.setVida(40 + stats.getVida());
        pocoes.put("Poção de vida Media", pocoes.get("Poção de vida Media") - 1);
      }
         
        else if(opcao == 3 && pocoes.get("Poção de vida Pequena") > 0){
        stats.setVida(80 + stats.getVida());
        pocoes.put("Poção de vida Pequena", pocoes.get("Poção de vida Pequena") - 1);
      }
          
        else if(opcao == 4 && pocoes.get("Poção de mana Grande") > 0){
        stats.setMana(10 + stats.getMana());
        pocoes.put("Poção de mana Grande", pocoes.get("Poção de mana Grande") - 1);
      }
          
       else if(opcao == 5 && pocoes.get("Poção de mana Media") > 0){
        stats.setMana(20 + stats.getMana());
        pocoes.put("Poção de mana Media", pocoes.get("Poção de mana Media") - 1);
      }

       else if(opcao == 6 && pocoes.get("Poção de mana Pequena") > 0){  
        stats.setMana(40 + stats.getMana());
        pocoes.put("Poção de mana Pequena", pocoes.get("Poção de mana Pequena") - 1);
      }
       else{
         System.out.println();
         System.out.println("escolha inválida");
       }
       if(stats.getVida() > array[1]){
       stats.setVida(array[1]);  
       }
       if(stats.getMana() > array[3]){
       stats.setMana(array[3]);  
       }
    }
    return stats;
  }

  public String equiparArma(Status stats, HashMap<String, Armas> armas){
  String[] array = new String[10];
  Scanner input = new Scanner(System.in);
  int cont = 0;
  for(String item : armas.keySet()){
  System.out.println(cont+1+". "+item);
  array[cont] = item;
  cont++;
  }
     System.out.print("informe a arma que deseja usar: ");
    int escolha = input.nextInt();
    return array[escolha - 1];
  }
  public void ExibirMochila(HashMap<String, Integer> pocoes, HashMap<String, Armas> armas){
  for(String item : armas.keySet()){
  System.out.println(". "+item);
  }
    for(String item :  pocoes.keySet()){
      System.out.println(item+" : "+pocoes.get(item));
     }
  }
}