import java.util.Map;

public class Student {
  private String studentId;
  private String name;
  private Object department;
  private String address;

  private static final Map<Integer, String> CODE_TO_NAME = Map.of(
          10, "Computer Science",
          20, "Information Systems",
          30, "Mathematics",
          40, "Physics"
  );

  // constructor department sebagai String
  public Student(String studentId, String name, String address, String department) {
    this.studentId = studentId;
    this.name = name;
    this.address = address;
    this.department = department;
  }

  // constructor department sebagai Integer
  public Student(String studentId, String name, String address, Integer departmentCode) {
    this.studentId = studentId;
    this.name = name;
    this.address = address;
    this.department = departmentCode;
  }

  // encapsulation getter/setter
  public String getStudentId() { return studentId; }
  public void setStudentId(String studentId) { this.studentId = studentId; }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public Object getDepartmentRaw() { return department; }

  public String getDepartmentName() {
    if (department instanceof Integer) {
      return CODE_TO_NAME.getOrDefault((Integer) department, "Unknown(" + department + ")");
    }
    return String.valueOf(department);
  }

  public void setDepartment(String department) { this.department = department; }
  public void setDepartment(Integer departmentCode) { this.department = departmentCode; }

  public String getAddress() { return address; }
  public void setAddress(String address) { this.address = address; }

  @Override
  public String toString() {
    return studentId + " | " + name + " | " + getDepartmentName() + " | " + address;
  }
}
