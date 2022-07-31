package dio.colecoes_java.Lista.set;

import java.util.*;

public class ExPropSet2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pychrm"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "Intellij"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "VS Code"));

        System.out.println("------\tOrde de inserçao\t---------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(Arrays.asList(
                new LinguagemFavorita("Python", 1991, "Pycharm"),
                new LinguagemFavorita("JavaScript", 1995, "Intellij"),
                new LinguagemFavorita("Java", 1991, "VS Code")
                )
        );
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas1) System.out.println(linguagem);

        System.out.println("----------\tOrdem Natural: Nome\t----------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas2) System.out.println(linguagem);

        System.out.println("----------\tOrdem IDE\t------------------");
        Set<LinguagemFavorita> minhasLiguagensFavoritas3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        minhasLiguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem: minhasLiguagensFavoritas3) System.out.println(linguagem);

        System.out.println("-----\tOrdem Ano de Criaçao e Nome\t_______");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 =
                new TreeSet<LinguagemFavorita>(new ComparatorACN());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas4) System.out.println(linguagem);

        System.out.println("--------\tOrdem Nome - Ano de Criaçao - IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorACNIDE());
        minhasLinguagensFavoritas5.addAll(minhasLiguagensFavoritas3);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas5) System.out.println(linguagem);

    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    public String nome;
    public Integer anoDeCriacao;
    public String ide;



    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide){
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita){
        return this.nome.compareTo(linguagemFavorita.nome);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita f1, LinguagemFavorita f2){
        return f1.nome.compareToIgnoreCase(f2.nome);
    }
}

class ComparatorACN implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita f1, LinguagemFavorita f2){
        int anoDeCriacao = Integer.compare(f1.anoDeCriacao, f2.anoDeCriacao);
        if (anoDeCriacao != 0) return  anoDeCriacao;
        return  f1.nome.compareToIgnoreCase(f2.nome);
    }
}
class ComparatorACNIDE implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita f1, LinguagemFavorita f2){
        int nome = f1.nome.compareToIgnoreCase(f2.nome);
        int anoDeCriacao = Integer.compare(f1.anoDeCriacao, f2.anoDeCriacao);
        if (nome != 0) return  nome;
        if (anoDeCriacao != 0) return  anoDeCriacao;
        return  f1.ide.compareToIgnoreCase(f2.ide);
    }
}