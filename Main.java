public class Main
{
	public static void main(String[] args) {
		
		Rpg pessoa = new Rpg();
		pessoa.nome = "Coadjuvante";
		pessoa.idade = 17;
		pessoa.forca = 5;
		pessoa.vida = 10;
		pessoa.nivel = 1;
		pessoa.passos = 3;
		pessoa.inicial();
		pessoa.dungeon();
		pessoa.encontro();
		pessoa.batalha();
	}
}
