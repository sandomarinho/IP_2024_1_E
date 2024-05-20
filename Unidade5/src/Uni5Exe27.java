import java.util.Scanner;

public class Uni5Exe27 {
   public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    int novoFuncionario = 1;
    int totalPecasDia = 0;
    double valorRecebido = 0;
    int diaMaiorProducao = 0, pecasMaiorProducao = 0;
    String periodoMaiorProducao = ""; 

    while(novoFuncionario == 1){
        System.out.println("Informe o dia do mês(1 á 30):" );
        int diaMes = teclado.nextInt();

        while (diaMes < 1 || diaMes > 30){
            System.out.println("Dia Inválido");
            System.out.println("Informe o dia do mês(1 á 30):");
            diaMes = teclado.nextInt();
        }

        System.out.println("Informe o Total de Peças produzidas de manhã:");
        int totalPecasManha = teclado.nextInt();

        System.out.println("Informe o total de peças produzidas de tarde:");
        int totalPecasTarde = teclado.nextInt();
                
        totalPecasDia = totalPecasManha + totalPecasTarde;

        if (totalPecasDia > pecasMaiorProducao){
            pecasMaiorProducao = totalPecasDia;
            diaMaiorProducao = diaMes;

            if (totalPecasManha > totalPecasTarde){
                periodoMaiorProducao = "Manhã";
            }else{
                periodoMaiorProducao = "Tarde";
            }
        }
        
        if (diaMes <= 15){            
            if (totalPecasDia > 100 && totalPecasManha >= 30 
                && totalPecasTarde >= 30 ){
                valorRecebido = 0.80 * totalPecasDia;
            }else{
                valorRecebido = 0.50 * totalPecasDia;
            }

        }else{
            valorRecebido = 0.40 * totalPecasManha;
            valorRecebido +=  0.30 * totalPecasTarde;
        }

        System.out.println("R$ "+valorRecebido+ " (valor recebido)");

        System.out.println("Novo Funcionário (1 - Sim / 2 - Não)");
        novoFuncionario = teclado.nextInt();

    }
    
    System.out.println("O dia da maior produção foi: "+diaMaiorProducao);
    System.out.println("O período que o funcionário mais produziu foi de "+periodoMaiorProducao);
    teclado.close();

   }
}
