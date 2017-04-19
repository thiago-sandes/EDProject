/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edproject;

/**
 *Classe abstrata, pai da classe Medico e da classe Paciente, cria atributos 
 * comum aos dois objetos, Paciente e Medico.
 * 
 * @author Thiago Sandes e André Biriba
 * @version 1.0 
 * @since entrega de projeto da materia de POO 18/04/2017
 */
public abstract class Agente {

    /**
     *nome String - protegido para poder ser utilizado nas subclasses   
     */
    protected String nome;
    
     /** Construtor da classe Agente que requer parametros
     *   @param name String -  nome do agente
     */
    public Agente(String name){
        nome = name;
    }
    
    /** Metodo Construtor da classe Agente, nao requer parametros */
    public Agente(){
    
    }
    
     /** Metodo para retorno do nome do agente
     *   @return String - nome do agente */
    public String getNome() {
        return nome;
    }
    
 /** Metodo para modificar nome do agente 
     *   @param nome String - novo nome do agente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**Metodo imprime para exemplificar polimorfismo de sobrecarga  */
    public abstract void imprime();
    
    
}
