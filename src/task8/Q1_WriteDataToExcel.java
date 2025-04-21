/*package task8;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
//import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q1_WriteDataToExcel {
//Write data to excel using apache poi library
	
	public static void main(String[] args) throws IOException 
	{
	//Create work book
		methodForWritingExcel();
		methodForReading();
		
	}
		
public static void methodForWritingExcel() throws IOException 
{
			

Workbook wb = new XSSFWorkbook();
XSSFSheet mySheet = (XSSFSheet) wb.createSheet("Sheet1");

//create row
Row firstRow = mySheet.createRow(0);
firstRow.createCell(0).setCellValue("Name");
firstRow.createCell(1).setCellValue("Age");
firstRow.createCell(2).setCellValue("Email");

Row secondRow = mySheet.createRow(1);
secondRow.createCell(0).setCellValue("John Doe");
secondRow.createCell(1).setCellValue(30);
secondRow.createCell(2).setCellValue("john@test.com");

Row thirdRow = mySheet.createRow(2);
thirdRow.createCell(0).setCellValue("Jane Doe");
thirdRow.createCell(1).setCellValue(28);
thirdRow.createCell(2).setCellValue("john@test.com");


Row forthRow = mySheet.createRow(3);
forthRow.createCell(0).setCellValue("Bob Smith");
forthRow.createCell(1).setCellValue(35);
forthRow.createCell(2).setCellValue("jacky.com");


//write this to a file 

FileOutputStream fis = new FileOutputStream("IamWitingToExcel.xlsx");


wb.write(fis);
System.out.println("Successfully written");
wb.close();

	}

public static void methodForReadingExcel() {
    // Open the file using FileInputStream
    try (FileInputStream fis = new FileInputStream("IamWitingToExcel.xlsx")) {
        // Create a workbook instance from the file input stream
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        
        // Get the first sheet in the workbook (Sheet1 in this case)
        Sheet sheet = wb.getSheetAt(0);  // This refers to the first sheet (Sheet1)

        // Iterate through all the rows in the sheet
        for (Row row : sheet) {
            // Iterate through all the cells in the row
            for (Cell cell : row) {
                // Check the cell type and print the appropriate value
                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        // If the cell contains numeric data (like age), print it
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        // If the cell contains boolean data, print it
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    default:
                        break;
                }
            }
            // Print a new line after each row
            System.out.println();
        }
        
        // Close the workbook
        wb.close();
    } catch (IOException e) {
        // Print stack trace for any IO exceptions
        e.printStackTrace();
    }
}

/*public static void methodForReading() throws IOException 
{
	
	
	//file path
	FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\GuviTaskNewBatch\\IamWitingToExcel.xlsx");

	try (//workbook
	XSSFWorkbook mybook = new XSSFWorkbook(fis)) {
		//sheet
		XSSFSheet mysheet1 = mybook.getSheetAt(0);
		for(Row row : mysheet1) {    //USING FOR EACH LOOP,ITERATE OVER EACH CELL IN THE ROW
			
			for(Cell cell : row) {
			switch(cell.getCellType()) {   //it checks the specifit type of the value stored in the specific cell of the excel sheet
				                            //it will goes to the specific case first
				case NUMERIC: 
						System.out.printf("%-15s",cell.getNumericCellValue()) ;
						break;
				case STRING : 
		              // String cellValue = cell.getStringCellValue(); // Get string value from cell
						//System.out.println("String :"+ cellValue );

						System.out.printf("%-15s",cell.getStringCellValue());
						break;
			    case BOOLEAN :
				System.out.printf("cell value is :: " + cell.getBooleanCellValue());
				break;
				case BLANK: 
					System.out.print("Cell value is :: " + cell.getStringCellValue());
					break;
			case ERROR:
				break;
			case FORMULA:
				break;
			case _NONE:
				break;
			default:
				break;	
			}
			
			}
			System.out.println();

}
		System.out.println("Successfully Red");	
}	}  */

		
//public static void methodFor		


package task8;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q1_WriteDataToExcel {
    // Write data to Excel using Apache POI library

    public static void main(String[] args) throws IOException {
        // Create workbook and write data to Excel
        methodForWritingExcel();
        // Read data from Excel
        methodForReadingExcel();
    }

    // Method to write data to Excel
    public static void methodForWritingExcel() throws IOException {
        Workbook wb = new XSSFWorkbook();
        XSSFSheet mySheet = (XSSFSheet) wb.createSheet("Sheet1");

        // Create rows and cells
        Row firstRow = mySheet.createRow(0);
        firstRow.createCell(0).setCellValue("Name");
        firstRow.createCell(1).setCellValue("Age");
        firstRow.createCell(2).setCellValue("Email");

        Row secondRow = mySheet.createRow(1);
        secondRow.createCell(0).setCellValue("John Doe");
        secondRow.createCell(1).setCellValue(30);
        secondRow.createCell(2).setCellValue("john@test.com");

        Row thirdRow = mySheet.createRow(2);
        thirdRow.createCell(0).setCellValue("Jane Doe");
        thirdRow.createCell(1).setCellValue(28);
        thirdRow.createCell(2).setCellValue("jane@test.com");

        Row forthRow = mySheet.createRow(3);
        forthRow.createCell(0).setCellValue("Bob Smith");
        forthRow.createCell(1).setCellValue(35);
        forthRow.createCell(2).setCellValue("bob@test.com");

        // Write to a file
        try (FileOutputStream fos = new FileOutputStream("IamWitingToExcel.xlsx")) {
            wb.write(fos);
            System.out.println("Successfully written to Excel.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            wb.close();
        }
    }

    // Method to read data from Excel
    public static void methodForReadingExcel() {
        try (FileInputStream fis = new FileInputStream("IamWitingToExcel.xlsx")) {
            // Create workbook instance from the file input stream
            XSSFWorkbook wb = new XSSFWorkbook(fis);

            // Get the first sheet in the workbook
            XSSFSheet sheet = wb.getSheetAt(0);  // Sheet1

            // Iterate through all the rows in the sheet
            for (Row row : sheet) {
                // Iterate through all the cells in the row
                for (Cell cell : row) {
                    // Check the cell type and print the appropriate value
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        default:
                            System.out.print("Unknown type\t");
                            break;
                    }
                }
                // Print a new line after each row
                System.out.println();
            }

            wb.close();
        } catch (IOException e) {
            // Print stack trace for any IO exceptions
            e.printStackTrace();
        }
    }
}


