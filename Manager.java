import java.util.Scanner;

public class Manager extends User {
    private int expInYear;
    
    public Manager() {
        
    }
    public Manager(String code, String fullName, String email, String password, int expInYear) {
        super(code, fullName, email, password);
        this.expInYear = expInYear;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }
    @Override
    public void Input()
    {
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số năm kinh nghiệm: ");
        expInYear = scanner.nextInt();
    } 
    public static void RenderHeader() {
        User.RenderHeader();
        System.out.printf("%15s%n","Năm kinh nghiệm");
    } 
    @Override
    public void RenderInfo() {
        super.RenderInfo();
        System.out.printf("%15d%n", expInYear);
    }      
}