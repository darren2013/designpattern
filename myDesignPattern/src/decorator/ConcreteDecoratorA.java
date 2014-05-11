package decorator;

public class ConcreteDecoratorA extends Decorator {
	private String addedState;
	
	public ConcreteDecoratorA(Component component){
		super(component);
	}
	
	@Override
	public void operation() {
		//可以在调用前后执行一些动作
		//也可以天利用添加的状态的数据
		super.operation();
	}

	public String getAddedState() {
		return addedState;
	}

	public void setAddedState(String addedState) {
		this.addedState = addedState;
	}
	
	
	
}
