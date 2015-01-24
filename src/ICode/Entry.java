package ICode;

public class Entry{
	private Object op;
	private Object arg1;
	private Object arg2;
	private Object result;

	public Entry(Object op,Object arg1,Object arg2,Object result){
		this.op=op;
		this.arg1=arg1;
		this.arg2=arg2;
		this.result=result;
	}

	public String toString(){
		return result+"="+arg1+" "+op+" "+arg2+"\n";
	}
}
