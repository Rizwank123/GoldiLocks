# CSV Data Processing Program

This Java program reads a CSV file containing numeric data, calculates the sum of each row, and generates an output CSV file with the original data and row sums.

## Table of Contents

- [Introduction](#introduction)
- [Usage](#usage)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Input CSV Format](#input-csv-format)
- [Output CSV Format](#output-csv-format)


## Introduction

The CSV Data Processing Program is a Java application that performs the following tasks:

- Reads an input CSV file named `input.csv`.
- Processes the data in the CSV file by calculating the sum of each row.
- Generates an output CSV file named `output.csv` containing the original data along with the calculated row sums.

## Usage

To use the CSV Data Processing Program, follow these steps:

1. Ensure that you have the required dependencies installed (Apache Commons CSV library).

2. Clone or download this repository to your local machine.

3. Open the terminal/command prompt and navigate to the project directory.

4. Compile and run the Java program:

   ```shell
   mvn clean install
   java -cp target/CSVDataProcess-1.0-SNAPSHOT.jar com.masai.CSVDataProcess


***Getting Started***
**Prerequisites**

Before running the program, make sure you have the following installed:

    Java Development Kit (JDK) 8 or higher
    Apache Commons CSV library (included in the project)

**Installation**

You can compile and run the program as mentioned in the "Usage" section. Ensure that you have set the classpath (-cp) to include the Apache Commons CSV library JAR file.
**Input CSV Format**
The input CSV file, input.csv, should follow the following format:
Column1,Column2,Column3
1,2,3
4,5,6
7,8,9
10,11,12
13,14,15

. The first row contains column headers.
. Each subsequent row contains numeric values in three columns.

**Output CSV Format**

The output CSV file, output.csv, will have the following format:
Column1,Column2,Column3,RowSum
1,      2,          3,      6
4,          5,      6,      15
7,          8,      9,      24
10,         11,     12,     33
13,         14,     15,     42
Total Sum:  ,       ,       120

. The first row contains column headers and an additional column "RowSum."
. Each subsequent row contains the original data along with the calculated row sum.
. The last row contains the total sum of all row sums.



