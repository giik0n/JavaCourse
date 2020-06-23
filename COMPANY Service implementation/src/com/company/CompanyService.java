package com.company;

import java.util.List;

/*
 * @author Alexander Panyshchev
 * @since 6/23/20
 * @version 1.0
 */
public class CompanyService implements ICompanyService {
    @Override
    public Company getTopLevelParent(Company child) {
        if (child.getParent()!=null){
            return getTopLevelParent(child.getParent());
        }else{
            return child;
        }
    }

    @Override
    public long getEmployeeCountForCompanyAndChildren(Company company, List<Company> companies) {
        long employeeCount = company.getEmployeesCount();
        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getParent() == company){
                employeeCount += getEmployeeCountForCompanyAndChildren(companies.get(i),companies);
            }
        }
        return employeeCount;
    }
}
