package inout;

import java.io.*;

/**
 * A simple class to log any kind of data. It needs work.
 * @author Christopher Dombroski
 *
 */
public class Logger {
	
	File file;
	FileWriter writer;

	public Logger(String fileName, String[] fieldNames) throws IOException {

		File directory = new File("logs\\");
		File file = new File("logs\\" + fileName + ".csv");
		
		directory.mkdir();
		file.createNewFile();
		
		this.file = file;
		writer = new FileWriter(file);

		LogLine(fieldNames);

	}

	public Logger(String fileName) throws IOException {

		File directory = new File("logs\\");
		File file = new File("logs\\" + fileName + ".csv");
		
		directory.mkdir();
		file.createNewFile();
		
		this.file = file;
		writer = new FileWriter(file);

	}
	
	public void close() throws IOException {
		writer.close();
	}

	public void LogLine(double[] values) throws IOException {

		for (int i = 0; i < values.length; i++) {

			if (i == (values.length - 1)) {
				writer.write(String.valueOf(values[i]));
			} else {
				writer.write(String.valueOf(values[i]) + ", ");
			}

		}

		writer.write((char) 13);
		writer.write((char) 10);

	}

	public void LogLine(String[] values) throws IOException {

		for (int i = 0; i < values.length; i++) {

			if (i == (values.length - 1)) {
				writer.write(values[i]);
			} else {
				writer.write(values[i] + ", ");
			}

		}
		
		writer.write((char) 13);
		writer.write((char) 10);

	}

	public void LogLine(float[] values) throws IOException {

		for (int i = 0; i < values.length; i++) {

			if (i == (values.length - 1)) {
				writer.write(String.valueOf(values[i]));
			} else {
				writer.write(String.valueOf(values[i]) + ", ");
			}

		}

		writer.write((char) 13);
		writer.write((char) 10);

	}

}
