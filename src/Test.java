import java.io.File;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        /*
        读文件
         */
        File file=new File("C:\\Users\\lenovo\\IdeaProjects\\CmdshopA\\src\\user.xlsx");
        ReadExcel readexcel=new ReadExcel();//创建对象
        User users[]=readexcel.readExcel(file);
        System.out.println("请输入用户名");
        Scanner sc=new Scanner(System.in);
        String username=sc.next();

        System.out.println("请输入密码");
        String pasword=sc.next();
        for(User user:users){

        }
    }


}
