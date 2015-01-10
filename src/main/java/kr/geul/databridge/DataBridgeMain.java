package kr.geul.databridge;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import kr.geul.console.Console;
import kr.geul.console.ExpansionPack;
import kr.geul.console.LogWriter;
import kr.geul.console.PublicWriter;
import kr.geul.console.exception.DuplicateCommandException;
import kr.geul.dataobject.DataObject;
import kr.geul.thesis1.Thesis1;

public class DataBridgeMain {
	
	static final String programName = "DataBridge",
						programVersion = "2015a";
	
    public static void main( String[] args ) throws IOException, DuplicateCommandException {
   	
    	File logFile = new File("./log.txt");
    	LogWriter.setWriter(logFile);
       	Console console = Console.getConsole();
       	console.setProgramName(programName);
       	console.setProgramVersion(programVersion);
       	console.setLogMode(false);
       	ExpansionPack dataObject = new DataObject();
       	ExpansionPack thesis1 = new Thesis1();
       	dataObject.include();
       	thesis1.include();
       	
    	console.start();
    	
    }
    
}