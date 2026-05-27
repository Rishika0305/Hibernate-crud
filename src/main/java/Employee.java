import java.util.Objects;
public class Employee {
 private int eid;
 private String ename;
 private double esal;
 private String desig;
 public Employee() {
  super();
  // TODO Auto-generated constructor stub
 }
 public Employee(int eid, String ename, double esal, String desig) {
  super();
  this.eid = eid;
  this.ename = ename;
  this.esal = esal;
  this.desig = desig;
 }
 public int getEid() {
  return eid;
 }
 public void setEid(int eid) {
  this.eid = eid;
 }
 public String getEname() {
  return ename;
 }
 public void setEname(String ename) {
  this.ename = ename;
 }
 public double getEsal() {
  return esal;
 }
 public void setEsal(double esal) {
  this.esal = esal;
 }
 public String getDesig() {
  return desig;
 }
 public void setDesig(String desig) {
  this.desig = desig;
 }
 @Override
 public String toString() {
  return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", desig=" + desig + "]";
 }
 @Override
 public int hashCode() {
  return Objects.hash(desig, eid, ename, esal);
 }
 @Override
 public boolean equals(Object obj) {
  if (this == obj)
   return true;
  if (obj == null)
   return false;
  if (getClass() != obj.getClass())
   return false;
  Employee other = (Employee) obj;
  return Objects.equals(desig, other.desig) && eid == other.eid && Objects.equals(ename, other.ename)
    && Double.doubleToLongBits(esal) == Double.doubleToLongBits(other.esal);
 }
 
}