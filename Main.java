import java.util.Scanner;

public class Main {
	static int n = 0;
	static User[] users = new User[10];

	private static void Menu() {
		System.out.println("1. Nhập thông tin nhân viên");
		System.out.println("2. Nhập thông tin người quản lý");
		System.out.println("3. In danh sách");
		System.out.println("4. Thoát");
	}

	static void Input(User user) {
		user.Input();
		users[n++] = user;
	}

	static void Output() {
		System.out.println("LIST OF USERS");
		Manager.RenderHeader();
		for (int i = 0; i < n; i++) {
			if (users[i] instanceof Manager)
				users[i].RenderInfo();
		}
		Employee.RenderHeader();
		for (int i = 0; i < n; i++) {
			if (users[i] instanceof Employee)
				users[i].RenderInfo();
		}
	}
//đây là Huy Hoàng

//Đây là Cao Chung

//test
	public static void main(String[] args) {
		int choice = 0;
		while (true) {
			Menu();
			Scanner scanner = new Scanner(System.in);
			choice = scanner.nextInt();
			// scanner.close();
			switch (choice) {
			case 1 -> Input(new Employee());
			case 2 -> Input(new Manager());
			case 3 -> Output();
			case 4 -> {
				return;
			}
			}
		}
	}
}