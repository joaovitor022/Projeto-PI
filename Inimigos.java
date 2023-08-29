import java.util.*;
public class Inimigos extends Status{
Scanner input = new Scanner(System.in);

public Inimigos(int vida, int poderDeAtaque, int defesa){
    super(vida, poderDeAtaque, defesa);
  }
public Inimigos(){
}
// -------------------------------------------------------
  
public int[] transformarArray(Inimigos inimigo){
int[] array = {inimigo.getVida(), inimigo.getPoderDeAtaque(), inimigo.getDefesa()};
return array;
}
//--------------------------------------------------------
 
public int verificar(int atk, int[] inmgs){
  
  boolean valid;
if (atk != 0 && atk != 1 && atk!= 2 || inmgs[atk] < 0){
valid = false;
}
  
 else{
valid = true;  
}
  
while(valid == false){
if (atk != 0 && atk != 1 && atk!= 2 || inmgs[atk] < 0){
System.out.println("escolha inválida, tente novamente: ");
  System.out.println("- ");
  atk = input.nextInt() - 1;
}  
 else{
valid = true;  
}
 }
  return atk;
}
//--------------------------------------------------------

  public Status atacar(int inimigo, Status stats){
    stats.setVida(stats.getVida() - (inimigo - stats.getDefesa()));
    return stats;
  }
  
}