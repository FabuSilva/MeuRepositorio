package teste;

import Facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {
    	System.out.println("Padrão: SINGLETON");
    	System.out.println("Verificando se as instancias da classe SingletonLazy "
    			+ "\ncontém os mesmos endereços de memoria.");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        System.out.println("\nVerificando se as instancias da classe SingletonEager "
    			+ "\ncontém os mesmos endereços de memoria.");
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        System.out.println("\nVerificando se as instancias da classe SingletonLazyHolder "
    			+ "\ncontém os mesmos endereços de memoria.");
        
        SingletonLazyHolder holder = SingletonLazyHolder.getInstacia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstacia();
        System.out.println(holder);
    	System.out.println("Padrão: STRATEGY");
    	
    	Comportamento normal = new ComportamentoNormal();
    	Comportamento defensivo = new ComportamentoDefensivo();
    	Comportamento agressivo = new ComportamentoAgressivo();
    	
    	Robo robo = new Robo();
    	
    	robo.setStrategy(normal);
    	robo.mover();
    	robo.mover();
    	
    	robo.setStrategy(defensivo);
    	robo.mover();
    	robo.mover();
    	
    	robo.setStrategy(agressivo);
    	robo.mover();
    	robo.mover();
    	
    	
    	System.out.println("Padrão: FACADE");
    	Facade facade = new Facade();
    	facade.migrarCliente("Fabio", "5533000");
    }
}
