package 용현.basic.day13.lab;
public class EmployeeVO {
    protected String empno;   // 산술할꺼 아니면 int 보다 그냥 string으로 선언!
    protected String fname;
    protected String lname;
    protected String email;
    protected String phone;
    protected String hdate;
    protected String jobid;
    protected int sal;
    protected double comm;
    protected String mgrid;
    protected String deptid;



    // 생성자 선택안함
    public EmployeeVO() {
    }
    // 생성자 기본자료
    public EmployeeVO(String empno, String fname, String lname, String email, String phone, String hdate) {
        this.empno = empno;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.hdate = hdate;
    }
    // getter setter 기본자료
    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHdate() {
        return hdate;
    }

    public void setHdate(String hdate) {
        this.hdate = hdate;
    }

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public String getMgrid() {
        return mgrid;
    }

    public void setMgrid(String mgrid) {
        this.mgrid = mgrid;
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    // tostring  선택안함 클릭후 직접 작성
    @Override
    public String toString() {
        String fmt = "emp{empno:%s, fname:%s, lname:%s," + "email:%s, phone:%s, hdate:%s \n" + "jobid:%s, sal:%s, comm:%s,"+
                "mgrid:%s, deptid:%s }\n ";
        String result = String.format(fmt);

        return result;
    }
}
//public class EmployeeVO {
//    protected int empno;
//    protected String fname;
//    protected String lname;
//    protected String email;
//    protected String phone;
//    protected String hdate;
//
//    public EmployeeVO(int empno , String fname, String lname, String email, String phone, String hdate) {
//        this.empno = empno;
//        this.fname = fname;
//        this.lname = lname;
//        this.email = email;
//        this.phone = phone;
//        this.hdate = hdate;
//    }
//
//    public int getEmpno() {
//        return empno;
//    }
//
//    public void setEmpno(int empno) {
//        this.empno = empno;
//    }
//
//    public String getFname() {
//        return fname;
//    }
//
//    public void setFname(String fname) {
//        this.fname = fname;
//    }
//
//    public String getLname() {
//        return lname;
//    }
//
//    public void setLname(String lname) {
//        this.lname = lname;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getHdate() {
//        return hdate;
//    }
//
//    public void setHdate(String hdate) {
//        this.hdate = hdate;
//    }
//
//    public String toString(){
//        String fmt = "{empno:'%d', fname:'%s', lname:'%s', email:'%s', phone:%s, hdate:'%s'}";
//
//        String result = String.format(fmt,empno,fname,lname,email,phone,hdate);
//        return result;
//
//    }
//
//
//}
