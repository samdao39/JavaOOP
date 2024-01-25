package BT_JavaOOP2;

public class person {
  public   int age;
   public String name;
    public String gender;
  protected int salary;
    protected String address;
    protected int phone;

    public person(int age, String name,String gender, int salary, String address, int phone) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    protected int getSalary() {
        return salary;
    }

    protected String getAddress() {
        return address;
    }

    protected int getPhone() {
        return phone;
    }

    protected void getInfo(){
        System.out.println("tên:"+ name);
        System.out.println("tuổi:"+ age);
        System.out.println("DC:"+ address);
        System.out.println("luong:"+ salary);
        System.out.println("gioi tinh:"+ gender);
        System.out.println("sdt:"+ phone);

    }

}
