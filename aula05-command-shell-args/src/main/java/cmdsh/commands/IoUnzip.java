package cmdsh.commands;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import cmdsh.core.AbstractCommand;
import cmdsh.core.IArgument;

public class IoUnzip extends AbstractCommand{

	private static final String inPath = "D:\\MyFolder\\ISEL\\Pg4 mpd - 2011-2012 2� sem\\MDP Apontamentos.rar";
	public IoUnzip() {
		super("io unzip", new IArgument[]{});
	}

	@Override
	public void executeCommand() {
		int idxDot = inPath.lastIndexOf('.');
		String outPath = inPath.substring(0,idxDot);
		try {
			InputStream in = new GZIPInputStream(new FileInputStream(new File(inPath)));
			OutputStream out;
			out = new FileOutputStream(outPath);
			int c;
			while ((c = in.read()) != -1)
				out.write(c);
			in.close(); out.close();
		} 
		catch (FileNotFoundException e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();}
	}

}
