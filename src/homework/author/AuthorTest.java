package homework.author;

import java.util.Scanner;

public class AuthorTest {
    public static void main(String[] args) {

        AuthorStorage authorStorage = new AuthorStorage();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Քանի հեղինակ ունենք");
        int authorCount = scanner.nextInt();

        for (int i = 0; i < authorCount; i++) {
            System.out.println("Ներմուծել հեղինակի տվյալները");
            Author author = new Author();
            author.setName(scanner.next());
            author.setSurname(scanner.next());
            author.setEmail(scanner.next());
            author.setAge(scanner.nextInt());
            author.setGender(scanner.next());

            authorStorage.add(author);
        }
        authorStorage.print();
    }
}