package BT_JavaOOP2.company;

import BT_JavaOOP2.person;

public class Company{
//
//
//    public Company(int age, String name,String gender, int salary, String address, int phone) {
//        super(age, name, gender,salary, address,phone);
//    }
//
//    public static void main(String[] args) {
//        Company com = new Company(18,"sam","Nu",1000,"123nht",123123);
//        com.getInfo();
//
//        //        person per = new person(18,"sam","Nu",1000,"123nht",0905123123);
////        per.getInfo();
//
//    }
//

    public static void main(String[] args) {
        person per = new person(17,"sam", "Nu",12000,"123nht",123123);
        System.out.println(per.age);
        System.out.println(per.name);
        System.out.println(per.gender);
    }
}