import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String readFile(String fileName) {
		BufferedReader reader = null;
		String file = "";
		try {
			reader = new BufferedReader(new FileReader(fileName));
			while (reader.ready()) {
				file += (char) reader.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		return file;
	}

	public static String backwardsReadFile(String fileName) {
		BufferedReader reader = null;
		String file = "";
		try {
			reader = new BufferedReader(new FileReader(fileName));
			while (reader.ready()) {
				file = (char) reader.read() + file;
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		return file;
	}
}
