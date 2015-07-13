package com.restdownloader.parsing;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import com.opencsv.CSVWriter;

public class CSVFile {

	private static String nameFile = "data.csv";

	public static void deleteFile() throws IOException {
		Path path = FileSystems.getDefault().getPath(CSVFile.nameFile);
		Files.deleteIfExists(path);
	}

	public static void createFile(List<Data> data) throws IOException {
		
		CSVFile.deleteFile();
		StringWriter sw = new StringWriter();
		CSVWriter writer = new CSVWriter(sw);

		// Write header
		String[] header = { "_id", "name", "latitude", "longitude" };
		writer.writeNext(header);

		String line[];
		for (Data d : data) {
			line = new String[] { Integer.toString(d.get_id()), d.getName(), Double.toString(d.getLatitude()),
					Double.toString(d.getLongitude()) };
			writer.writeNext(line);
		}

		writer.close();
		System.out.println("Generated CSV : \n");
		System.out.println(sw.toString());
		PrintWriter out = new PrintWriter(CSVFile.nameFile);
		out.println(sw.toString());
		out.close();
	}

}
