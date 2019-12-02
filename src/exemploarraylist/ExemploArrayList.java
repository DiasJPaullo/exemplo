package exemploarraylist;

import java.util.ArrayList;

public class ExemploArrayList {

    public static void main(String[] args) {
        //ArrayList contatos = new ArrayList(); 
        // ArrayList <String> contatos = new ArrayList();
        ArrayList <Contato> contatos = new ArrayList();
        
        Contato contato  = new Contato("João Paullo","joaopaullo@gmail.com","996036729");
        Contato contato1 = new Contato("Jose Dias","josedias@gmail.com","996000000");
        Contato contato2 = new Contato("Maria Aparecida","mariaAp@gmail.com","9900000099");
        Contato contato3 = new Contato("Ana Paula","anapaula@gmail.com","8888036729");
        
        contatos.add(contato);
        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        
        for(Contato c : contatos){       // for pecorre o Array contatos e joca na 
            System.out.println(c);       // variavel nome
            
        }
        System.out.println("Total de itens: " + contatos.size());
        contatos.remove(contato2);
        System.out.println(contatos.contains(contato2));
    }
    
}
