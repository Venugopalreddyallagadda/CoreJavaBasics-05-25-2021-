package com.ojas.employee.filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDetails {

	List<Employee> list = new ArrayList<>();

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

	void readEmployeeDetails(String fileName) {

		

		File file = new File(fileName);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String string;
			while ((string = br.readLine()) != null) {
				String[] line = string.split(";");

				if (!(string.equals("IdNo"))) {
					Employee emp = new Employee();
					emp.setEmployeeId(Integer.parseInt(line[0]));
					emp.setEmployeeName(line[1]);
					emp.setDesignation(line[2]);
					emp.setSalary(Double.parseDouble(line[3]));
					list.add(emp);
				}

			}
			Iterator<Employee> itr = list.iterator();
			while (itr.hasNext()) {
				Employee e = (Employee) itr.next();
				System.out.println(
						e.getEmployeeId() + " " + e.getEmployeeName() + " " + e.getDesignation() + " " + e.getSalary());
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		EmployeeDetails empTest = new EmployeeDetails();
		empTest.readEmployeeDetails("C:\\Users\\Bhupal\\Desktop\\Employee.txt");
	}
}
