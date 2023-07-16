package jdbc_crud_statement_operation.dto;
//Q.sir package ka namm always yahi rahna chaiye kya?

public class Teacher {
	private int teacherid;
	private String teachername;
	private String teacheremail;
	private String teachersubject;
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getTeacheremail() {
		return teacheremail;
	}
	public void setTeacheremail(String teacheremail) {
		this.teacheremail = teacheremail;
	}
	public String getTeachersubject() {
		return teachersubject;
	}
	public void setTeachersubject(String teachersubject) {
		this.teachersubject = teachersubject;
	}

}
