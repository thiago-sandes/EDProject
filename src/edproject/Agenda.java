/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edproject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 * Que implementa a classe Interface, cria objetos do tipo Paciente, Medico
 * e Consulta, armazenando medicos em um arraylist e pacientes e consultas em um HashMap.
 * Nesta classe estao os metodos que permitem adicionar, remover e listar pacientes,
 * medicos e consultas.
 * 
 * @author Thiago Sandes e André Biriba
 * @version 1.0
 * @since entrega de projeto da materia de POO 18/04/2017
 */
public class Agenda implements Interface{
    private Paciente paciente;
    private Medico medico;
    private Consulta consulta;
    private ArrayList<Medico> medicos;
    private HashMap<String,Paciente> pacientes; // Instanciar no construtor!
    private HashMap<String,Consulta> consultas;
    private JFrame quadro;
    
    /** Construtor da classe Agenda sem parametros para criaçao de objetos,
     * Os objetos sao Medico, Paciente, Consulta, Respectivamente
     * as estruturas para armazenar estes objetos sao ArrayList,HashMap, HashMap.
    */
    public Agenda(){
        paciente = new Paciente();
        medico = new Medico();
        consulta = new Consulta();
        medicos = new ArrayList<Medico>();
        pacientes = new HashMap<String,Paciente>(2, 1);
        consultas = new HashMap<String,Consulta>(2, 1); // A chave é o nome do paciente
    }
    
    
    /** Metodo para adicionar objetos do tipo medico no ArrayList medicos
     * @param medico Medico - nome e especialidade
    */
    public void addMedicos(Medico medico){
        medicos.add(medico);
    }
    
    /** Metodo para remover objetos do tipo medico no ArrayList medicos
     * @param medico Medico - nome 
    */
    public void removeMedicos(Medico medico){
        medicos.remove(medico);
    }
    
    /** Metodo para imprimir todos os objetos do tipo medico e suas caracteristicas do ArrayList medicos
    */
    public void listarTodosMedicos(){
        Iterator<Medico> medicoIterator = medicos.iterator();;
        
        if(medicos.isEmpty())
            JOptionPane.showMessageDialog(quadro,"\nNão há médicos cadastrados.\n","Alerta!", JOptionPane.INFORMATION_MESSAGE);
        
        while(medicoIterator.hasNext()){
            medicoIterator.next().imprime();
        }
        
    }
    
     /** Metodo para salvar todos os objetos do tipo medico do ArrayList
      * @return medicos - objetos medico com seus nomes e especialidades
    */
    public String salvarTodosMedicos(){
        Iterator<Medico> medicoIterator = medicos.iterator();;
        String medicos = "";
        
        while(medicoIterator.hasNext()){
            medicos +=  medicoIterator.next().toString();
        }
        
        
        if(medicos == null)
            return "\r\n\r\n";
        return medicos;
    }
    
     /** Metodo para imprimir um objeto medico e suas caracteristicas se ele existir
     * @param nome String - nome do medico a ser imprimido
     * @return boolean
    */
    public boolean listarMedicoPorNome(String nome){
        int i;
        boolean flagAux = false;
        
        for (i = 0; i < medicos.size(); i++){
            if(nome.equals(medicos.get(i).getNome())){
                medicos.get(i).imprime();
                flagAux = true;
                return true;
            }

        }
        
        if(flagAux!=true){
            JOptionPane.showMessageDialog(quadro,"\nMédico não encontrado.\n","Sistema de Clínicas!", JOptionPane.INFORMATION_MESSAGE);
        }
        return false;
    }
    

     /** Metodo para remover um objeto medico e suas caracteristicas se ele existir
     * @param nome String - nome do medico a ser removido
    */
    public void removerMedicoPorNome(String nome){
        int i;
        boolean flagAux = false;
        for (i = 0; i < medicos.size(); i++){
            if(nome.equals(medicos.get(i).getNome())){
                medicos.remove(i);
                JOptionPane.showMessageDialog(quadro,"\nMédico removido com sucesso.\n","Sistema de Clínicas!", JOptionPane.INFORMATION_MESSAGE);
                flagAux = true;
            }

        }
        
        if(flagAux!=true){
            JOptionPane.showMessageDialog(quadro,"\nMédico não encontrado.\n","Sistema de Clínicas!", JOptionPane.INFORMATION_MESSAGE); 
        }
    }
    
