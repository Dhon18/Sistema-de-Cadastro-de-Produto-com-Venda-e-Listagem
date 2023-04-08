package vender;
import java.util.Scanner;
class Cadastro_de_Produtos {
    Scanner leia = new Scanner(System.in);
    private String forarr, forfei, formac, forman, forole, forsab, foresc, forpas;
    private float valarr, valfei, valmac, valman, valole, valsab, valesc, valpas;
    int c;
    private int arroz, feijao, macarrao, manteiga, oleo, sabao, escova, pasta;

    public Cadastro_de_Produtos() {
    }

    public Cadastro_de_Produtos(String forarr, String forfei, String formac, String forman, String forole, String forsab, String foresc, String forpas, float valarr, float valfei, float valmac, float valman, float valole, float valsab, float valesc, float valpas, int arroz, int feijao, int macarrao, int manteiga, int oleo, int sabao, int escova, int pasta) {
        this.forarr = forarr;
        this.forfei = forfei;
        this.formac = formac;
        this.forman = forman;
        this.forole = forole;
        this.forsab = forsab;
        this.foresc = foresc;
        this.forpas = forpas;
        this.valarr = valarr;
        this.valfei = valfei;
        this.valmac = valmac;
        this.valman = valman;
        this.valole = valole;
        this.valsab = valsab;
        this.valesc = valesc;
        this.valpas = valpas;
        this.arroz = arroz;
        this.feijao = feijao;
        this.macarrao = macarrao;
        this.manteiga = manteiga;
        this.oleo = oleo;
        this.sabao = sabao;
        this.escova = escova;
        this.pasta = pasta;
    }

    public String getForarr() {
        return forarr;
    }

    public void setForarr(String forarr) {
        this.forarr = forarr;
    }

    public String getForfei() {
        return forfei;
    }

    public void setForfei(String forfei) {
        this.forfei = forfei;
    }

    public String getFormac() {
        return formac;
    }

    public void setFormac(String formac) {
        this.formac = formac;
    }

    public String getForman() {
        return forman;
    }

    public void setForman(String forman) {
        this.forman = forman;
    }

    public String getForole() {
        return forole;
    }

    public void setForole(String forole) {
        this.forole = forole;
    }

    public String getForsab() {
        return forsab;
    }

    public void setForsab(String forsab) {
        this.forsab = forsab;
    }

    public String getForesc() {
        return foresc;
    }

    public void setForesc(String foresc) {
        this.foresc = foresc;
    }

    public String getForpas() {
        return forpas;
    }

    public void setForpas(String forpas) {
        this.forpas = forpas;
    }

    public float getValarr() {
        return valarr;
    }

    public void setValarr(float valarr) {
        this.valarr = valarr;
    }

    public float getValfei() {
        return valfei;
    }

    public void setValfei(float valfei) {
        this.valfei = valfei;
    }

    public float getValmac() {
        return valmac;
    }

    public void setValmac(float valmac) {
        this.valmac = valmac;
    }

    public float getValman() {
        return valman;
    }

    public void setValman(float valman) {
        this.valman = valman;
    }

    public float getValole() {
        return valole;
    }

    public void setValole(float valole) {
        this.valole = valole;
    }

    public float getValsab() {
        return valsab;
    }

    public void setValsab(float valsab) {
        this.valsab = valsab;
    }

    public float getValesc() {
        return valesc;
    }

    public void setValesc(float valesc) {
        this.valesc = valesc;
    }

    public float getValpas() {
        return valpas;
    }

    public void setValpas(float valpas) {
        this.valpas = valpas;
    }

    public int getArroz() {
        return arroz;
    }

    public void setArroz(int arroz) {
        this.arroz = arroz;
    }

    public int getFeijao() {
        return feijao;
    }

    public void setFeijao(int feijao) {
        this.feijao = feijao;
    }

    public int getMacarrao() {
        return macarrao;
    }

    public void setMacarrao(int macarrao) {
        this.macarrao = macarrao;
    }

    public int getManteiga() {
        return manteiga;
    }

    public void setManteiga(int manteiga) {
        this.manteiga = manteiga;
    }

    public int getOleo() {
        return oleo;
    }

    public void setOleo(int oleo) {
        this.oleo = oleo;
    }

    public int getSabao() {
        return sabao;
    }

    public void setSabao(int sabao) {
        this.sabao = sabao;
    }

    public int getEscova() {
        return escova;
    }

    public void setEscova(int escova) {
        this.escova = escova;
    }

