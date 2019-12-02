/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;



import java.util.ArrayList;

public class Dados {
    ArrayList <Contato> contatos = new ArrayList();
    
    public void cadastrarContatos(Contato contato){
        contatos.add(contato);
    }
    
    public String numeroContatos(){
        return contatos.size() + " ";
    }

 
    
    
    
}
