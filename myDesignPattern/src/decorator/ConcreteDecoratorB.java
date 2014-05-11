package decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component){
		super(component);
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		super.operation();
		addBehavior();
	}

	private void addBehavior() {
		
	}
}
