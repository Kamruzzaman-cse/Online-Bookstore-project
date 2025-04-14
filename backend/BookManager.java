import java.util.*;
class Book {
    int bookId;
    String name;
    String author;
    String filename;
    int price;
    int stock;

    public Book(int bookId, String name, String author, String filename, int price, int stock) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.filename = filename;
        this.price = price;
        this.stock = stock;
    }

    public void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Filename: " + filename);
        System.out.println("Price: ৳" + price);
        System.out.println("Stock: " + stock);
        System.out.println("--------------------------");
    }
}

class Cart {
    int totalItems = 0;
    int totalPrice = 0;

    public void addToCart(Book book) {
        totalItems++;
        totalPrice += book.price;
        System.out.println("✅ Book added to cart: " + book.name);
        System.out.println("🛒 Total Items: " + totalItems);
        System.out.println("💰 Total Price: ৳" + totalPrice);
        System.out.println();
    }
}

public class BookManager {
    private List<Book> bookList = new ArrayList<>();
    private Cart cart = new Cart();

    public BookManager() {
        addBooks();
    }

    private void addBooks() {
        bookList.add(new Book(2301, "Introduction to Computer Science", "Parry Donham", "download1", 200, 50));
        bookList.add(new Book(2302, "IndoBangla | Handbook of Computer Science & IT", "Arihant Experts", "download2", 220, 60));
        bookList.add(new Book(2303, "The History of Bangladesh", "Md.Mominul Haque", "download3", 250, 70));
        bookList.add(new Book(2304, "আমার বাংলা বই,৫ম শ্রেণি", "NCTB", "download4", 180, 40));
        bookList.add(new Book(2305, "আমার বাংলা বই,৩য় শ্রেণি", "Author 5", "download5", 300, 30));
        bookList.add(new Book(2306, "Textbook Computer Science With Python", "V K Pandey", "download6", 150, 80));
        bookList.add(new Book(2307, "HSC English", "Saifur Rahman Khan", "download7", 275, 45));
        bookList.add(new Book(2308, "আজ আমি কোথায় যাবো", "হুমায়ূন আহমেদ", "download8", 350, 100));
        bookList.add(new Book(2309, "বৃষ্টি বিলাশ", "হুমায়ূন আহমেদ", "download8", 350, 100));
        
        bookList.add(new Book(2310, "আমিই মিসির আলি", "হুমায়ূন আহমেদ", "download10", 450, 60));
        bookList.add(new Book(2311, "আমার শত্রু আমি", "মাহমুদ বিন নুর", "download11", 500, 90));
        bookList.add(new Book(2312, "মিসির আলি অমনিবাস", "হুমায়ূন আহমেদ", "download12", 600, 30));
        bookList.add(new Book(2313, "আমি মানুষ", "সরদার ফজলুল করিম", "download13", 700, 25));
        bookList.add(new Book(2314, "চলেন খিচুড়ি খাই (হার্ডকভার)", "মাসফিক এনাম তূর্য", "download14", 800, 15));
        bookList.add(new Book(2316, "Islamic Calligraphy", "Vizier Ibn Muqla", "download16", 350, 20));
        bookList.add(new Book(2317, "আর রাহিকুল মাখতুম",  "মাহমুদুল হক জালীস", "download17", 400, 30));
        bookList.add(new Book(2317, "Islami Motivation",  "মাহমুদুল হক জালীস", "download17", 400, 30));
        
        bookList.add(new Book(2319, "আমি পদ্মজা", "ইলমা বেহরোজ", "download19", 500, 10));
        bookList.add(new Book(2320, "প্রোগ্রামিং কনটেস্ট সমস্যা ও সমাধান", "মাহবুবুল হাসান", "download20", 550, 80));
        bookList.add(new Book(2321, "পাইথন দিয়ে প্রোগ্রামিং শেখা", "তামিম শাহরিয়ার সুবিন", "download21", 600, 90));
        bookList.add(new Book(2322, "কোহিনূর", "লাবণ্য ইয়াসমিন", "download22", 650, 100));
        bookList.add(new Book(2323, "মেঘ বলেছে যাব যাব", "হুমায়ূন আহমেদ", "download23", 700, 70));
        bookList.add(new Book(2324, "কথায় কথায় English", "রোকসানা আক্তার রুপী", "download24", 750, 60));
        bookList.add(new Book(2325, "আশারীন", "আদেল পারভেজ", "download25", 800, 50));
        bookList.add(new Book(2326, "জাভা থ্রেড প্রোগ্রামিং", "আ ন ম বজলুর রহমান", "download26", 850, 40));
        bookList.add(new Book(2327, "Harry Potter and the Philosophers Stone", "J. K. Rowling", "download27", 900, 80));
        bookList.add(new Book(2328, "আলাদিন", "আহনাফ তাহমিদ", "download28", 950, 65));
        bookList.add(new Book(2329, "Principles of Marketing", "Philip Kotler", "download29", 1000, 90));
        bookList.add(new Book(2330, "Business Statistics", "Dr. S.C. Aggarwal and Dr. R.K. Rana", "download30", 1050, 60));
    }

    public Book getBookById(int bookId) {
        for (Book b : bookList) {
            if (b.bookId == bookId) return b;
        }
        return null;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("📚 Welcome to Online Bookstore");
        System.out.print("👤 Enter Username: ");
        String user = scanner.nextLine();
        System.out.print("🔑 Enter Password: ");
        String pass = scanner.nextLine();

        if (!user.equals("amit111") || !pass.equals("amit111")) {
            System.out.println("Invalid username or password");
            return;
        }

        while (true) {
            System.out.println("\nSearch by Book ID ");
            int id = scanner.nextInt();
            if (id == 0) break;

            Book book = getBookById(id);
            if (book != null) {
                System.out.println("📖 Book Found:");
                book.display();
                System.out.print("➕ Add to Cart? (y/n): ");
                String choice = scanner.next();
                if (choice.equalsIgnoreCase("y")) {
                    cart.addToCart(book);
                }
            } else {
                System.out.println("Book ID not found.");
            }
        }

        System.out.println("🛒 Final Cart Summary:");
        System.out.println("📦 Total Items: " + cart.totalItems);
        System.out.println("💵 Total Price: ৳" + cart.totalPrice);
    }

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        manager.run();
    }
}
