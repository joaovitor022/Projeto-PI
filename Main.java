import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Status stats = new Status();
    Combate batalha = new Combate();
    Classes classe = new Classes();
    Inimigos inimigo = new Inimigos();
    Armas arma = new Armas();
    Itens mochila = new Itens();
    Historia campanha = new Historia();
    HashMap<String, Armas> armas = new HashMap<String, Armas>(); 
    HashMap<String, Integer> pocoes = new HashMap<String, Integer>();

    int[] inimigo1 = new int[3];
    int[] inimigo2 = new int[3];
    int[] inimigo3 = new int[3];

    // geração de inimigos
    Inimigos goblin = new Inimigos(50, 8, 20);
    Inimigos slime = new Inimigos(40, 8, 20);
    Inimigos orc = new Inimigos(70, 8, 20);

    //poções
    pocoes.put("Poção de vida Pequena", 3);
    pocoes.put("Poção de vida Media", 1);
    pocoes.put("Poção de vida Grande", 0);
    pocoes.put("Poção de mana Pequena", 3);
    pocoes.put("Poção de mana Media", 1);
    pocoes.put("poção de mana Grande", 0);
    
    // criar armas lutador
    arma.setDescricao("");
    arma.setaTKBonus(1);
    arma.setCusto(1);
    armas.put("Sabre", arma);
    arma.setDescricao("");
    arma.setaTKBonus(1);
    arma.setCusto(1);
    armas.put("Espada longa", arma);
    arma.setDescricao("");
    arma.setaTKBonus(1);
    arma.setCusto(1);
    armas.put("Claymore", arma);
    
    //Ladino
    arma.setDescricao("");
    arma.setaTKBonus(1);
    arma.setCusto(1);
    armas.put("Faca de caça", arma);
    arma.setDescricao("");
    arma.setaTKBonus(1);
    arma.setCusto(1);
    armas.put("Kukri", arma);
    arma.setDescricao("");
    arma.setaTKBonus(1);
    arma.setCusto(1);
    armas.put("Adagas duplas", arma);
    
    int[] array = new int[8];

    //começo do jogo
    
    System.out.println("escolha sua classe: ");
    System.out.println("1. Lutador");
    System.out.println("2. Mago");
    System.out.println("3. Ladino");
    System.out.println("4. Paladino");
    System.out.println("5. Mago de sangue");
    System.out.print("- ");
    int escolha = input.nextInt();
    escolha = classe.confirmar(escolha);
    stats = classe.classe(escolha);
    stats.setNivel(5);

   //Historia.begin();
   // Historia.actionOne();
   // Historia.actionTwo();
   // Historia.actionThree();
   // Historia.actionFour();
   // Historia.explorerOne();
   // Historia.explorerOneNot();

    // stats no máximo
    array[0] = stats.getNivel();
    array[1] = stats.getVida();
    array[2] = stats.getPoderDeAtaque();
    array[3] = stats.getMana();
    array[4] = stats.getDefesa();
    array[5] = stats.getEvasao();
    array[6] = stats.getChanceDeAcerto();
    array[7] = stats.getGastoDeMana();

    inimigo1 = inimigo.transformarArray(goblin);
    inimigo2 = inimigo.transformarArray(slime);
    inimigo3 = inimigo.transformarArray(orc);

    String armaEquipada = mochila.equiparArma(stats, armas);
    stats = batalha.batalha(inimigo1, inimigo2, inimigo3, stats, array, pocoes, armaEquipada, armas, arma);
  }
}