package synAsset;

public class SynAssetCommand implements ICommand {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Asset asset;
	
	
	
	public SynAssetCommand(Asset asset) {
		this.asset = asset;
	}



	@Override
	public void execute() {
		System.out.println("synAssetCommand....,assetname:"+asset.getName());
	}

}
