package td3;

public class Cell {

		private String string;
		
		private Cell next;

		public Cell(String s) {
			this.string = s;
		}

		public String getS() {
			return string;
		}

		public void setS(String s) {
			this.string = s;
		}

		public Cell getNext() {
			return next;
		}

		public void setNext(Cell next) {
			this.next = next;
		}
		
		

	
}
