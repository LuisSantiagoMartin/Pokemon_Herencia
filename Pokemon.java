package pokemon;

public class Pokemon {
private int HP;
private int nivel;
private String nombre;
private String tipo;

public Pokemon(String Nombre, String Tipo, int nivel){
this.HP = 100;
this.nombre = nombre;
this.tipo = tipo;
this.nivel = nivel;
}

public int getHP(){
return HP;}

public int getNivel(){
return nivel;}

public String getNombre(){
return nombre;}

public String getTipo(){
return tipo;}

  
   public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
