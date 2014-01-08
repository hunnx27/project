package health.factory;

public class CommandFactory {
	private CommandFactory(){}
	
	private static CommandFactory instance = new CommandFactory();
	public static CommandFactory getInstance(){
		return instance;
	}
	
	public ICommand createCommand(String cmd){
		if(cmd.equals("member"))
			return new MemberCommand();
		else
			return null;
	}
}
