/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edproject;

import javax.swing.JOptionPane;

/**
 **Filha da classe Agente, responsavel pelos metodos e atrbutos dos pacientes.
 *  
 * @author Thiago Sandes e André Biriba
 * @version 1.0
 * @since entrega de projeto na materia de POO 18/04/2017
 */
public class Paciente extends Agente {
    private String cpf;
    private String telefone; 
    
      /** Construtor da classe Paciente e requer parametros e chama o construtor da classe Agente?
       * @param parNome String - nome do paciente
     *   @param parCpf String -  cpf do paciente
     *   @param parTelefone String - numero de telefone
     */      
    public Paciente(String parNome, String parCpf, String parTelefone){
        super(parNome);
        cpf = parCpf;
        telefone = parTelefone;
    }

    /** Construtor da classe paciente, nao requer parametros   */
    public Paciente() {
         
    }


     /** Metodo para retorno do cpf do paciente
     *   @return String - cpf do paciente */       
    public String getCpf(){
        return cpf;
    }

 /** Metodo para modificar cpf do paciente
     *   @param cpf String - novo cpf do paciente
     */     
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
     /** Metodo para retorno do numero de telefone do paciente
     *   @return String - telefone do paciente */      
    public String getTelefone(){
        return telefone;
    }
    
 /** Metodo para modificar telefone do paciente
     *   @param telefone String - novo numero de telefone do paciente
     */      
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
   /** Metodo para imprimir dados do paciente, nome, cpf e telefone (polimorfismo de sobrecarga)    */ 
    public void imprime(){
        JOptionPane.showMessageDialog(null, "\n[Dados do paciente] \n\n" + "Nome do paciente: " + getNome()+ "\nCpf: " + cpf + "\nTelefone: " + telefone + "\n" ,"Sistema de clínica!", JOptionPane.INFORMATION_MESSAGE);        
    }
    
    /** Metodo que imprime as string solicitadas pelo comando return. Sao impressos o nome do paciente, seu cpf
     * e telefone respectivamente  (polimorfismo de sobrecarga)  */  
    public String toString(){
        //[Linux] return  getNome()+ "\n" + getCpf() + "\n" + getTelefone() + "\n\n";        
    
        return  getNome()+ "\r\n" + getCpf() + "\r\n" + getTelefone() + "\r\n\r\n";        
    }
}
