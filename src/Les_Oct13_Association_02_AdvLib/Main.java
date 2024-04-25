package Les_Oct13_Association_02_AdvLib;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);

        Book b1 = new Book("Harry Potter","JK.Rowling");
        Book b2 = new Book("48 Laws of Power","Jordan King");
        Book b3 = new Book("The Atomic Habits","V.Mason");
        Book b4 = new Book("Three Little Pigs","Walt Disney");

        Member m1 = new Member("Eliza");
        Member m2 = new Member("Clarissa");
        Member m3 = new Member("Kayla");
        Member m4 = new Member("Eliana");

        Library lib = new Library("KL Library 1");
        lib.addBook(b1); lib.addBook(b2); lib.addBook(b3); lib.addBook(b4);
        lib.addMember(m1); lib.addMember(m2); lib.addMember(m3); lib.addMember(m4);

        int menu = -1;
        while(menu != 3){
            System.out.println("1. Register as Staff");
            System.out.println("2. Member");
            System.out.println("3. Exit");
            menu = scanInt.nextInt();

            if(menu == 1){
                Staff s1 = new Staff("Lala","123");
                Staff s2 = new Staff("Lili","456");
                lib.addStaff(s1);
                lib.addStaff(s2);

                // LOGIN STAFF
                System.out.println("Enter your name : ");
                String nama = scanStr.nextLine();
                System.out.println("Enter password : ");
                String password = scanStr.nextLine();

                boolean staffLoggedIn = false;

                for (int i = 0; i < lib.getCouStaff(); i++) {
                    Staff staff = lib.getStaff(i); // masukin array staff ke i ke variable staff
                    if(staff != null && staff.getNama().equalsIgnoreCase(nama) && staff.getPassword().equalsIgnoreCase(password)){
                        staffLoggedIn = true;
                        break;
                    }
                }
                if (staffLoggedIn) {
                    int opt = -1;
                    while(opt != 5){
                        System.out.println("1. Add new book collection");
                        System.out.println("2. Remove book collection");
                        System.out.println("3. Add new member");
                        System.out.println("4. Remove member");
                        System.out.println("5. Exit");
                        opt = scanInt.nextInt();

                        if (opt == 1) {
                            System.out.println("Book title : ");
                            String title = scanStr.nextLine();
                            System.out.println("Book author : ");
                            String author = scanStr.nextLine();

                            Book a = new Book(title,author);
                            lib.addBook(a);

                            // lib.addBook(newBook(title,author)); JUGA BISA
                        } else if (opt == 2) {
                            System.out.println("Book title : ");
                            String title = scanStr.nextLine();

                            Book bookToRemove = null;
                            for (int i = 0; i < lib.getCouBook(); i++) {
                                if(lib.getBook(i).getTitle().equalsIgnoreCase(title)){
                                    bookToRemove = lib.getBook(i);
                                    break;
                                }
                            }
                            if(bookToRemove != null){
                                lib.removeBook(bookToRemove);
                                System.out.println("Successfully remove book");
                            }else {
                                System.out.println("Book not found in the library");
                            }
                        } else if (opt == 3) {

                        } else if (opt == 4) {

                        } else {
                            System.out.println("Invalid choice");
                        }
                    }
                }
            }else if(menu == 2){
                int opt = -1;
                while(opt != 0){
                    System.out.println("1. View borrowed book list");
                    System.out.println("2. Borrow book");
                    System.out.println("3. Return book");
                }
            }else{
                System.out.println("Invalid choice");
            }
        }
    }
}
