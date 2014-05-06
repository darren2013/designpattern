package memento2;

public class FlowAMock {

	private String flowName;
	private String tempState;
	private int tempResult;
	
	public FlowAMock(String flowName) {
		this.flowName = flowName;
	}
	
	public void phaseOne(){
		this.tempState = "phaseOne";
		this.tempResult += 3;
	}
	
	public void schemal1(){
		System.out.println(tempState+",result:"+tempResult);
		this.tempState += ",schemal 1";
		this.tempResult += 22;
	}
	
	public void schemal2(){
		System.out.println(tempState+",result:"+tempResult);
		this.tempState += ",schemal 2";
		this.tempResult += 33;
	}
	
	
	
	public FlowAMockMemento createFlowAMockMemento(){
		return new FlowAMockMementoImpl(tempState, tempResult);
	}
	
	public void setFlowAMockMemento(FlowAMockMemento mento){
		FlowAMockMementoImpl memento = (FlowAMockMementoImpl)mento;
		this.tempState = memento.getTempState();
		this.tempResult = memento.getTempResult();
	}
	
	
	private static class FlowAMockMementoImpl implements FlowAMockMemento{
		private String tempState;
		private int tempResult;
		
		public FlowAMockMementoImpl(String tempState, int tempResult) {
			this.tempState = tempState;
			this.tempResult = tempResult;
		}

		public String getTempState() {
			return tempState;
		}

		public int getTempResult() {
			return tempResult;
		}
		
		
		
		
	}
	
	
}
