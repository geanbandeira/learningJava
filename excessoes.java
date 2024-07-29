
public class Main {
    public static void main(String[] args) {
        
        try{
            int [] numbers = {1, 2, 3};
            System.out.println(numbers[0]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Fora dos limites\n");
        } finally{
            System.out.println("O bloco try catch foi concluido\n");
        }
        
    }
}
