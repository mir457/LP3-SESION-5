package ACT_3;

public class IgualGenerico{
	public <T> boolean esIgualA(T a, T b) {
		if(a==null && b== null) return true;
		if(a==null && b!= null) return false;
		if(a!=null && b== null) return false;
		return a.equals(b);
	}
	
	public static void main(String[] args) {
		IgualGenerico a = new IgualGenerico();
		
		Object b = new Object();
		Object c = new Object();
		
		System.out.println(a.esIgualA(null, 5));
		System.out.println(a.esIgualA("hola", "como"));
		System.out.println(a.esIgualA(6, 6));
		System.out.println(a.esIgualA(b,c));
	}
}

