package decorator;

public class ConcreteDecoratorA extends Decorator {
	private String addedState;
	
	public ConcreteDecoratorA(Component component){
		super(component);
	}
	
	@Override
	public void operation() {
		//�����ڵ���ǰ��ִ��һЩ����
		//Ҳ������������ӵ�״̬������
		super.operation();
	}

	public String getAddedState() {
		return addedState;
	}

	public void setAddedState(String addedState) {
		this.addedState = addedState;
	}
	
	
	
}
