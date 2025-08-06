import java.util.Scanner;
import java.util.regex.Pattern;

class User {
    private String code;
    private String fullName;
    private String email;
    private String password;
    
    public User() {
    }
    public User(String code, String fullName, String email, String password) {
        this.code = code;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }
    public String getCode() {
        return code;
    }
    public String getFullName() {
        return fullName;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setEmail(String email) {
        String EMAL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern patternPass = Pattern.compile(EMAL_REGEX);
        this.email = patternPass.matcher(email).matches() ? email : "";
    }
    public void setPassword(String password) {
        String PASS_REGEX = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!]).{6,20})";
        Pattern patternPass = Pattern.compile(PASS_REGEX);
        this.password = patternPass.matcher(password).matches() ? password : "";            
    } 
    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mã: ");
        code = scanner.nextLine();
        System.out.print("Họ tên: ");
        fullName = scanner.nextLine();
        System.out.print("Email: ");
        setEmail(scanner.nextLine());
        System.out.print("Mật khẩu: ");
        setPassword(scanner.nextLine());
        //scanner.close();
    }  
    public static void RenderHeader() {
        System.out.printf("%-15s%-15s%-15s%-15s","Mã", "Họ tên", "Email", "Mật khẩu");
    } 
    public void RenderInfo() {
        System.out.printf("%-15s%-15s%-15s%-15s", code, fullName, email, password);
    } 
}