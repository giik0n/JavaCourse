package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Company chief = new Company(null,2);
	Company accounting = new Company(null,10);
	Company lawyer = new Company(chief,10);
	Company developer = new Company(chief,2);

	Company backend = new Company(developer,1);
	Company frontend = new Company(developer,1);
	Company devOps = new Company(backend,3);
	Company design = new Company(frontend,3);

		List<Company> allCompanies = new ArrayList<>(
				Arrays.asList(
						chief,
						accounting,
						developer,
						lawyer,
						backend,
						frontend,
						devOps,
						design
				)
		);

	CompanyService service = new CompanyService();
        System.out.println("Top level parent for design: "+service.getTopLevelParent(design));//output chief
        System.out.println("Top level parent for developer: "+service.getTopLevelParent(developer));//output chief
        System.out.println("Top level parent for frontend: "+service.getTopLevelParent(frontend));//output chief
        System.out.println("Top level parent for lawyer: "+service.getTopLevelParent(lawyer));//output chief
		System.out.println("Top level parent for accounting: "+service.getTopLevelParent(accounting));//output accounting

		System.out.println("Chief and childs employees: "+service.getEmployeeCountForCompanyAndChildren(chief, allCompanies));// output 22
		System.out.println("Accounting and childs employees: "+service.getEmployeeCountForCompanyAndChildren(accounting, allCompanies));// output 10
		System.out.println("Developer and childs employees: "+service.getEmployeeCountForCompanyAndChildren(developer, allCompanies));// output 10
		System.out.println("Everything works awesome!)");

    }
}
