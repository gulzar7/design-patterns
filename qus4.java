class Student {

	private String name;
	private Integer id;
	private Integer fees;
	private boolean optedForBranch;
	private boolean isOptedForSpecialisation;
	private Integer contributionToDonation;

	public Student(StudentBuilder studentBuilder) {
		id = studentBuilder.getId();
		name = studentBuilder.getName();
		fees = studentBuilder.getfees();
		optedForBranch = studentBuilder.isOptedForBranch();
		isOptedForSpecialisation = studentBuilder.isOptedForSpecialisation();
		contributionToDonation = studentBuilder.getContributionToDonation();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getfees() {
		return fees;
	}

	public void setfees(Integer fees) {
		this.fees = fees;
	}

	public boolean isOptedForBranch() {
		return optedForBranch;
	}

	public void setOptedForBranch(boolean optedForBranch) {
		this.optedForBranch = optedForBranch;
	}

	public boolean isOptedForSpecialisation() {
		return isOptedForSpecialisation;
	}

	public void setOptedForSpecialisation(boolean optedForSpecialisation) {
		isOptedForSpecialisation = optedForSpecialisation;
	}

	public Integer getContributionToDonation() {
		return contributionToDonation;
	}

	public void setContributionToDonation(Integer contributionToDonation) {
		this.contributionToDonation = contributionToDonation;
	}

	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", id=" + id +
				", fees=" + fees +
				", optedForBranch=" + optedForBranch +
				", isOptedForSpecialisation=" + isOptedForSpecialisation +
				", contributionToDonation=" + contributionToDonation +
				'}';
	}
}



class StudentBuilder {
	private String name;
	private Integer id;
	private Integer fees;
	private boolean optedForBranch;
	private boolean isOptedForSpecialisation;
	private Integer contributionToDonation;

	public StudentBuilder(String name, Integer id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public StudentBuilder setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getfees() {
		return fees;
	}

	public StudentBuilder withFees(Integer fees) {
		this.fees = fees;
		return this;
	}

	public boolean isOptedForBranch() {
		return optedForBranch;
	}

	public StudentBuilder hasOptedForBranch(boolean optedForBranch) {
		this.optedForBranch = optedForBranch;
		return this;
	}

	public boolean isOptedForSpecialisation() {
		return isOptedForSpecialisation;
	}

	public StudentBuilder hasOptedForSpecialisation(boolean isOptedForSpecialisation) {
		isOptedForSpecialisation = isOptedForSpecialisation;
		return this;
	}

	public Integer getContributionToDonation() {
		return contributionToDonation;
	}

	public StudentBuilder willContributionAmountToDonation(Integer contributionToDonation) {
		this.contributionToDonation = contributionToDonation;
		return this;
	}

	public Student build() {
		return new Student(this);
	}
}
class Builder {
	public static void main(String[] args) {
		Student employee = new StudentBuilder("Gulzar",22)
				.withFees(100000)
				.willContributionAmountToDonation(3000)
				.hasOptedForSpecialisation(false)
				.hasOptedForBranch(true)
				.build();

		System.out.println(employee);
	}
}
