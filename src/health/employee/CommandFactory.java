package health.employee;

import health.factory.ICommand;

public class CommandFactory {
	private CommandFactory(){}
	
	private static CommandFactory instance = new CommandFactory();
	public static CommandFactory getInstance(){
		return instance;
	}
	
	public ICommand createCommand(String cmd){
		System.out.println(cmd+"1");
		if(cmd.equals("REG"))
			return new InsertCommand(cmd);
		else if(cmd.equals("SAVE")){
			return new InsertCommand(cmd);
		}
		else if(cmd.equals("SEARCH")){
			return new SearchCommand();
		}else if(cmd.equals("UPDATE")){
			return new UpdateCommand();
		}else if(cmd.equals("DELETE")){
			return new DeleteCommand();
		}
		else
			return null;
	}
}
/*
 * new CommandFactory();
 * 
 * 
 * 
 */
