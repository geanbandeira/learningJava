import java.io.*;

class Pessoa implements Serializable{

    private static final long serialVersionUID = 1L;
    String nome;
    int idade;
    
    Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}


public class Main{
	public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Gean", 23);
    
    try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoa.ser"))){
        oos.writeObject(pessoa);
    } catch (IOException e){
        e.printStackTrace();
    }
    
    try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("pessoa.ser"))){
        Pessoa p = (Pessoa) ois.readObject();
        System.out.println("Nome: " + p.nome + " Idade: " + p.idade);
    } catch (IOException | ClassNotFoundException e ){
        e.printStackTrace();
        }
	}
}









