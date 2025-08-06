import java.util.Scanner;

public class Employee extends User {
    private String proSkill;
    
    public Employee() {
    }

    public Employee(String code, String fullName, String email, String password, String proSkill) {
        super(code, fullName, email, password);
        this.proSkill = proSkill;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }   
    @Override
    public void Input()
    {
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kỹ năng: ");
        proSkill = scanner.nextLine();
        //scanner.close();
    } 
    public static void RenderHeader() {
        User.RenderHeader();
        System.out.printf("%-15s%n","Kỹ năng");
    } 
    @Override
    public void RenderInfo() {
        super.RenderInfo();
        System.out.printf("%-15s%n", proSkill);
    }      
}
