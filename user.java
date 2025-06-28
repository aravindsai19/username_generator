import java.util.Scanner;

class user 
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = scanner.next();

        System.out.print("Enter your nickname: ");
        String nickname = scanner.next();

        String generatedUsername = name + "_" + nickname;
        System.out.println("Generated username: " + generatedUsername);

        scanner.close();
    }
}
