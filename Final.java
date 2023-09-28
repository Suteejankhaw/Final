import java.util.ArrayList;

public class Final {
    public static void main(String[] args) {
        Employee P1 = new Employee();
        P1.setName("Tom");
        P1.setPosition("UX/UI");
        P1.setEmpID("0001");
        Project PJ1 = new Project("Web A", "Developing a web application");
        Project PJ2 = new Project("Mobile app A", "Developing a mobile app");
        P1.AddProject(PJ1);
        P1.AddProject(PJ2);
        P1.ShowDetails();
        Employee P2 = new Employee();
        P2.setName("Tim");
        P2.setPosition("FontEnd");
        P2.setEmpID("0002");
        P2.AddProject(PJ1);
        P2.ShowDetails();
    }
}
interface Person{
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int Age);
}
interface Job{
    String getPosition();
    void setPosition(String Position);
    String getEmpID();
    void setEmpID(String EmpID);
}
class Employee implements Person,Job {
    private String Name;
    private int Age;
    private String Position;
    private String EmpID;
    private ArrayList<Project> MyProject;

    public Employee() {
        MyProject = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    public String getPosition() {
        return Position;
    }
    public void setPosition(String Position) {
        this.Position = Position;
    }
    public String getEmpID() {
        return EmpID;
    }
    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }

    public Object AddProject(Project Project){
        return this.MyProject.add(Project);
    }

    public void ShowDetails(){
        System.out.println("********************************");
        System.out.println("Name : "+this.Name);
        System.out.println("Position : "+this.Position);
        System.out.println("EmpID : "+this.EmpID);
        System.out.println("Project");
        for (int i =0;i < this.MyProject.size();i++){
            System.out.println("       "+this.MyProject.get(i).getProject());
        }
    }
}
class Project{
    private String projectName;
    private String Description;

    public Project(String projectName, String Description){
        this.projectName = projectName;
        this.Description = Description;
    }
    public String getProject(){
        return this.projectName + ":" + this.Description;
    }
 }



