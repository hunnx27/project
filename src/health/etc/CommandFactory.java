package health.etc;

import health.factory.ICommand;

public class CommandFactory {
	private CommandFactory(){}
	
	private static CommandFactory instance = new CommandFactory();
	public static CommandFactory getInstance(){
		return instance;
	}
	
	public ICommand createCommand(String cmd){
		System.out.println(cmd+"1");
		if(cmd.equals("REG")){
			return new InsertCommand(cmd);
		}
		else if(cmd.equals("SAVE")){
			return new InsertCommand(cmd);
		}
		else if(cmd.equals("UPDATE")){
			return new UpdateCommand(cmd);
		}
		else if(cmd.equals("UP")){
			return new UpdateCommand(cmd);
		}
		else if(cmd.equals("SEARCH")){
			return new SearchCommand(cmd);
		}
		else if(cmd.equals("DEL")){
			System.out.println("Delete커맨드접속");
			return new DeleteCommand(cmd);
		}
		else
			return null;
	}
}