    /** Metodo para adicionar um objeto paciente o tipo Paciente e suas caracteristicas no HashMap pacientes
     * @param cpf String - numero de cpf
     * @param paciente Paciente- nome, telefone
    */
    public void addPacientes(String cpf, Paciente paciente){
            pacientes.put(cpf, paciente);      
    }
    
    
       /** Metodo para remover um objeto Paciente e suas caracteristicas se existir 
     * @param cpf String - numero de cpf
    */
    public void removerPacientePorCpf(String cpf){ 
        boolean flagAux = false;
        
        try{
            if(cpf.equals(pacientes.get(cpf).getCpf())){
                pacientes.remove(cpf);
                JOptionPane.showMessageDialog(quadro,"\nPaciente removido com sucesso.\n","Sistema de Clínicas!", JOptionPane.INFORMATION_MESSAGE);
 
                flagAux = true;
            }
        }catch(Exception e){
            if(flagAux != true){
                JOptionPane.showMessageDialog(quadro,"\nPaciente não está cadastrado ou seu cpf está errado.\n","Sistema de Clínicas!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        
                            
    }
       /** Metodo para imprimir na tela um objeto Paciente e suas caracteristicas se existir
     * @param cpf String - numero de cpf
     * @return boolean
    */
    public boolean listarPacientePorCpf(String cpf){
        boolean flagAux = false;
       
        try{
            if(cpf.equals(pacientes.get(cpf).getCpf())){  
                pacientes.get(cpf).imprime();
                flagAux = true;
                return flagAux;
            }
            
            if(!cpf.equals(pacientes.get(cpf).getCpf())){                              
                JOptionPane.showMessageDialog(quadro,"\nPaciente não encontrado.\n","Alerta!", JOptionPane.INFORMATION_MESSAGE);
                return flagAux;
            }
        }catch(NullPointerException e){
            if(flagAux!=true){
                JOptionPane.showMessageDialog(quadro,"\nPaciente não encontrado.\n","Alerta!", JOptionPane.INFORMATION_MESSAGE);
           }
        }
        
        return false;
    }
    
    /** Metodo para imprimir na tela um objeto Paciente e suas caracteristicas se existirem
    */
    public void listarTodosPacientes(){
        if(pacientes.isEmpty())
            JOptionPane.showMessageDialog(quadro,"\nNão há pacientes cadastrados.\n","Alerta!", JOptionPane.INFORMATION_MESSAGE);
        
        for (Map.Entry<String,Paciente> entrada : pacientes.entrySet()) {
                entrada.getValue().imprime();
        }
    }
    
    /** Metodo para salvar todos os objetos pacientes do tipo Paciente e suas caracteristicas
     * @return stringPacientes - nome, cpf e telefone de todos os objetos paciente
    */
    public String salvarTodosPacientes(){
        String stringPacientes = "";
        
        for (Map.Entry<String,Paciente> entrada : pacientes.entrySet()) {
                stringPacientes += entrada.getValue().toString();
        }

        if(stringPacientes == null)
            return "\r\n\r\n";
        return stringPacientes;
    }
    
     /** Metodo para retorno do nome de pacientes do HashMap pacientes
      * @param cpf String - cpf do paciente
     *   @return String - cpf e nome de pacientes
     */
    public String getNomeHashPacientes(String cpf){
        return pacientes.get(cpf).getNome();
    }
    
    
     /** Metodo para adicionar consultas no HashMap consultas
     *@param cpf String - cpf 
     * @param consulta Consulta - objeto
     */
    public void addConsulta(String cpf, Consulta consulta){
            consultas.put(cpf, consulta);      
    }
    
    
    /** Metodo para remover consultas no HashMap consultas pelo cpf do paciente
     *@param cpf String - cpf 
     */
    public void removerConsultaPorPaciente(String cpf){ // Falta revisar código. 
        boolean flagAux = false;
        
        try{
            if(cpf.equals(consultas.get(cpf).getCpfPaciente())){
                consultas.remove(cpf);
                JOptionPane.showMessageDialog(quadro,"\nConsulta removida com sucesso!\n","Alerta!", JOptionPane.INFORMATION_MESSAGE);
                flagAux = true;
            }
        }catch(NullPointerException e){
            if(flagAux != true){
                JOptionPane.showMessageDialog(quadro,"\nConsulta não está cadastrada ou o nome do paciente está errado.\n","Alerta!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    }
    
    /** Metodo para listar todas as consultas de um determinado paciente
     *@param cpf String - cpf do paciente
     * @return boolean value
     */
    public boolean listarConsultaPorPaciente(String cpf){
        boolean flagAux = false;
       
        try{
            for (Map.Entry<String,Consulta> entrada : consultas.entrySet()) {
                if(cpf.equals(consultas.get(cpf).getCpfPaciente())){
                    JOptionPane.showMessageDialog(quadro,"\nConsulta encontrada!\n","Alerta!", JOptionPane.INFORMATION_MESSAGE);
                    entrada.getValue().imprime();
                    flagAux = true;
                    return flagAux;
                }
            }
            if(!cpf.equals(consultas.get(cpf).getCpfPaciente())){
                JOptionPane.showMessageDialog(quadro,"\nConsulta não encontrada.\n","Alerta!", JOptionPane.INFORMATION_MESSAGE);
                return flagAux;
            }        
        }catch(NullPointerException e){
            if(flagAux!=true){
                JOptionPane.showMessageDialog(quadro,"\nConsulta não encontrada.\n","Alerta!", JOptionPane.INFORMATION_MESSAGE);
                return flagAux;
            }
        }
        
        if(cpf.equals("") && flagAux!= true){
            JOptionPane.showMessageDialog(quadro,"\nConsulta não encontrada.\n","Alerta!", JOptionPane.INFORMATION_MESSAGE);
                
        }
        return false;
    }
    /** Metodo para listar todas as consultas de todos os pacientes
     */
    public void listarTodasConsultas(){
        if(consultas.isEmpty())
            JOptionPane.showMessageDialog(quadro,"\nNão há consultas marcadas.\n","Alerta!", JOptionPane.INFORMATION_MESSAGE);
        
        for (Map.Entry<String,Consulta> entrada : consultas.entrySet()) {
                entrada.getValue().imprime();
        }
    }
    
    /** Metodo para salvar todas as consultas 
     * @return stringConsultas - nome do paciente, cpf do paciente , nome do medico, horario da consulta
     */
    public String salvarTodasConsultas(){
        String stringConsultas = "";
        for (Map.Entry<String,Consulta> entrada : consultas.entrySet()) {
                stringConsultas += entrada.getValue().toString();
        }
        
        
        if(stringConsultas == null)
            return "\r\n\r\n";
        return stringConsultas;
    }
    
   /** Metodo implementado da classe Interface para pausar a execuçao atual
    * no tempo expecificado em nanosegundos.
     *@param parametro int - tempo em nanosegundos
     */
        public void delay(int parametro){ 
        try {       
            Thread.sleep((1000*parametro));
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
    

