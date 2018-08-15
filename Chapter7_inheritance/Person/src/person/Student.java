package person;

public class Student extends Person{

	public int id;
	public String course;
	public String teacherName;
	
	public Student() {
		id=0;
		course="no course";
		teacherName="no teacher name";
	}
	public Student(int id) {
		setId(id);
		course="no course";
		teacherName="no teacher name";
	}
	public Student(int id,String course) {
		setCourse(course);
		teacherName="no teacher name";
	}
	public Student(int id,String course,String teacherName) {
		setTeacherNameIdCourse( id, course, teacherName);
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setCourse(String course) {
		this.course=course;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName=teacherName;
	}
	
	public void setTeacherNameIdCourse(int id,String course,String teacherName) {
		this.id=id;
		this.course=course;
		this.teacherName=teacherName;
	}
	
	public int getId() {
		return id;
	}
	public String getCourse() {
		return course;
	}
	public String getTeacherName() {
		return teacherName;
	}
	
	public String displayDetails() {
		return (id+" "+course+" "+teacherName);
	}
}