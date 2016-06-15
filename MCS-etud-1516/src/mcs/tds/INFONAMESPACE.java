package mcs.tds;


public class INFONAMESPACE implements INFO {
	
	private TDS tds;

	public INFONAMESPACE(TDS tds) {
		this.tds = tds;
	}
	
	public TDS getTds() {
		return this.tds;
	}

}
