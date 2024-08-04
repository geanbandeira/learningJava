import java.util.Scanner;
import java.util.*;


class Astronauta{
    private String numDocumento;
    private Contato contato;
    
    public Astronauta(String numDocumento, Contato contato){
        this.numDocumento = numDocumento;
        this.contato = contato;
    }
    
    public String getNumDocumento(){
        return numDocumento;
    }
    
    public void setNumDocumento(String numDocumento){
        this.numDocumento = numDocumento;
    }
    
    public Contato contato(){
        return contato;
    }
    
    public void setContato(Contato contato){
        this.contato = contato;
    }
    
    public String toString(){
        return "Numero do Documento: " + numDocumento + "\n";
    }
}

class Contato{
    private String nome;
    private String email;
    private String endereco;
    private String telefone;
    
    public Contato(String nome, String endereco, String telefone, String email){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email =email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String toString(){
        return "\nNome: " + nome + "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\nEmail: " + email + "\n";   
    }
}


public class Main{
    public static ArrayList<Astronauta> astronautas = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

        int opcao = 0;

        do{
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){
                case 1:
                    cadastrarAstronauta();
                    break;
                case 2:
                    listarAstronautas();
                    break;
                case 3:
                    buscarAstronauta();
                    break;
                case 4:
                    atualizarAstronauta();
                    break;
                case 5:
                    deletarAstronauta();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                System.out.println("Opção Inválida. Tente novamente");
            }
        }while(opcao !=0);
	}

        private static void mostrarMenu(){
            System.out.println("1. Cadastrar Astronauta");
            System.out.println("2. Listar Astronautas");
            System.out.println("3. Buscar Astronautas");
            System.out.println("4. Atualizar Astronauta");
            System.out.println("5. Deletar Astronauta");
            System.out.println("0. Sair");
            System.out.println("Escolha uma das opções\n");
        }
        
        private static void cadastrarAstronauta(){
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Endereço: ");
            String endereco = scanner.nextLine();
            System.out.println("Telefone: ");
            String telefone = scanner.nextLine();
            System.out.println("Email: ");
            String email = scanner.nextLine();
            Contato contato = new Contato(nome, endereco, telefone, email);
            
            System.out.println("Numero do Documento: ");
            String numDocumento = scanner.nextLine();
            
            Astronauta astronauta = new Astronauta(numDocumento, contato);
            astronautas.add(astronauta);
            System.out.println("Astronauta cadastrado com sucesso");
        }
        
        private static void listarAstronautas(){
           
            if(astronautas.isEmpty()){
                System.out.println("Nenhum Astronauta encontrado\n");
            }else{
                System.out.println("-- Lista de Astronautas --\n");
                for(Astronauta astronauta : astronautas){
                    System.out.println(astronauta);
                    break;
                }
            }
        }
        
        private static void buscarAstronauta(){
            System.out.println("Numero do Documento:");
            String numDocumento = scanner.nextLine();
            
            boolean encontrado = false;
            for(Astronauta astronauta : astronautas){
                if(astronauta.getNumDocumento().equals(numDocumento)){
                    System.out.println("Astronauta encontrado com sucesso");
                    System.out.println(astronauta);
                    encontrado = true;
                    break;
                }
            }
        }
        
        private static void atualizarAstronauta(){
            System.out.println("Numero do Documento: ");
            String numDocumento = scanner.nextLine();
            
            Astronauta astronautaEncontrado = null;
            for(Astronauta astronauta : astronautas){
                if(astronauta.getNumDocumento().equals(numDocumento)){
                    System.out.println("Astronauta encontrado com sucesso\n");
                    astronautaEncontrado = astronauta;
                    break;
                }
            }
            if(astronautaEncontrado == null){
                System.out.println("Astronauta nao encontrado\n");
                return;
            }
            
            System.out.println("Novo Numero de Documento: ");
            String novoNumDocumento = scanner.nextLine();
            
            if(!novoNumDocumento.isEmpty()){
                astronautaEncontrado.setNumDocumento(novoNumDocumento);
            }
            System.out.println("Dados atualizado com sucesso\n");
            
        }
        
        private static void deletarAstronauta(){
            System.out.println("Numero do Documento: ");
            String numDocumento = scanner.nextLine();
            
            boolean encontrado = false;
            Iterator <Astronauta> iterator = astronautas.iterator();
            while(iterator.hasNext()){
                Astronauta astronauta = iterator.next();
                if(astronauta.getNumDocumento().equals(numDocumento)){
                    iterator.remove();
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
                System.out.println("Astronauta nao encontrado\n");
            }
            System.out.println("Astronauta deletado com sucesso\n");
        }
    

	}






