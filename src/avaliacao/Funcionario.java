
package avaliacao;

/**
 *
 * @author Usuário
 */
public class Funcionario {
 
   private String Nome;
   private String CPF;
   private String Telefone;
   private Double Salario;
   
   public Funcionario(String Nome, String CPF, String Telefone){
   this.Nome = Nome;
   this.CPF = CPF;
   this.Telefone = Telefone;
   }
       
 public String getNome(){
         return Nome;
 
}
 public void setNome(String Nome){
     this.Nome = Nome;
 }

  public String getCPF(){
         return CPF;
 
}
 public void setCPF(String CPF){
     this.CPF = CPF;
 }

  public String getTelefone(){
         return Telefone;
 
}
 public void setTelefone(String Telefone){
     this.Telefone = Telefone;
 }
    public Double getSalario(){
            return this.Salario;
    }
    public void setSalario(Double Salario){
     this.Salario = Salario;
 }
    
    public String getDados(){
           return "Nome:" + this.getNome() + "\n Telefone" + this.getTelefone()+ "\n Salario:" +String.format("%.2f", this.getSalario());
 
}
}
