package list;

/**
 * Kelas ListQuotes untuk list data yang menyimpan quotes dan index berikutnya
 * * @author Muammar Zikri Aksana * @version 1.0 * @since 2019-Mar-20
 */
public class NodeList {
	private Quotes quotes;
	private NodeList next;

	/**
	 * Constructor
	 * 
	 * @param quotes
	 * @param next
	 */
	public NodeList(Quotes quotes, NodeList next) {
		this.setQuotes(quotes);
		this.setNext(next);
	}

	/**
	 * Method untuk memeberikan nilai list sebelumnya pada atribute next
	 * 
	 * @param next
	 */
	public void setNext(NodeList next) {
		this.next = next;
	}

	/**
	 * Method untuk memeberikan nilai pada atribute quotes
	 * 
	 * @param quotes
	 */
	public void setQuotes(Quotes quotes) {
		this.quotes = quotes;
	}

	/**
	 * Method untuk mengambil isi list
	 * 
	 * @return Quotes
	 * @see Quotes
	 */
	public Quotes getQuotes() {
		return quotes;
	}

	/**
	 * Method ini digunakan untuk mengambil data selanjutnya dari list
	 * 
	 * @return mengembalikan nilai list selanjutnya
	 * @see NodeList
	 */
	public NodeList getNext() {
		if (this.hasNext())
			return next;
		return null;
	}

	/**
	 * Method ini digunakan untuk mengetahui apakah terdapat data berikutnya pada
	 * list
	 * 
	 * @return true jika masih ada data selanjutnya dari list
	 */
	private boolean hasNext() {
		return this.next != null;
	}
}