package composite;

public abstract class Component {

	public abstract void dosomeOperation();
	
	
	public void addChildComponent(Component compont){
		throw new UnsupportedOperationException("does't support");
	}
	
	public void removeChild(int index){
		throw new UnsupportedOperationException("doesn't support");
	}
	
	
	
	
}
