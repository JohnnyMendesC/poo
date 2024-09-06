package com.aulas.aula7;

import java.util.Random;

public class Geradores {

    public static String geradorDeLetra(){         

        Random aleatorio = new Random();
        String gerada = "";
        
        for (int i = 0; i < 12; i++) {            
            int gerador = aleatorio.nextInt(26)+1;
        
            switch (gerador) {
                case 1:
                gerada+="a";
                break;
                case 2:
                gerada+="b";
                break;
                case 3:
                gerada+="c";
                break;
                case 4:
                gerada+="d";
                break;
                case 5:
                gerada+="e";
                break;
                case 6:
                gerada+="f";
                break;
                case 7:
                gerada+="g";
                break;
                case 8:
                gerada+="h";
                break;
                case 9:
                gerada+="i";
                break;
                case 10:
                gerada+="j";
                break;
                case 11:
                gerada+="k";
                break;
                case 12:
                gerada+="l";
                break;
                case 13:
                gerada+="m";
                break;
                case 14:
                gerada+="n";
                break;
                case 15:
                gerada+="o";
                break;
                case 16:
                gerada+="p";
                break;
                case 17:
                gerada+="q";
                break;
                case 18:
                gerada+="r";
                break;
                case 19:
                gerada+="s";
                break;
                case 20:
                gerada+="t";
                break;
                case 21:
                gerada+="u";
                break;
                case 22:
                gerada+="v";
                break;
                case 23:
                gerada+="w";
                break;
                case 24:
                gerada+="x";
                break;
                case 25:
                gerada+="y";
                break;
                case 26:
                gerada+="z";
                break;
            }
            /*Solução alternativa:
            import java.security.SecureRandom;

        public class GeradorDeSenha {
            private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            private static final int TAMANHO_SENHA = 8;
            private static final SecureRandom random = new SecureRandom();

            public static String gerarSenha() {
                StringBuilder senha = new StringBuilder(TAMANHO_SENHA);
                for (int i = 0; i < TAMANHO_SENHA; i++) {
                    int index = random.nextInt(CARACTERES.length());
                    senha.append(CARACTERES.charAt(index));
                }
                return senha.toString();
            }

            public static void main(String[] args) {
                String senhaAleatoria = gerarSenha();
                System.out.println("Senha gerada: " + senhaAleatoria);
            }
        } */
        
        }
        return gerada;
    }

/*
    public String geradorDeSenhaTemp(){  
        

        this.senha = geradorDeLetra();
        
        return senha;
        /*String senha="";
        //gera caracteres aleatórios até 8 digitos
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            str.append(senha);
        }
    }
    get*/

}
