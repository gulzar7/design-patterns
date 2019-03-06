import java.awt.image.DirectColorModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
interface directory{
	void showDirectoryDetails();
}
class Developer implements directory{
	String name;
	String competency;
	public Developer (String name,String competency){
		this.name = name;
		this.competency = competency;
	}
	@Override
	public void showDirectoryDetails() {
		System. out .println("Employee{" +
				"name='" + name + '\'' +
				", competency='" + competency + '\'' +
				'}');
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompetency() {
		return competency;
	}
	public void setCompetency(String competency) {
		this.competency = competency;
	}
	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", competency='" + competency + '\'' +
				'}';
	}
}
class Manager implements directory{
	String name;
	String type;
	public Manager(String name,String type){
		this.name = name;
		this.type = type;
	}
	@Override
	public void showDirectoryDetails() {
		System. out .println("Manager{" +
				"name='" + name + '\'' +
				", type='" + type + '\'' +
				'}');
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Manager{" +
				"name='" + name + '\'' +
				", type='" + type + '\'' +
				'}';
	}
}
class developerDirectory implements directory{
	List<directory> d = new ArrayList<directory>();
	@Override
	public void showDirectoryDetails() {
		System. out .println(" Developer Directory ");
		d.forEach(e-> e.showDirectoryDetails());
	}
}
class managerDirectory implements directory{
	List<directory> d = new ArrayList<directory>();
	@Override
	public void showDirectoryDetails() {
		System. out .println(" Manger Directory ");
		d.forEach(e-> e.showDirectoryDetails());
	}
}
class companyDirectory implements directory{
	List<directory> d = new ArrayList<directory>();
	@Override
	public void showDirectoryDetails() {
		System. out .println(" Company Directory ");
		d.forEach(e->e.showDirectoryDetails());
	}
}
class ques7 {
	public static void main(String[] args) {
		Developer dev1 = new Developer("Gulzar","BigData");
		Developer dev2 = new Developer("Ahmad","Devops");
		Manager man1 = new Manager("Anurag","Technical");
		Manager man2 = new Manager("Suprakash","Admin");
		developerDirectory devDir = new developerDirectory();
		devDir.d.add(dev1);
		devDir.d.add(dev2);
		managerDirectory manDir = new managerDirectory();
		manDir.d.add(man1);
		manDir.d.add(man2);
		companyDirectory comDir = new companyDirectory();
		comDir.d.add(devDir);
		comDir.d.add(manDir);
		comDir.showDirectoryDetails();
	}
}