package ICode;

public class TempAddress extends Address{
	private static int num;

	public TempAddress(){
		num++;
	}

	public String str(){
		return "t"+num;
	}
}
