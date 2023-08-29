public class Status{

// status do personagem

  private int nivel;
  
  private int vida;

  private int poderDeAtaque;

  private int mana;
 
  private int defesa;
 
  private int evasao;

  private int chanceDeAcerto;

  private int gastoDeMana;

  // habilidades do personagem

  private int basicATK;
  
  private int sk1;

  private int sk2;

  private int sk3;  

  // nome das habilidades

  private String nomeBasicATK;

  private String nomeSk1;

  private String nomeSk2;

  private String nomeSk3;
  
  // status inimigos
  
  public Status(int vida, int poderDeAtaque, int mana){
    this.vida = vida;
    this.poderDeAtaque = poderDeAtaque;
    this.mana = mana;
  }

  public Status(){
    
  }
  
//--------------------------------------------------------------------------
  
public int getNivel(){
return nivel;  
}
  public void setNivel(int nivel){
  this.nivel = nivel;  
  }
  
public int getVida(){
return vida;  
}
  public void setVida(int vida){
  this.vida = vida;  
  }
  
public int getPoderDeAtaque(){
return poderDeAtaque;  
}
  public void setPoderDeAtaque(int poderDeAtaque){
  this.poderDeAtaque = poderDeAtaque;  
  }
  
public int getMana(){
return mana;  
}
  public void setMana(int mana){
  this.mana = mana;  
  }

public int getDefesa(){
return defesa;  
}
  public void setDefesa(int defesa){
  this.defesa = defesa;  
  }

public int getEvasao(){
return evasao;  
}
  public void setEvasao(int evasao){
  this.evasao = evasao;  
  }

public int getChanceDeAcerto(){
return chanceDeAcerto;  
}
  public void setChanceDeAcerto(int chanceDeAcerto){
  this.chanceDeAcerto = chanceDeAcerto;  
  }

public int getGastoDeMana(){
return gastoDeMana;  
}
  public void setGastoDeMana(int gastoDeMana){
  this.gastoDeMana = gastoDeMana;
  }
  // habilidades
  
   public int getBasicATK() {
	return basicATK;
}
public void setBasicATK(int basicATK) {
	this.basicATK = basicATK;
}
  
  public int getSk1() {
	return sk1;
}
public void setSk1(int sk1) {
	this.sk1 = sk1;
}

  public int getSk2() {
	return sk2;
}
public void setSk2(int sk2) {
	this.sk2 = sk2;
}

  public int getSk3() {
	return sk3;
}
public void setSk3(int sk3) {
	this.sk3 = sk3;
}

public String getNomeBasicATK(){
  return nomeBasicATK;
}
public void setNomeBasicATK(String nomeBasicATK){
  this.nomeBasicATK = nomeBasicATK;
}

public String getNomeSk1(){
  return nomeSk1;
}
public void setNomeSk1(String nomeSk1){
  this.nomeSk1 = nomeSk1;
}

public String getNomeSk2(){
  return nomeSk2;
}
public void setNomeSk2(String nomeSk2){
  this.nomeSk2 = nomeSk2;
}

public String getNomeSk3(){
  return nomeSk3;
}
public void setNomeSk3(String nomeSk3){
  this.nomeSk3 = nomeSk3;
}
  
}