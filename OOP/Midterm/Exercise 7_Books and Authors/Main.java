import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Person> authors = new ArrayList<>();
        ArrayList<Book> book = new ArrayList<>();

        boolean selection = true;
        String decision;

        while (selection) {
            System.out.println("-----------------------------------------------");
            System.out.println("A: Add Authors");
            System.out.println("B: Add Book and Assign Authors");
            System.out.println("C: View Books and Authors");
            System.out.println("D: View Authors and Books");
            System.out.println("Q: Quit");
            System.out.print("Enter choice: ");
            decision = input.nextLine();
            System.out.println("-----------------------------------------------");

            switch (decision.toUpperCase()) {
                case "A":
                    addAuthors(authors);
                    break;
                case "B":
                    addBook(authors, book);
                    break;
                case "C":
                    bookAndAuthor(book);
                    break;
                case "D":
                    authorAndBook(authors, book);
                    break;
                case "Q":
                    selection = false;
                    break;

            }
        }

        input.close();
    }

    public static void addAuthors(ArrayList<Person> authors) {
        System.out.print("Enter Author Name: ");
        String name = input.nextLine();
        Person author = new Author(name);
        authors.add(author);
    }

    public static void addBook(ArrayList<Person> authors, ArrayList<Book> book) {
        System.out.print("Enter Book Title: ");
        String title = input.nextLine();
        Book newBook = new Book(title);

        while (true) {

            System.out.print("Enter Author Name: ");
            String name = input.nextLine();
            Person author = new Author(name);
            boolean flag = false;
            for (int i = 0; i < authors.size(); i++) {
                if (authors.get(i).getName().equals(name)) {
                    newBook.addAuthor((Author) author);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println("Author does not exist!");
                continue;
            }

            System.out.print("Do you want to add another author? (Y/N): ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("n")) {
                break;
            }
        }

        book.add(newBook);
    }

    public static void bookAndAuthor(ArrayList<Book> book) {
        System.out.println("Books\t\tAuthors");

        for (Book x : book) {
            System.out.print(x.getTitle() + "\t\t");
            List<Author> authors = x.getAuthors();
            for (int i = 0; i < authors.size(); i++) {
                System.out.print(authors.get(i).getName());
                if (i != authors.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void authorAndBook(ArrayList<Person> authors, ArrayList<Book> book) {

        System.out.println("Authors\t\tBooks");

        for (Person x : authors) {
            System.out.print(x.getName() + "\t\t");
            for (Book y : book) {
                for (Author searchAuthor : y.getAuthors()) {
                    if (searchAuthor.getName().equals(x.getName())) {
                        System.out.print(y.getTitle() + ", ");
                    }
                }
            }
            System.out.println();
        }
    }
}
