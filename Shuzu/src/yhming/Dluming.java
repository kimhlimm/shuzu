package yhming;

import java.util.Scanner;

public class Dluming {
	public static void main(String[]args) {
		String username = "jinxiaolin";
		String password = "jinmeixian";
		//用循环实现多次机会\
		for(int i=0;i<3;i++){
		
		Scanner ab = new Scanner(System.in);
		
		System.out.println("请输入用户名：");
		String name = ab.next();
		System.out.println("请输入密码");
		String pwd = ab.next();
		
		if(name.equals(username)&&pwd.equals(password)) {
			System.out.println("登陆成功");
			break;
		}else {
			if(2-i==0) {
				System.out.println("你的账户已被锁定，请与管理员联系");
			}else {
				System.out.println("登录失败,你还有"+(2-i)+"机会");
			}
				
		}
		
		
	}
		
		
	}
}


