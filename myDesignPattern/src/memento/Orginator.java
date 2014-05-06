package memento;

public class Orginator {
	private String state;
	
	public Memento createMemento(){
		return new MementoImpl(state);
	}
	
	
	public void setMemento(Memento mento){
		MementoImpl memento = (MementoImpl)mento;
		
		this.state = memento.getState();
	}
	
	private static class MementoImpl implements Memento{
		private String state;
		
		public MementoImpl(String state){
			this.state = state;
		}
		
		public String getState(){
			return state;
		}
	}
}
