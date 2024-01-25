package BT_JavaOOP1;

public class NhanVien {
int age;
String name;
int salary;
String address;

    public NhanVien(int age, String name, int salary, String address) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
public void getInfo(){
    System.out.println("tên:"+ name);
    System.out.println("tuổi:"+ age);
    System.out.println("DC:"+ address);
    System.out.println("luong:"+ salary);
}

}
