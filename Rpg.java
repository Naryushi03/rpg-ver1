public class Rpg{
    String nome, monstro;
    int idade, forca, passos, nivel, andar, vida;
    float forca2, vida2, nivel2;
    
    public void inicial(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Nivel: "+nivel);
        System.out.println("Vida: "+vida);
        System.out.println("Força: "+forca+"\n");
    }
    
    public void dungeon(){
        System.out.println("Primeira vez em uma dungeon");
        System.out.println("Andou "+passos+" passos\n");
    }
    
    public void encontro(){
        monstro = "Slime vermelho(rara variante)";
        forca2 = 3;
        vida2 = 11;
        nivel2 = 4;
        System.out.println("Se deparou com um monstro");
        System.out.println("Nome: "+monstro);
        System.out.println("Nivel: "+nivel2);
        System.out.println("Vida: "+vida2);
        System.out.println("Força: "+forca2+"\n");
    }
    
    public void batalha(){
        while (vida > 0){
             System.out.println(nome+" atacou o "+monstro);
             vida2 -= forca;
             System.out.println(nome+" deu "+forca+" de dano no "+ monstro);
             System.out.println(monstro+" = "+vida2+" vida\n");
             if (vida2 < 0){
                 break;
             }
             System.out.println(monstro+" atacou o "+nome);
             vida -= forca2;
             System.out.println(monstro+" deu "+forca2+" de dano no "+ nome);
             System.out.println(nome+" = "+vida+" vida\n");
        }
        if (vida2 > 0 ){
            System.out.println(monstro+" te matou");
        } else {
            System.out.println(nome+" matou o "+monstro);
            System.out.println(nome+" subiu de Nivel");
            nivel++;
            System.out.println("Nivel: "+nivel);
        }
    }
}
