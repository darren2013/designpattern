package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	private List<Component> childComponts = new ArrayList<Component>();
	
	
	
	
	@Override
	public void dosomeOperation() {
		for(Component c : childComponts){
			c.dosomeOperation();
		}
	}
	
	
	@Override
	public void addChildComponent(Component compont) {
		childComponts.add(compont);
	}
	
	@Override
	public void removeChild(int index) {
		childComponts.remove(index);
	}

}
