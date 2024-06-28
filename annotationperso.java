import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Info{
    String autor();
    String data();
}

public class Main{
    @Info(autor = "Gean", data = "01/01/2001")
    public void metodoExemplo(){
        System.out.println("Metodo personalizado");
    }
    


	public static void main(String[] args) throws Exception {
    Main main = new Main();
    Method metodo = main.getClass().getMethod("Metodo exem");
    Info info = metodo.getAnnotation(Info.class);
    System.out.println("Autor " + info.autor());
    System.out.println("Data " + info.data());

    main.metodoExemplo();

    }
}









