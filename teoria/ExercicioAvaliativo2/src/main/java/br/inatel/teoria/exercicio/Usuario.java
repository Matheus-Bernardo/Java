package br.inatel.teoria.exercicio;
import java.util.ArrayList;

public class Usuario {

    private String nome;
    private String email;


    //lista de redes sociais do usuario
    RedeSocial[] redesSociaisUsuarios = new RedeSocial[2];

    //Ao criar um usuario juntamente cria uma rede social
    public Usuario(RedeSocial redeSociais,RedeSocial redeSociais2) {
        //verificação pré acréscimo de redeSocial ao usuario
        for (int i = 0; i < redesSociaisUsuarios.length ; i++) {
            if (redesSociaisUsuarios[i] == null){
                redesSociaisUsuarios[i] = redeSociais;
                redesSociaisUsuarios[i+1] = redeSociais2;
                break;
            }
        }
    }


    //getter e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
