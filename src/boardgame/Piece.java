package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;	
	
	public Piece(Board board) {
		this.board = board;
		position = null; // quando instanciada a classe a peça não recebe sua posição
	}

	protected Board getBoard() { // somente o pacote boardgame pode acessar esse método
		return board;
	}

	
	
	
	
	
	

}
