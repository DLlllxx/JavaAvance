package td3;
/***
 * 
 * @author Linxin
 *
 */

public class MyList {
	 //exo2 
	Cell premier = null;
	
	 
public Cell getPremier() {
		return premier;
	}
	public void setPremier(Cell premier) {
		this.premier = premier;
	}
/**
 * exo3
 * Ajoute une cellule contenant la String en parametre et¨ºte de liste	
 * @param s
 */
	 public void add(String s)
	 {
		 Cell newElement = new Cell(s);
		 if(premier == null)
		 {
			 premier = newElement;
		 }
		 else 
		 {
			 newElement.setNext(premier);
			 premier = newElement;
		 }
		 
	 }
/**
 * exo4
 * indique le nombre d'¨¦l¨¦ment de la liste
 * @return le size de la liste
 */

	 public int size()
	 {
		 int size = 0;
		 Cell tmpCell = premier;
		 while(tmpCell != null)
		 {
			 size++;
			 tmpCell=tmpCell.getNext();
		 }
		 return size;
	 }
/**
 * exo5
 * @return toString
 */
	 @Override
	 public String toString()

	 {
		 Cell tmpCell = premier;
		 if(tmpCell == null)
		 {
			System.out.println("LIste null");
		 }
		 while(tmpCell !=null)
		 {
			 System.out.print(tmpCell.getS()+" ");
			 tmpCell=tmpCell.getNext();
		 }
		 System.out.println();
		 
		 return super.toString();
	 }

/**
 * exo6
 * Ajoute une nouvelle cellule ¨¤ la fin de la liste 
 * @param s
 */
	 public void addLast(String s)
	 {   
		 Cell newCell = new Cell(s);
		 if(premier==null)
		 {
			 premier = newCell;
		 }
		 else {
			 Cell tmpCell = premier; 
		 while(tmpCell.getNext()!=null)
		 {
			 tmpCell=tmpCell.getNext();
		 }
		 tmpCell.setNext(newCell);
	 }
	 }
/**
 * exo7
 * 	 Ajoute une nouvelle cellule apr¨¨s la cellule d'indice i
 * @param s
 * @param i
 */
	 public void add(String s,int i)
	 {
		 Cell newCell=new Cell(s);
		 if(i<0 || i> size())
		 {
			 System.out.println("index out of range!");
		 }
		 if(i==0)
		 {
			 add(s);
		 }
		 else
		 {
			 Cell cPrevious = getCell(i-1);
				Cell cNext = getCell(i);
				
				newCell.setNext(cNext);
				cPrevious.setNext(newCell);
				
		 }
	 }
	 
/***
 * exo9
* @param index
* @return the cell of the index indicated in the parameter
*/
		public Cell getCell(int index) {
			Cell c = this.premier.getNext();
			for (int i = 0; i < index; i++) {
				c = c.getNext();
			}
			return c;
		}

}
