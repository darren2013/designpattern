package responsibility;

public class ConcreteHandler extends Handler {

	@Override
	public void handleRequest() {
		boolean someCondition = false;
		
		if(someCondition){
			System.out.println("process own business.....");
		}else{
			if(successor != null)successor.handleRequest();
		}
	}

}
