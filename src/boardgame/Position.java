package boardgame;

public class Position {
	private int row;
	private int column;

	public Position(int row, int column) {

		this.row = row;
		this.column = column;
	}

	public synchronized int getRow() {
		return row;
	}

	public synchronized void setRow(int row) {
		this.row = row;
	}

	public synchronized int getColumn() {
		return column;
	}

	public synchronized void setColumn(int column) {
		this.column = column;
	}

	@Override
	public String toString() {
		return row + " , " + column; 
	}
}
