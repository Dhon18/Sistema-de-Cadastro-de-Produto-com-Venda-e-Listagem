package vender;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Cadastro_de_Produtos>lispro = new ArrayList<>();
        Scanner leia = new Scanner(System.in);
        int menu;
        boolean rode = true;
        Cadastro_de_Produtos cdpc = new Cadastro_de_Produtos();
        
        while(rode){
            
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Vender Produto");
        System.out.println("3 - Listar Quantidade de Produtos em Estoque");
        menu = leia.nextInt();
        
        switch(menu){
            
        case 1:
        System.out.println("====Qual Produto Você deseja Cadastrar====");
        System.out.println("1 - Feijão");
        System.out.println("2 - Arroz");
        System.out.println("3 - Macarrão");
        System.out.println("4 - Manteiga");
        System.out.println("5 - Oléo");
        System.out.println("6 - Sabão");
        System.out.println("7 - Escova");
        System.out.println("8 - Pasta de Dente");
        int segme = leia.nextInt();
           switch(segme){
               case 1:
                   System.out.println("\n\n");
                   System.out.println("Digite a quantidade de Feijão: ");
                   int feijao = leia.nextInt();
                   leia.nextLine();
                   System.out.println("Informe o fornecedor: ");
                   String forfeijao = leia.nextLine();
                   System.out.println("Valor do Feijão: ");
                   float valorfeijao = leia.nextFloat();
                   cdpc.setValfei(valorfeijao);
                   cdpc.setForfei(forfeijao);
                   cdpc.setFeijao(feijao);
                   lispro.add(cdpc);
                   System.out.println("\n\n");
                   break;
               case 2:
                   System.out.println("Digite a quantidade de Arroz: ");
                   int arroz = leia.nextInt();
                   leia.nextLine();
                   System.out.println("Informe o fornecedor: ");
                   String forarroz = leia.nextLine();
                   System.out.println("Valor do Arroz: ");
                   float valorarroz = leia.nextFloat();
                   cdpc.setValarr(valorarroz);
                   cdpc.setForarr(forarroz);
                   cdpc.setArroz(arroz);
                   lispro.add(cdpc);
                   System.out.println("\n\n");
                   break;
               case 3:
                   System.out.println("Digite a quantidade de Macarrão: ");
                   int macarrao = leia.nextInt();
                   leia.nextLine();
                   System.out.println("Informe o fornecedor: ");
                   String formacarrao = leia.nextLine();
                   System.out.println("Valor ddo Macarrão: ");
                   float valormacarrao = leia.nextFloat();
                   cdpc.setValmac(valormacarrao);
                   cdpc.setFormac(formacarrao);
                   cdpc.setMacarrao(macarrao);
                   lispro.add(cdpc);
                   System.out.println("\n\n");
                   break;
               case 4:
                   System.out.println("Digite a quantidade de Manteiga: ");
                   int manteiga = leia.nextInt();
                   leia.nextLine();
                   System.out.println("Informe o fornecedor: ");
                   String formanteiga = leia.nextLine();
                   System.out.println("Valor da Manteiga: ");
                   float valormanteiga = leia.nextFloat();
                   cdpc.setValman(valormanteiga);
                   cdpc.setForman(formanteiga);
                   cdpc.setManteiga(manteiga);
                   lispro.add(cdpc);
                   System.out.println("\n\n");
                   break;
               case 5:
                   System.out.println("Digite a quantidade de Oléo: ");
                   int oleo = leia.nextInt();
                   leia.nextLine();
                   System.out.println("Informe o fornecedor: ");
                   String foroleo = leia.nextLine();
                   System.out.println("Valor Oléo: ");
                   float valoroleo = leia.nextFloat();
                   cdpc.setValole(valoroleo);
                   cdpc.setForole(foroleo);
                   cdpc.setOleo(oleo);
                   lispro.add(cdpc);
                   System.out.println("\n\n");
                   break;
               case 6:
                   System.out.println("Digite a quantidade de Sabão: ");
                   int sabao = leia.nextInt();
                   leia.nextLine();
                   System.out.println("Informe o fornecedor: ");
                   String forsabao = leia.nextLine();
                   System.out.println("Valor Sabao: ");
                   float valorsabao = leia.nextFloat();
                   cdpc.setValsab(valorsabao);
                   cdpc.setForsab(forsabao);
                   cdpc.setSabao(sabao);
                   lispro.add(cdpc);
                   System.out.println("\n\n");
                   break;
               case 7:
                   System.out.println("Digite a quantidade de Escovas: ");
                   int escova = leia.nextInt();
                   leia.nextLine();
                   System.out.println("Informe o fornecedor: ");
                   String forescova = leia.nextLine();
                   System.out.println("Valor Escova: ");
                   float valorescova = leia.nextFloat();
                   cdpc.setValesc(valorescova);
                   cdpc.setForesc(forescova);
                   cdpc.setEscova(escova);
                   lispro.add(cdpc);
                   System.out.println("\n\n");
                   break;
               case 8:
                   System.out.println("Digite a quantidade de Pasta de Dentes: ");
                   int pasta = leia.nextInt();
                   leia.nextLine();
                   System.out.println("Informe o fornecedor: ");
                   String forpasta = leia.nextLine();
                   System.out.println("Valor Pasta de Dentes: ");
                   float valorpasta = leia.nextFloat();
                   cdpc.setValpas(valorpasta);
                   cdpc.setForpas(forpasta);
                   cdpc.setPasta(pasta);
                   lispro.add(cdpc);
                   System.out.println("\n\n");
                   break;
               default:
           }
            break;
        case 2:
        cdpc.venderp();
            break;
        case 3:
            //Tem que criar um atributo para cada fornecedor de cada produto
            //Ainda falta chamar os valores em sequencias
            System.out.println("\n\n\n\n===========================================================================================================================");
            System.out.println("Quantidade de Arroz em Estoque: " + cdpc.getArroz() +", Fornecedor, "+cdpc.getForarr() +", Valor da Mercadoria, "+cdpc.getValarr());
            System.out.println("Quantidade de Feijão em Estoque: " + cdpc.getFeijao() +", Fornecedor, "+cdpc.getForfei() +", Valor da Mercadoria, "+cdpc.getValfei());
            System.out.println("Quanridade de Macarrão em Estoque: " + cdpc.getMacarrao() +", Fornecedor, "+cdpc.getFormac() +", Valor da Mercadoria, "+cdpc.getValmac());
            System.out.println("Quanridade de Manteiga em Estoque: " + cdpc.getManteiga() +", Fornecedor, "+cdpc.getForman() +", Valor da Mercadoria, "+cdpc.getValman());
            System.out.println("Quanridade de Oléo em Estoque: " + cdpc.getOleo() +", Fornecedor, "+cdpc.getForole() +", Valor da Mercadoria, "+cdpc.getValole());
            System.out.println("Quanridade de Sabão em Estoque: " + cdpc.getSabao() +", Fornecedor, "+cdpc.getForsab() +", Valor da Mercadoria, "+cdpc.getValsab());
            System.out.println("Quanridade de Escova em Estoque: " + cdpc.getEscova() +", Fornecedor, "+cdpc.getForesc() +", Valor da Mercadoria, "+cdpc.getValesc());
            System.out.println("Quanridade de Pasta em Estoque: " + cdpc.getPasta() +", Fornecedor, "+cdpc.getForesc() +", Valor da Mercadoria, "+cdpc.getValpas());
            System.out.println("\n\n\n\n===========================================================================================================================\n\n\n\n");
            break;
        default:
            } 
        }   
    }
}