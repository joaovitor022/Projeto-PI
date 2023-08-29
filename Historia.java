import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Historia{

  //inicio
  public static void begin (){
    String arquivo = "Texts/Begin";

        File arq = new File(arquivo);

        try{
        FileReader lendoArq = new FileReader(arq);

        BufferedReader buffer = new BufferedReader(lendoArq);

        String linha;

        while((linha = buffer.readLine()) != null){
            System.out.println(linha);
        }

        buffer.close();

        } catch (IOException e){
            e.printStackTrace();
        }
  }

  //Action 1
  public static void actionOne (){
    String arquivo = "Texts/Action 1";

        File arq = new File(arquivo);

        try{
        FileReader lendoArq = new FileReader(arq);

        BufferedReader buffer = new BufferedReader(lendoArq);

        String linha;

        while((linha = buffer.readLine()) != null){
            System.out.println(linha);
        }

        buffer.close();

        } catch (IOException e){
            e.printStackTrace();
        }
  }

  //Action 2
  public static void actionTwo (){
    String arquivo = "Texts/Action 2.txt";

        File arq = new File(arquivo);

        try{
        FileReader lendoArq = new FileReader(arq);

        BufferedReader buffer = new BufferedReader(lendoArq);

        String linha;

        while((linha = buffer.readLine()) != null){
            System.out.println(linha);
        }

        buffer.close();

        } catch (IOException e){
            e.printStackTrace();
        }
  }

  //Action 3
  public static void actionThree (){
    String arquivo = "Texts/Action 3.txt";

        File arq = new File(arquivo);

        try{
        FileReader lendoArq = new FileReader(arq);

        BufferedReader buffer = new BufferedReader(lendoArq);

        String linha;

        while((linha = buffer.readLine()) != null){
            System.out.println(linha);
        }

        buffer.close();

        } catch (IOException e){
            e.printStackTrace();
        }
  }

  //Action 4
  public static void actionFour (){
    String arquivo = "Texts/Action 4.txt";

        File arq = new File(arquivo);

        try{
        FileReader lendoArq = new FileReader(arq);

        BufferedReader buffer = new BufferedReader(lendoArq);

        String linha;

        while((linha = buffer.readLine()) != null){
            System.out.println(linha);
        }

        buffer.close();

        } catch (IOException e){
            e.printStackTrace();
        }
  }

  //Action Explorer 1
  public static void explorerOne (){
    String arquivo = "Texts/Explorer 1.txt";

        File arq = new File(arquivo);

        try{
        FileReader lendoArq = new FileReader(arq);

        BufferedReader buffer = new BufferedReader(lendoArq);

        String linha;

        while((linha = buffer.readLine()) != null){
            System.out.println(linha);
        }

        buffer.close();

        } catch (IOException e){
            e.printStackTrace();
        }
  }

  //Explorer 1n
  public static void explorerOneNot (){
    String arquivo = "Texts/Action 2.txt";

        File arq = new File(arquivo);

        try{
        FileReader lendoArq = new FileReader(arq);

        BufferedReader buffer = new BufferedReader(lendoArq);

        String linha;

        while((linha = buffer.readLine()) != null){
            System.out.println(linha);
        }

        buffer.close();

        } catch (IOException e){
            e.printStackTrace();
        }
  }
}