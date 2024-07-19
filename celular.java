import java.util.Scanner;
import java.util.*;

class Culular{
    private String nome;
    private String marca;
    private Double preco;
    
    public Celular(String nome, String marca, Double preco){
        this.nome =nome;
        this.marca = marca;
        this.preco = preco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome =nome;
    }
    
    public String getMarca(){
        return marca
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getPreco(){
        return preco;
    }
    
    public void setPreco(){
        this.preco = preco;
    }
    
    public String toString(){
        return "\nNome: " + nome + "\nMarca:" + marca + "\nPreço: " + preco;
    }
    
}

public class Main{
    
	public static void main(String[] args) {

        

	}
}
