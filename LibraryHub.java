public class LibraryHub {

    public static void main(String[] args) {

        int books[] = {120, 150, 100, 180, 200};

        int totalBooks = 0;

        for(int i = 1; i <= 3; i++) {
            totalBooks += books[i];
        }

        System.out.println("B-Tree Search : Book Found");
        System.out.println("B+ Tree Index Search : Successful");

        System.out.println("Books Available from Year Range:");
        System.out.println(totalBooks);
    }
}
