package P18_StreamFiles;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class E09_NIOFileSystem {

	public static void main(String[] args) {

		FileSystem fs = FileSystems.getDefault();
		fs.supportedFileAttributeViews().forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Separator: " + fs.getSeparator());
		System.out.println("Open: " + fs.isOpen());
		System.out.println("ReadOnly: " + fs.isReadOnly());
		
		System.out.println();
		
		fs.getRootDirectories().forEach(System.out::println);
		
	}

}
