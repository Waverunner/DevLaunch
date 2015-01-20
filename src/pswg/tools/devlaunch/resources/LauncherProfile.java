package pswg.tools.devlaunch.resources;

public class LauncherProfile {

	private String name;
	private String gameArgs;
	private String gameLoc;
	private String serverAddress;
	private String serverPort;
	
	public LauncherProfile() {}
	public LauncherProfile(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGameArgs() {
		return gameArgs;
	}
	public void setGameArgs(String gameArgs) {
		this.gameArgs = gameArgs;
	}
	public String getGameLoc() {
		return gameLoc;
	}
	public void setGameLoc(String gameLoc) {
		this.gameLoc = gameLoc;
	}
	public String getServerAddress() {
		return serverAddress;
	}
	public void setServerAddress(String serverAddress) {
		this.serverAddress = serverAddress;
	}
	public String getServerPort() {
		return serverPort;
	}
	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}
	
	@Override
	public String toString() { return getName(); }
}