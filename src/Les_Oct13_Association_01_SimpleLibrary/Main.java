package Les_Oct13_Association_01_SimpleLibrary;
public class Main
{
    public static void main(String[] args) {
        Book02 b1 = new Book02("Harry Potter","JK. Rowling","127637627",2005);
        Book02 b2 = new Book02("Percy Jackson","Rick Riordan","172874726",2007);
        Book02 b3 = new Book02("Java Programming","Eliza Yoel","82738926",2023);
        Book02 b4 = new Book02("Winnie the Pooh","Disney","2873826478",2003);
        Book02 b5 = new Book02("Donald Duck","Walt Disney","18729362873",2010);

        Library02 l1 = new Library02();

        l1.addCollection(b1);
        l1.addCollection(b2);
        l1.addCollection(b3);
        l1.addCollection(b4);

        l1.printBookList();
    }
}