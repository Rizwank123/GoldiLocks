package com.masai;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class CSVDataProcess {
	
	private  void processCsvData() {
		String inputFile="./input.csv";
		String outputFile="./output.csv";
		try {
			Reader reader=new FileReader(inputFile);
			Writer writer=new FileWriter(outputFile);
			
			
			CSVParser csvParser=new CSVParser(reader, CSVFormat.DEFAULT);
			CSVPrinter csvPrinter=new CSVPrinter(writer, CSVFormat.DEFAULT);
			
			
			BigDecimal sum=BigDecimal.ZERO;
			csvPrinter.printRecord("Column1","Column2","Column3","RowSum");
			
			for(CSVRecord record: csvParser) {
				
				if(record.getRecordNumber()==1) continue;
				if(record.size()>=3) {
				String column1=record.get(0);
				String column2=record.get(1);
				String column3=record.get(2);
				
				
				BigDecimal num1=new BigDecimal(column1);
				BigDecimal num2=new BigDecimal(column2);
				BigDecimal num3=new BigDecimal(column3);
				
				BigDecimal rowSum=num1.add(num2).add(num3);
				
				sum=sum.add(rowSum);
				csvPrinter.printRecord(column1,column2,column3,rowSum);
				}else System.out.println("Row skipped due to missing columns: " + record);
			}
			csvPrinter.printRecord("Total Sum:", "","",sum);
			
			reader.close();
			writer.close();
			csvParser.close();
			csvPrinter.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		CSVDataProcess csvDataProcess=new CSVDataProcess();
		csvDataProcess.processCsvData();
	}



}
