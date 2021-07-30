// Using the fewest fragments possible(and filling the fewest slots
// possible),complete the code below so that the class builds a directory named
// "dir3" and creates a file named "file3" inside
// "dir3". Note you can use each fragment either zero or one times.	

package com.paridile.week3.strings;

import java.io.File;
// import java.io.______________

// +---------+---------------------+---------------+-----------------+
// | File;✅ |  FileDescriptor;    |  FileWriter;  |  Directory      |
// +---------+---------------------+---------------+-----------------+
// | try {✅ |  .createNewDir();   |  File dir ✅  |  File          |
// +---------+---------------------+---------------+-----------------+
// | { }  ✅ |  (Exception x)  ✅  |  ("dir3");✅  |  file          |
// +---------+---------------------+---------------+-----------------+
// | file ✅ |.createNewFile();✅  |  = new File✅ |  = new File✅  |
// +---------+---------------------+---------------+-----------------+
// | dir  ✅ |  (dir, "file3");    |  (dir, file); |  .createFile(); |
// +---------+---------------------+---------------+-----------------+
// |}catch✅ |("dir3", "file3");✅ |  .mkdir();✅  |  File file✅   |
// +---------+---------------------+---------------+-----------------+

class Maker {
	public static void main(String[] args) {
	
		File dir = new File("dir3");
		// ___________ ___________ ___________
		dir.mkdir();
		// ___________ ___________ ___________
		File file = new File("dir3", "file3");
		// ___________ ___________ ___________
		try {
			// ___________ ___________ ___________
			file.createNewFile();	
			// ___________ ___________ ___________
		} catch (Exception e) {}
			// ___________ ___________ ___________		
	}
}


