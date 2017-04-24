/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edproject;

import javax.swing.JOptionPane;

/**
 *Responsavel pelos metodos e atributos do agendamento de consultas 
 * 
 * @author Thiago Sandes e André Biriba
 * @version 1.0
 * @since entrega de projeto da materia Estrutura de Dados.
 */
public class Consulta {
    private String nomeMedico;
    private String nomePaciente;
    private String cpfPaciente;
    private int horario;
    
     /** Construtor vazio da classe Consulta */
    public Consulta(){
        
    }
    
     /** Construtor da classe Consulta
     * @param nomeMedico String - nome do medico determinado
     * @param cpfPaciente String - cpf do paciente determinado
     * @param nomePaciente String - nome do paciente determinado
     * @param horario int - horario da consulta
     */
    public Consulta(String nomeMedico, String cpfPaciente, String nomePaciente, int horario){
        this.nomeMedico = nomeMedico;
        this.nomePaciente = nomePaciente;
        this.cpfPaciente = cpfPaciente;
        this.horario = horario;
    }
    
     /** Metodo para retorno do nome do medico
     *   @return String - nome do medico */    
    public String getNomeMedico(){
        return this.nomeMedico;
    }
    
     /** Metodo para modificar nome do medico
     *   @param nome String - novo nome do medico
     */    
    public void setNomeMedico(String nome){
        nomeMedico = nome;
    }
    
     /** metodo para retorno do nome do paciente
     *   @return String - nome do paciente */      
    public String getNomePaciente(){
        return this.nomePaciente;
    }

     /** Metodo para modificar nome do paciente
     *   @param nome String - novo nome do paciente
     */    
    public void setNomePaciente(String nome){
        nomePaciente = nome;
    }
    
     /** Metodo para retorno do cpf do paciente
     *   @return String - cpf do paciente */      
          public String getCpfPaciente(){
        return this.cpfPaciente;
    }

     /** Metodo para modifiicar cpf do paciente
     *   @param cpf String - novo cpf do paciente
     */    
    public void setCpfPaciente(String cpf){
        cpfPaciente = cpf;
    }
    
     /** Metodo para retorno do nome do horario da consulta
     *   @return int - horario */          
    public int getHorario(){
        return horario;
    }

     /** Metodo para modifiicar horario da consulta
     *   @param horario int - novo cpf do paciente
     */        
    public void setHorario(int horario){
        this.horario = horario;
    }
    
    
     /**Metodo para imprimir dados da consulta, nome do paciente,cpf do paciente, nome do medico e horario       */
    public void imprime(){
        JOptionPane.showMessageDialog(null,"\n Dados da consulta \n\n" + "Nome do paciente: " + getNomePaciente() + "\n" + "Cpf do paciente: " + getCpfPaciente() + "\n" + "Nome do medico: " + getNomeMedico() + "\n" + "Horario da consulta: " + getHorario() + "h\n\n" ,"Alerta!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
     /** Metodo que imprime as string solicitadas pelo comando return. Sao impressos o nome do paciente, cpf do paciente,
     * nome do medico e horario da consulta  
     */     
    public String toString(){
        //[Linux]    return  getNomePaciente() + "\n" + getCpfPaciente() + "\n"  + getNomeMedico() + "\n" +  getHorario()+ "h" + "\n\n";
        return  getNomePaciente() + "\r\n" + getCpfPaciente() + "\r\n"  + getNomeMedico() + "\r\n" +  getHorario() + "\r\n\r\n";
        
        
    }
}
