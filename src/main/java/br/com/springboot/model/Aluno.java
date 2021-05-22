package br.com.springboot.model;

public class Aluno  {

   private Long id;
   private String nome_professor;
   private int matricula;

   public Aluno(Long id,String nome,int matricula){
       this.id = id;
       this.nome_professor = nome;
       this.matricula = matricula;
   }

   public Long getId(){
       return this.id;
   }

   public String getNome(){
       return this.nome_professor;
   }

   public int getMatricula(){
       return this.matricula;
   }

   public void setId(Long novoId){
       this.id = novoId;
   }

   public void setNome(String novoNome){
       this.nome_professor = novoNome;
   }

   public void setMatricula(int novaMatricula){
       this.matricula = novaMatricula;
   }

   @Override
   public String toString(){
       String saida = "ID : "+this.id+System.lineSeparator()+"Nome: "+ this.nome_professor + System.lineSeparator()+"Matricula: "+this.matricula+System.lineSeparator();
       
   return saida;

   }
    
}
