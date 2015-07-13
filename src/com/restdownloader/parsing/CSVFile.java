package com.restdownloader.parsing;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import com.opencsv.CSVWriter;

/**
 * The static class to to store the csv data
 */
public class CSVFile {

	/** The name file. */
	private static String nameFile = "data.csv";

	/**
	 * Delete file if already exists.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void deleteFile() throws IOException {
		Path path = FileSystems.getDefault().getPath(CSVFile.nameFile);
		Files.deleteIfExists(path);
	}

	/**
	 * Creates the file.
	 *
	 * @param data the data
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void createFile(List<Data> data) throws IOException {
		
		//if the file already exists we delete it before
		CSVFile.deleteFile();
		StringWriter sw = new StringWriter();
		CSVWriter writer = new CSVWriter(sw);

		//write the header on the csv file
		String[] header = { "_id", "name", "latitude", "longitude" };
		writer.writeNext(header);
		
		//looping through the REST data
		String line[];
		for (Data d : data) {
			line = new String[] { Integer.toString(d.get_id()), d.getName(), Double.toString(d.getLatitude()),
					Double.toString(d.getLongitude()) };
			writer.writeNext(line);
		}

		writer.close();
		
		//For debug purposes
		System.out.println("Generated CSV : \n");
		System.out.println(sw.toString());
		
		//Writing the data on the file
		PrintWriter out = new PrintWriter(CSVFile.nameFile);
		out.println(sw.toString());
		out.close();
	}

}
