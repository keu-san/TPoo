/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho02.modelo;

/**
 *
 * @author Danilo Medeiros Eler
 */
public class Aluno extends Usuario {
    protected String curso;
    protected int ano;
    
    public Aluno(String codUsuario, String nome, String curso, int ano, int dias) {
        super(codUsuario, nome, dias); //emprestimo por X dias
        this.curso = curso;
        this.ano = ano;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public int getAno(){
        return ano;
    }
}
