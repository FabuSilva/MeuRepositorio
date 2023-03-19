package singleton;

public class SingletonLazyHolder {
	
	private static class HolderInstancer{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstacia() {
		return HolderInstancer.instancia;
	}

}
