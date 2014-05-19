package responsibility;

public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest() {
		boolean someCondition = true;
		
		if(someCondition){
			System.out.println(this.getClass().getSimpleName()+",process own business");
		}else{
			if(successor != null)successor.handleRequest();
		}
	}

}
