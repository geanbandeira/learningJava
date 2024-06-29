enum Dia{
    SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SABADO , DOMINGO
}

public class Main{
	public static void main(String[] args) {
    Dia dia = Dia.SABADO;

    switch(dia){
        case SEGUNDA:
        case TERÇA:
        case QUARTA:
        case QUINTA:
        case SEXTA:
            System.out.println("Dias Úteis");
            break;
        case SABADO:
        case DOMINGO:
            System.out.println("Finais de Semana");
            break;
        }
	}
}
