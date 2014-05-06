package memento2;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FlowAMock mock = new FlowAMock("test");
		mock.phaseOne();
		
		FlowAMockMemento memento = mock.createFlowAMockMemento();
		FlowAMockCaretaker caretaker = new FlowAMockCaretaker();
		caretaker.setMemento(memento);
		
		
		mock.schemal1();
		
		mock.setFlowAMockMemento(caretaker.getMemento());
		
		mock.schemal2();
	}

}
