package com.vira.miniproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;

public class Exec {

    public enum DOC_TYPE {
        DOC,
        DOCX,
        PPT,
        PPTX
    }

    public static void exec(String[] args) {
        Converter converter;

        try {
            converter = processArguments(args);
        } catch (Exception e) {
            System.out.println("\n\nInput\\Output file not specified properly.");
            return;
        }

        if (converter == null) {
            System.out.println("Unable to determine type of input file.");
        } else {
            try {
                converter.convert();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static Converter processArguments(String[] args) throws Exception {
        CommandLineValues values = new CommandLineValues();
        //collect data from child class cmdvalues
        CmdLineParser parser = new CmdLineParser(values);

        Converter converter = null;
        try {
            parser.parseArgument(args);

            String inPath = values.inFilePath;
            String outPath = values.outFilePath;
            
            String lowerCaseInPath = inPath.toLowerCase();

            InputStream inStream = getInFileStream(inPath);
            OutputStream outStream = getOutFileStream(outPath);
            //check the ends of path
            if (lowerCaseInPath.endsWith("doc")) {
                converter = new DocToPdf(inStream, outStream, false, true);
            } else if (lowerCaseInPath.endsWith("docx")) {
                converter = new DocxToPdf(inStream, outStream, false, true);
            } else if (lowerCaseInPath.endsWith("ppt")) {
                converter = new PptToPdf(inStream, outStream, false, true);
            } else if (lowerCaseInPath.endsWith("pptx")) {
                converter = new PptxToPdf(inStream, outStream, false, true);
            } else {
                converter = null;
            }

        } catch (CmdLineException e) {
            // handling of wrong arguments
            System.err.println(e.getMessage());
            parser.printUsage(System.err);
        }

        return converter;

    }

    public static class CommandLineValues {

        @Option(name = "-inputPath", aliases = {"-i", "-in", "-input"}, required = false, metaVar = "<path>",
                usage = "Specifies a path for the input file.")
        public String inFilePath = null;

        @Option(name = "-outputPath", aliases = {"-o", "-out", "-output"}, required = false, metaVar = "<path>",
                usage = "Specifies a path for the output PDF.")
        public String outFilePath = null;

    }

    protected static InputStream getInFileStream(String inputFilePath) throws FileNotFoundException {
        File inFile = new File(inputFilePath);
        FileInputStream iStream = new FileInputStream(inFile);
        return iStream;
    }

    protected static OutputStream getOutFileStream(String outputFilePath) throws IOException {
        File outFile = new File(outputFilePath);

        try {
            //Make all directories up to specified
            outFile.getParentFile().mkdirs();
        } catch (NullPointerException e) {
            //Ignore error since it means not parent directories
        }

        outFile.createNewFile();
        FileOutputStream oStream = new FileOutputStream(outFile);
        return oStream;
    }

}
