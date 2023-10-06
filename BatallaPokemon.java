package pokemon;


public class BatallaPokemon {
    public static void main(String[]args){
    PokemonTipo pokemon1 = new PokemonTipo("Mewtwo",10,"Psiquico");
    PokemonTipo pokemon2 = new PokemonTipo("Raikou",10,"Electrico");
    
    realizarAtaque(pokemon1,pokemon2,"punio dinamico");
    realizarAtaque(pokemon2,pokemon1,"chispazo");
    
    
    System.out.println(pokemon1.getNombre()+"tiene ahora" + pokemon1.getHP() + "tiene puntos de vida");
            }
    
    
    public static void realizarAtaque(Pokemon atacante,Pokemon objetivo, String ataque){
    
    int danio = calcularDanio(ataque);
    int puntosDeVidaObjetivo = objetivo.getHP()
puntosDeVidaObjetivo = danio
                    objetivo.setHP(puntosDeVidaObjetivo);
    System.out.pritnln(atacante.getNombre() + "ataca a" + objetivo.getNombre()+ "con" + ataque + "y causa" + danio + "putos de danio");}
public static int calcularDanio(String ataque) {
        
    
        return 1;
    }
}
}
