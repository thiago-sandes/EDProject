/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edproject;

import javax.swing.JOptionPane;

/**
 *Filha da classe Agente,
 * responsavel pelos metodos e atrbutos dos medicos.
 * 
 * @author Thiago Sandes e André Biriba
 * @version 1.0
 * @since entrega de projeto na materia de POO 18/04/2017
 */
public class Medico extends Agente {
    private String especialidade;

      /** Construtor da classe Medico e requer parametros e chama o construtor da classe Agente?
     *   @param nomeMedico String -  nome do medico
     *   @param especialidade String - especialidade do medico
     */   
    public Medico(String nomeMedico, String especialidade) {
        super(nomeMedico);
        this.especialidade = especialidade;
    }

    /** Construtor da classe Medico, nao requer parametros   */
    public Medico() {
        
    }

     /** Metodo para retorno da especialidade do medico
     *   @return String - especialidade do medico */    
    public String getEspecialidade() {
        return especialidade;
    }

 /** Metodo para modificar especialidade do medico
     *   @param especialidade String - nova especialidade medica
     */    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
   /** Metodo para imprimir dados do medico, nome e especialidade (polimorfismo de sobrecarga)   */ 
    public void imprime(){
        JOptionPane.showMessageDialog(null, "[Dados do medico] \n\n" + "Nome do medico: " + getNome() + "\nEspecialidade: " + getEspecialidade() + "\n" , "Sistema de clínicas!", JOptionPane.INFORMATION_MESSAGE);   
    }
    
     /** Metodo que imprime as string solicitadas pelo comando return. Sao impressos o nome do medico
      * e sua esecialidade respectivamente   (polimorfismo de sobrecarga)  
*/ 
 public String toString(){
        //[Linux]  return getNome() + "\n" + getEspecialidade() + "\n\n";   
        return getNome() + "\r\n" + getEspecialidade() + "\r\n\r\n";   
    
    }
     
}
