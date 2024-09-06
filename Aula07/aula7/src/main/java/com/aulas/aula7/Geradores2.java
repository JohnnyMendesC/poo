package com.aulas.aula7;

        import java.security.SecureRandom;

        public class Geradores2 {
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
        }     
