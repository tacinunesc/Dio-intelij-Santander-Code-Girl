package br.com.dio.gato;

import java.util.Objects;

public class gato {

    public static class Gato {
        private String nome;
        private String cor;
        private Integer idade;

        public Gato() {
        }

        public Gato(String nome, String cor, Integer idade) {

            this.nome = nome;
            this.cor = cor;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public Integer getIdade() {
            return idade;
        }

        public void setIdade(Integer idade) {
            this.idade = idade;
        }

        @Override
        public int hashCode() {
            return Objects.hash(cor, idade, nome);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null)
                return false;
            if (getClass() != o.getClass())
                return false;
            Gato other = (Gato) o;
            return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
        }

        @Override
        public String toString() {
            return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
        }

	/*public Gato(String nome, String cor,Integer idade) {
		this.nome=nome;
		this.cor=cor;
		this.idade=idade;

				}*/


    }
}