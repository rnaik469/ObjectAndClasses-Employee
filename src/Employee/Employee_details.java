package Employee;

public class Employee_details {
	private String Id;
	private String name;
	private double monthlyBasic;
	private double pf;
	double HRA = monthlyBasic * 0.5;
	static final int medical = 1250;
	static final int conveallow = 800;
	double ESIC;
	double PTax;

	// setting values of pf,ESIC,PTax
	void calc() {
		if (monthlyBasic > 6500) {
			pf = .1 * monthlyBasic;
		} else {
			pf = 0;
		}
		if (monthlyBasic <= 5000) {
			ESIC = .0475 * monthlyBasic;
		} else {
			ESIC = 0;
		}
		if (getMonthlyGrossSalary() < 10000) {
			PTax = 50;
		} else {
			PTax = 100;
		}
	}

	// Getter Setters
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMonthlyBasic() {
		return monthlyBasic;
	}

	public void setMonthlyBasic(double monthlyBasic) {
		this.monthlyBasic = monthlyBasic;
	}

//Salary calculations
	double getAnnualBasic() {
		return 12 * monthlyBasic;
	}

	double getMonthlyGrossSalary() {
		return monthlyBasic + HRA + medical + conveallow;
	}

	double getAnnualGrossSalary() {
		return 12 * getMonthlyGrossSalary();
	}

	double getMonthlyDeductions() {
		return pf + ESIC + PTax;
	}

	double getMonthlyTakeHome() {
		return getMonthlyGrossSalary() - getMonthlyDeductions();
	}

	double getAnnualTakeHome() {
		return 12 * getMonthlyTakeHome();
	}

}
