package cmdsh.commands;

import cmdsh.args.ArgFlagOptional;
import cmdsh.args.ArgWithoutNameMandatory;
import cmdsh.core.AbstractCommand;
import cmdsh.core.IArgument;
import cmdsh.parsers.ParamsParserOrdered;

public class GitRemoteAdd extends AbstractCommand{
	public GitRemoteAdd() {
		super("git remote add", new  ParamsParserOrdered(),
				new IArgument[]{
					new ArgFlagOptional("-f"), 
					new ArgFlagOptional("--tags"), 
					new ArgWithoutNameMandatory("name"),
					new ArgWithoutNameMandatory("url")});
	}
	@Override
	protected void executeCommand(){
		System.out.println("Performing git remote add");		
	}

}
