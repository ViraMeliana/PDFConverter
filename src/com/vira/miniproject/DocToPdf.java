package com.vira.miniproject;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.docx4j.Docx4J;
import org.docx4j.convert.in.Doc;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;


public class DocToPdf extends Converter {

	


	public DocToPdf(InputStream inStream, OutputStream outStream, boolean showMessages, boolean closeStreamsWhenComplete) {
		super(inStream, outStream, showMessages, closeStreamsWhenComplete);
	}


	@Override
	public void convert() throws Exception{

		loading();

		InputStream iStream = inputStream;
                
                //get package from input stream
		WordprocessingMLPackage wordMLPackage = getMLPackage(iStream);

		processing();
                //convert doc using library
		Docx4J.toPDF(wordMLPackage, outputStream);

		finished();
		
	}

	protected WordprocessingMLPackage getMLPackage(InputStream iStream) throws Exception{
		PrintStream originalStdout = System.out;
		
		WordprocessingMLPackage mlPackage = Doc.convert(iStream);
		
		System.setOut(originalStdout);
		return mlPackage;
	}

}