    public int getPasta() {
        return pasta;
    }

    public void setPasta(int pasta) {
        this.pasta = pasta;
    }
    
    
    
    
    
    public void venderp(){
        System.out.println("Você deseja");
        System.out.println("1 - Feijão");
        System.out.println("2 - Arroz");
        System.out.println("3 - Macarrão");
        System.out.println("4 - Manteiga");
        System.out.println("5 - Oléo");
        System.out.println("6 - Sabão");
        System.out.println("7 - Escova");
        System.out.println("8 - Pasta de Dente");
        int menu1 = leia.nextInt();
        
        switch(menu1){
            case 1:
            System.out.println("Você deseja comprar quantos feijao?: ");
        c = leia.nextInt();
        if(feijao < c){
            System.out.println("Ops, Estoque de Feijão Esgotado ou não Suficiente!!");
            feijao=feijao-c;
        }if(feijao >= c){
            System.out.println("Vendido com Sucesso!!");
            feijao=feijao-c;
        }if (feijao == 0){
            System.out.println("Estoque Esgotado");
        }
            break;
                
                
            case 2:   
        System.out.println("Você deseja comprar quantos arroz?: ");
        c = leia.nextInt();
        if(arroz < c){
            System.out.println("Ops, Estoque de Arroz Esgotado ou não Sufuciente!!");
            arroz=arroz-c;
        }if(arroz >= c){
            System.out.println("Vendido com Sucesso!!");
            arroz=arroz-c;
        }if(arroz == 0){
            System.out.println("Estoque gotado");
        }
            break;
                
                
            case 3:
                System.out.println("Você deseja comprar quantos macarrão?: ");
        c = leia.nextInt();
        if(macarrao < c){
            System.out.println("Ops, Estoque de Macarrão Esgotado ou não Sufuciente!!");
            macarrao=macarrao-c;
        }if(macarrao >= c){
            System.out.println("Vendido com Sucesso!!");
            macarrao=macarrao-c;
        }if(macarrao == 0){
            System.out.println("Estoque gotado");
        }
            break;
                
                
            case 4:
            System.out.println("Você deseja comprar quantos manteiga?: ");
        c = leia.nextInt();
        if(manteiga < c){
            System.out.println("Ops, Estoque de Manteiga Esgotado ou não Sufuciente!!");
            manteiga=manteiga-c;
        }if(manteiga >= c){
            System.out.println("Vendido com Sucesso!!");
            manteiga=manteiga-c;
        }if(manteiga == 0){
            System.out.println("Estoque gotado");
        }
            break;
                
                
            case 5:
            System.out.println("Você deseja comprar quantos oléo?: ");
        c = leia.nextInt();
        if(oleo < c){
            System.out.println("Ops, Estoque de Oléo Esgotado ou não Sufuciente!!");
            oleo=oleo-c;
        }if(oleo >= c){
            System.out.println("Vendido com Sucesso!!");
            oleo=oleo-c;
        }if(oleo == 0){
            System.out.println("Estoque gotado");
        }
            break;
                
                
            case 6:
            System.out.println("Você deseja comprar quantos sabão?: ");
        c = leia.nextInt();
        if(sabao < c){
            System.out.println("Ops, Estoque de sabão Esgotado ou não Sufuciente!!");
            sabao=sabao-c;
        }if(sabao >= c){
            System.out.println("Vendido com Sucesso!!");
            sabao=sabao-c;
        }if(sabao == 0){
            System.out.println("Estoque gotado");
        }
                break;
                
                
            case 7:
            System.out.println("Você deseja comprar quantos escova?: ");
        c = leia.nextInt();
        if(escova < c){
            System.out.println("Ops, Estoque de Escova Esgotado ou não Sufuciente!!");
            escova=escova-c;
        }if(escova >= c){
            System.out.println("Vendido com Sucesso!!");
            escova=escova-c;
        }if(escova == 0){
            System.out.println("Estoque gotado");
        }
                break;
                
                
            case 8:
            System.out.println("Você deseja comprar quantas pasta?: ");
        c = leia.nextInt();
        if(pasta < c){
            System.out.println("Ops, Estoque de Pasta Esgotado ou não Sufuciente!!");
            pasta=pasta-c;
        }if(pasta >= c){
            System.out.println("Vendido com Sucesso!!");
            pasta=pasta-c;
        }if(pasta == 0){
            System.out.println("Estoque gotado");
        }
                break;
        }
    }
}
