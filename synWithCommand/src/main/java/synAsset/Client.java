package synAsset;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		SynCommandSuit suit = new SynCommandSuit();
		
		Asset asset = new Asset();
		asset.setId("11");
		asset.setName("asset1");
		SynAssetCommand synAssetCommand = new SynAssetCommand(asset);
		suit.getCommands().add(synAssetCommand);
		
		Customer customer = new Customer();
		customer.setId("222");
		customer.setName("customer");
		SynCustomerCommand synCustomerCommand = new SynCustomerCommand(customer);
		suit.getCommands().add(synCustomerCommand);
		
		XStream xstream = new XStream(new JettisonMappedXmlDriver());
        xstream.setMode(XStream.NO_REFERENCES);
        
		String suitCommandInJson = xstream.toXML(suit);
		
		System.out.println(suitCommandInJson);
		
		ICommand receCommand = (SynCommandSuit)xstream.fromXML(suitCommandInJson);
		System.out.println(receCommand.getClass().getName());
		receCommand.execute();
		
	}

}
