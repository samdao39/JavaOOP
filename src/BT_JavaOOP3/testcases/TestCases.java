package BT_JavaOOP3.testcases;


import BT_JavaOOP3.common.BaseTest;

import javax.imageio.stream.ImageInputStream;
import java.sql.SQLOutput;

public class TestCases extends BaseTest {
    public void loginCRM() {

        System.out.println("Mở trình duyệt và nhập URL: https://cms.anhtester.com/login");
        System.out.println("Nhập thông tin đăng nhập hợp lệ");
        System.out.println("Click vào nút Đăng nhập");
        System.out.println("chuyển hướng thành công đến trang admin ");
    }
        public void testLogin(){
            createDriver();
            loginCRM();
            closeDriver();
        }
        public void testAddCategory(){
            createDriver();
            loginCRM();
            System.out.println("Nhấn menu category đến trang category");
            System.out.println("Nhấn nut category");
            System.out.println("Nhấn nút save");
            closeDriver();

        }

    public static void main(String[] args) {
        TestCases testcase = new TestCases();
        testcase.testLogin();
        testcase.testAddCategory();
    }
    }



