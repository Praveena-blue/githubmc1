import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Empfinder {

    public static void main(String[] args) {

        String filePath="C:\\Users\\kprav\\OneDrive\\Documents\\OneDrive\\Empsalary.xlsx";   // Excel file name

        double highestSalary = 0;
        String highestSalaryEmployee = "";

        try {
            FileInputStream fis = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            // Skip header row (start from row 1)
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {

                Row row = sheet.getRow(i);

                if (row != null) {

                    Cell nameCell = row.getCell(1);
                    Cell salaryCell = row.getCell(2);

                    if (salaryCell != null && salaryCell.getCellType() == CellType.NUMERIC) {

                        double salary = salaryCell.getNumericCellValue();

                        if (salary > highestSalary) {
                            highestSalary = salary;
                            highestSalaryEmployee = nameCell.getStringCellValue();
                        }
                    }
                }
            }

            workbook.close();
            fis.close();

            System.out.println("Highest Salary: " + highestSalary);
            System.out.println("Employee Name: " + highestSalaryEmployee);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
