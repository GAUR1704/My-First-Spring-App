package com.prowings.myBankApp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SBI_Bank {
	
	private int branchCode;
	private List<String>empName;
	private Set<String>accountType;
	private Map<String, String>empDesignation;
	private Properties loanType;
	
	public SBI_Bank() {
		super();
	}

	public SBI_Bank(int branchCode, List<String> empName, Set<String> accountType, Map<String, String> empDesignation,
			Properties loanType) {
		super();
		this.branchCode = branchCode;
		this.empName = empName;
		this.accountType = accountType;
		this.empDesignation = empDesignation;
		this.loanType = loanType;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(int branchCode) {
		this.branchCode = branchCode;
	}

	public List<String> getEmpName() {
		return empName;
	}

	public void setEmpName(List<String> empName) {
		this.empName = empName;
	}

	public Set<String> getAccountType() {
		return accountType;
	}

	public void setAccountType(Set<String> accountType) {
		this.accountType = accountType;
	}

	public Map<String, String> getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(Map<String, String> empDesignation) {
		this.empDesignation = empDesignation;
	}

	public Properties getLoanType() {
		return loanType;
	}

	public void setLoanType(Properties loanType) {
		this.loanType = loanType;
	}

	@Override
	public String toString() {
		return "SBI_Bank [branchCode = " + branchCode + ", empName = " + empName + ", accountType = " + accountType
				+ ", empDesignation = " + empDesignation +  loanType +", loanType = " + "]";
	}

	

}
