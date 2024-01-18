package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows][columns];
	}

	public synchronized int getRows() {
		return rows;
	}

	public synchronized void setRows(int rows) {
		this.rows = rows;
	}

	public synchronized int getColumns() {
		return columns;
	}

	public synchronized void setColumns(int columns) {
		this.columns = columns;
	}
	
	

	
}
