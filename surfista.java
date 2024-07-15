

class Surfista(){
    private String nome;
    private String id;
    private String nacionalidade;
    
    public Surfista(String nome, id, nacionalidade){
        this.nome =nome;
        this.id = id;
        this.nacionalidade = nacionalidade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getNacionalidade(){
        return nacionalidade;
    }
    
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
    
    public String toString(){
        return "\nNome: " + nome + "\nID: " + id + "Nacionalidade: " + nacionalidade;
    }
}

public class Main{
    public static ArrayList<Surfista> surfistas = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	    
	    int opcao = 0;
	    
	    do{
	        mostrarMenu();
	        opcao = scanner.nextInt();
	        scanner.nextLine();
	        
	        switch(opcao){
	            case 1:
	                cadastrarSurfista();
	                break;
	            case 2:
	                listarSurfista();
	                break;
	            case 3:
	                buscarSurfista();
	                break;
	            case 4:
	                atualizarSurfista();
	                break;
	            case 5:
	                deletarSurfista();
	                break;
	            case 0:
	                System.out.println("Saindo...");
	            default:
	                System.out.println("Opçao invalida, tente novamente");
	        }
	    }
    public static void cadastrarSurfista(){
        
    }
    
    public static void listarSurfista(){
        if()
    }
    
    public static void buscarSurfista(){
        
    }
    
    public static void atualizarSurfista(){
        
    }
    
    public static void deletarSurfista(){
        
    }
    
    
    

	}
}







