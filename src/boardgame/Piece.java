package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;	
	
	public Piece(Board board) {
		this.board = board;
		position = null; // quando instanciada a classe a pe�a n�o recebe sua posi��o
	}

	protected Board getBoard() { // somente o pacote boardgame pode acessar esse m�todo
		return board;
	}

	
	
	
	
	
	

}
