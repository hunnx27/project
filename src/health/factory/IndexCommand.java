package health.factory;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexCommand implements ICommand {

	@Override
	public Object ProcessCommand(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		
		return "/index.jsp";
	}
}
