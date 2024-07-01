package controlsystems;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWriter {
	public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet1");

        // Define header and data
        String[] columns = {"Name", "Age", "Email"};
        Object[][] data = {
                {"John Doe", 30, "john@test.com"},
                {"Jane Doe", 28, "jane@test.com"},
                {"Bob Smith", 35, "jacky@example.com"},
                {"Swapnil", 37, "swapnil@example.com"}
        };

        // Create header row
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
        }

        // Create data rows
        int rowNum = 1;
        for (Object[] rowData : data) {
            Row row = sheet.createRow(rowNum++);
            for (int i = 0; i < rowData.length; i++) {
                Cell cell = row.createCell(i);
                if (rowData[i] instanceof String) {
                    cell.setCellValue((String) rowData[i]);
                } else if (rowData[i] instanceof Integer) {
                    cell.setCellValue((Integer) rowData[i]);
                }
            }
        }

        // Write the output to a file
        try (FileOutputStream fileOut = new FileOutputStream("data.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Closing the workbook
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
