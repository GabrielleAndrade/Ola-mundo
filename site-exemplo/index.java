package exercicio15;

import java.util.Scanner;


public class E15E {
    Scanner s = new Scanner(System.in);
    String nome;
    float valorcompra;
    double valorvenda;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValorcompra() {
        return valorcompra;
    }

    public void setValorcompra(float valorcompra) {
        this.valorcompra = valorcompra;
    }

    public double getValorvenda() {
        return valorvenda;
    }

    public void setValorvenda(double valorvenda) {
        this.valorvenda = valorvenda;
    }
    
    
    
   //double desconto=valorpagar-(valorpagar*0.100) 
    public void calculo(){
        System.out.println("Digite o nome do produto: ");
        setNome(s.next());
        System.out.println("Digite o valor de compra dos produtos acima de 20R$: ");
        setValorcompra(s.nextFloat());
        if(getValorcompra()<20){
            setValorvenda(this.valorcompra+(this.valorcompra*0.450));
        }else if(getValorcompra()>=20){
            setValorvenda(this.valorcompra+(this.valorcompra*0.350));
        }else if(getValorcompra()>=40 && getValorcompra()<60){
            setValorvenda(this.valorcompra+(this.valorcompra*0.250));
        }else if(getValorcompra()>=60){
            setValorvenda(this.valorcompra+(this.valorcompra*0.150));
        }
        System.out.println(getNome()+ " tem o valor de venda de "+ getValorvenda()+ "R$");
    }  
}
