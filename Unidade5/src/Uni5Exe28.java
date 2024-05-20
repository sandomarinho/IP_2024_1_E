import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int totalBanda1 = 0, totalBanda2 = 0, 
        totalBanda3 = 0, totalBanda4 = 0;

        double percentualBanda1 = 0, 
        percentualBanda2 = 0,
        percentualBanda3 = 0,
        percentualBanda4 = 0;

        int maiorQuantidadeVotos = 0;

        int totalVotos = 0;
        char novoVoto = 'S';

        System.out.println("**** Votação Melhor Banda ****");
        while (novoVoto == 'S'){
            System.out.println("Escolha a sua banda favorita:");
            System.out.println(" 1 - Nenhum de Nós");
            System.out.println(" 2 - CPM22");
            System.out.println(" 3 - Skank");
            System.out.println(" 4 - Jota Quest");

            int bandaEscolhida = teclado.nextInt();

            switch(bandaEscolhida){
                case 1 :  
                    totalBanda1++;
                    break;
                case 2 :
                    totalBanda2++;
                    break;
                case 3 :
                    totalBanda3++;
                    break;
                case 4 :
                    totalBanda4++;
                    break;
                default : 
                        System.out.println("Opção inválida");
                        break;
            
            }

            System.out.println("Mais um voto? S - Sim/ N - Não");
            novoVoto = teclado.next().charAt(0);
            novoVoto = Character.toUpperCase(novoVoto);

            
        }
        totalVotos = totalBanda1+ totalBanda2+totalBanda3+totalBanda4;



        percentualBanda1 = (totalBanda1 *100)/(double)totalVotos;
        percentualBanda2 = (totalBanda2 *100)/(double)totalVotos;
        percentualBanda3 = (totalBanda3 *100)/(double)totalVotos;
        percentualBanda4 = (totalBanda4 *100)/(double)totalVotos;
            


        //total de votos para cada grupo;
        //percentual dos votos para cada grupo;
        System.out.println("Nenhum de Nós (Votos: "+totalBanda1+")(Percentual: "+percentualBanda1+"%) ");
        System.out.println("CPM22 (Votos: "+totalBanda2+")(Percentual: "+percentualBanda2+"%) ");
        System.out.println("Skank (Votos: "+totalBanda3+")(Percentual: "+percentualBanda3+"%) ");
        System.out.println("Jota Quest (Votos: "+totalBanda4+")(Percentual: "+percentualBanda4+"%) ");
        
        if (totalBanda1 >= totalBanda2 && 
            totalBanda1 >= totalBanda3 &&
            totalBanda1 >= totalBanda4){
            maiorQuantidadeVotos = totalBanda1;
        }else 
        if (totalBanda2 >= totalBanda3 &&
            totalBanda2 >= totalBanda4){
            maiorQuantidadeVotos = totalBanda2;
        }else
        if (totalBanda3 >= totalBanda4){
            maiorQuantidadeVotos = totalBanda3;
        }else{
            maiorQuantidadeVotos = totalBanda4;
        }     
        
        String bandaVencedora = "";
        int quantidadeVencedores = 0;
        if (totalBanda1 == maiorQuantidadeVotos){
            if (quantidadeVencedores > 0){
                bandaVencedora += " - ";    
            }
            bandaVencedora = "Nenhum de Nós";
            quantidadeVencedores++;
        }
        
        if (totalBanda2 == maiorQuantidadeVotos){
            if (quantidadeVencedores > 0){
                bandaVencedora += " - ";    
            }

            bandaVencedora += "CPM22";

            quantidadeVencedores++;
        }

        if (totalBanda3 == maiorQuantidadeVotos){
            if (quantidadeVencedores > 0){
                bandaVencedora += " - ";    
            }
            bandaVencedora = "Skank";
            quantidadeVencedores++;
        }

        if (totalBanda4 == maiorQuantidadeVotos){
            if (quantidadeVencedores > 0){
                bandaVencedora += " - ";    
            }
            bandaVencedora = "Jota Quest";
            quantidadeVencedores++;
        }

        if (quantidadeVencedores > 1){
            System.out.println("As bandas vencedoras foram: "+bandaVencedora);
        }else{
            System.out.println("A banda vencedora foi: "+bandaVencedora);
        }

        


        



        teclado.close();
    }   
}
