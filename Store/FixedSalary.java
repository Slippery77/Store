package test.Store;

public class FixedSalary {
    private String firstname;
    private String lastname;
    private String securityid;
    private double salary;

    public FixedSalary(String n,String su,String sec,double sal){
        setFirstname(n);
        setLastname(n);
        setSecurityid(sec);
        setSalary(sal);
    }

    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getSecurityid() {
        return securityid;
    }
    public void setSecurityid(String securityid) {
        this.securityid = securityid;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
}