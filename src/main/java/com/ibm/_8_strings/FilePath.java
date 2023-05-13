package com.ibm._8_strings;

//File
public class FilePath {
	
	private String fullPath; //   "/Users/ionut/workspace/trainings/core-java-ibm/pom.xml"
	private char separator;
	private String root;
	
	public FilePath(String fullPath, char separator, String root) {
		this.fullPath = fullPath;
		this.separator = separator;
		this.root = root;
	}
	
	public static void main(String[] args) {
		String fullPath1 = "/Users/ionut/workspace/trainings/core-java-ibm/pom.xml";
		FilePath path = new FilePath(fullPath1, '/', "/");
		System.out.println("path.getFilename() = " + path.getFilename());
		System.out.println("path.extension() = " + path.extension());
		int firstOccurrenceOfSeparator = fullPath1.indexOf("/");
	}
	
	public String getFilename() {
		int lastIndexOfSeparator = fullPath.lastIndexOf(separator);
		return fullPath.substring(lastIndexOfSeparator + 1);
	}
	
	public String extension() {
		String extensionSeparator = ".";
		//		if(!fullPath.contains(extensionSeparator)){
		//			return "";
		//		}
		//
		int lastIndexOfExtSep = fullPath.lastIndexOf(extensionSeparator);
		int lastIndexOfSeparator = fullPath.lastIndexOf(separator);
		
		if (lastIndexOfSeparator >= lastIndexOfExtSep) {
			return "";
		}
		return fullPath.substring(lastIndexOfExtSep + 1);
	}
}