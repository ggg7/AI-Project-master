public class CsvWriteReadTest {

	public static void main(String[] args) {
		
		String fileName = System.getProperty("user.home")+"/tombdata.csv";
		
		System.out.println("Write CSV file:");
		CsvFileWriter.writeCsvFile(fileName);
		
	}

}
