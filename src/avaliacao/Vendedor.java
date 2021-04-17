/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao;

/**
 *
 * @author Usuário
 */
public class Vendedor extends Funcionario {
    private Double Salario;
    private int QuantVendas;
    protected Double Comissao;
    
    public Vendedor(String Nome, String CPF, String Telefone) {
        super(Nome, CPF, Telefone);
        }
    
    @Override
    public Double getSalario(){
            return this.Salario + (this.QuantVendas*this.Comissao);
    }
    public int getQuantVendas(){
         return QuantVendas;
}
 public void setQuantVendas(int QuantVendas){
     this.QuantVendas = QuantVendas;
 }
 public double getComissao(){
         return Comissao;
}
 public void setComissao(double Comissao){
     this.Comissao = Comissao;
 }
 
public void setSalario(Double Salario){
     this.Salario = Salario;
 };
 
}
 

   

   
    